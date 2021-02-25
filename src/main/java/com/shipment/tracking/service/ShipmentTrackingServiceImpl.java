package com.shipment.tracking.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shipment.tracking.constants.ShipmentTrackingConstants;
import com.shipment.tracking.model.request.CreateTracking;
import com.shipment.tracking.model.response.ShipmentTrackingCustomResponse;
import com.shipment.tracking.model.response.ShipmentTrackingResponse;
import com.shipment.tracking.model.response.Tracking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@Service
public class ShipmentTrackingServiceImpl implements ShipmentTrackingService {

    private static Logger LOGGER = LoggerFactory.getLogger(ShipmentTrackingServiceImpl.class);

    @Value("${aftership.tracking.url}")
    private String trackingUrl;

    @Value("${aftership.tracking.api.key}")
    private String aftershipApiKey;

    @Autowired
    RestTemplate restTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @param createTracking
     * @return
     * @throws JsonProcessingException
     */
    @Override
    public String createShipmentTracking(CreateTracking createTracking) {

        HttpHeaders httpHeaders = getHttpHeaders();
        try {
            HttpEntity<String> httpEntity = new HttpEntity<>(objectMapper.writeValueAsString(createTracking), httpHeaders);
            return restTemplate.postForObject(trackingUrl, httpEntity, String.class);
        } catch (HttpStatusCodeException httpStatusCodeException) {
            LOGGER.error("Exception occured during creation of aftership shipment tracking object:" + httpStatusCodeException.getMessage());
            throw httpStatusCodeException;
        } catch (Exception ex) {
            LOGGER.error("Exception occured during creation of aftership shipment tracking object:" + ex.getMessage());
            throw new RuntimeException(ex);
        }
    }

    /**
     * @param slug
     * @param trackingNumber
     * @return
     */
    @Override
    public ShipmentTrackingCustomResponse getTrackingInfoByTrackingNumber(String slug, String trackingNumber) {

        ResponseEntity<Object> response;
        HttpHeaders httpHeaders = getHttpHeaders();

        HttpEntity<Object> httpEntity = new HttpEntity<>(httpHeaders);

        StringBuilder shipmentTrackingUrl = new StringBuilder(trackingUrl)
                .append("/")
                .append(slug)
                .append("/")
                .append(trackingNumber);
        try {
            ShipmentTrackingResponse shipmentTrackingResponse = restTemplate.exchange(
                    shipmentTrackingUrl.toString(), HttpMethod.GET, httpEntity, ShipmentTrackingResponse.class).getBody();
            return getShipmentTrackingCustomResponse(shipmentTrackingResponse.getData().getTracking());

        } catch (HttpStatusCodeException httpStatusCodeException) {
            LOGGER.error("Exception occured during getting the tracking info of shipment with Aftership:" + httpStatusCodeException.getMessage());
            throw httpStatusCodeException;
        } catch (Exception ex) {
            LOGGER.error("Exception occured during getting the tracking info of shipment with Aftership::" + ex.getMessage());
            throw new RuntimeException(ex);
        }
    }

    private HttpHeaders getHttpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(ShipmentTrackingConstants.AFTERSHIP_API_KEY, aftershipApiKey);
        httpHeaders.set(ShipmentTrackingConstants.CONTENT_TYPE, ShipmentTrackingConstants.APPLICATION_JSON);
        return httpHeaders;
    }

    private ShipmentTrackingCustomResponse getShipmentTrackingCustomResponse(Tracking tracking) {
        ShipmentTrackingCustomResponse shipmentTrackingCustomResponse = new ShipmentTrackingCustomResponse();
        shipmentTrackingCustomResponse.setId(tracking.getId());
        shipmentTrackingCustomResponse.setOrigin(tracking.getPickup_location());
        shipmentTrackingCustomResponse.setDestination((String) tracking.getCourier_destination_country_iso3());
        shipmentTrackingCustomResponse.setTrackingNumber(tracking.getTracking_number());
        shipmentTrackingCustomResponse.setCourierCode(tracking.getSlug());
        shipmentTrackingCustomResponse.setCurrentStatus(tracking.getTag());
        return shipmentTrackingCustomResponse;
    }
}
