package com.shipment.tracking.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shipment.tracking.model.request.CreateTracking;
import com.shipment.tracking.model.response.ShipmentTrackingCustomResponse;
import com.shipment.tracking.model.response.ShipmentTrackingResponse;

/**
 * Service interface for Shipment trackings
 *
 * @Author : Malli
 */
public interface ShipmentTrackingService {

    /**
     * This method used to create the shipment tracking record with aftership
     * @param createTracking
     * @return
     * @throws JsonProcessingException
     */
    public String createShipmentTracking(CreateTracking createTracking);

    /**
     * This method user to get the tracking info from aftership
     * @param slug
     * @param trackingNumber
     * @return
     */
    public ShipmentTrackingCustomResponse getTrackingInfoByTrackingNumber(String slug, String trackingNumber);
}
