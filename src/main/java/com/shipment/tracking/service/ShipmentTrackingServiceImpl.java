package com.shipment.tracking.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shipment.tracking.model.request.CreateTracking;
import com.shipment.tracking.model.response.ShipmentTrackingCustomResponse;
import com.shipment.tracking.model.response.ShipmentTrackingResponse;
import com.shipment.tracking.model.response.Tracking;
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
    public String createShipmentTracking(CreateTracking createTracking)  {

        HttpHeaders httpHeaders = getHttpHeaders();
        try {
            HttpEntity<String> httpEntity = new HttpEntity<>(objectMapper.writeValueAsString(createTracking), httpHeaders);
            return restTemplate.postForObject(trackingUrl, httpEntity, String.class);
        } catch (HttpStatusCodeException httpStatusCodeException) {
            throw httpStatusCodeException;
        } catch (Exception ex){
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
            throw httpStatusCodeException;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    private HttpHeaders getHttpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("aftership-api-key", aftershipApiKey);
        httpHeaders.set("Content-Type", "application/json");
        return httpHeaders;
    }

    private ShipmentTrackingCustomResponse getShipmentTrackingCustomResponse(Tracking tracking){
        ShipmentTrackingCustomResponse shipmentTrackingCustomResponse = new ShipmentTrackingCustomResponse();
        shipmentTrackingCustomResponse.setId(tracking.getId());
        shipmentTrackingCustomResponse.setOrigin(tracking.getPickup_location());
        shipmentTrackingCustomResponse.setDestination((String)tracking.getCourier_destination_country_iso3());
        shipmentTrackingCustomResponse.setTrackingNumber(tracking.getTracking_number());
        shipmentTrackingCustomResponse.setCourierCode(tracking.getSlug());
        shipmentTrackingCustomResponse.setCurrentStatus(tracking.getTag());
        return shipmentTrackingCustomResponse;
    }
}
