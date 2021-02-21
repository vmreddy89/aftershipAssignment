package com.shipment.tracking.controller;

import com.shipment.tracking.model.request.CreateTracking;
import com.shipment.tracking.model.response.ShipmentTrackingCustomResponse;
import com.shipment.tracking.model.response.ShipmentTrackingResponse;
import com.shipment.tracking.service.ShipmentTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Shipment tracking related APIs will be here
 *
 * @Author : Malli
 */
@RestController
public class ShipmentTracking {

    @Autowired
    ShipmentTrackingService shipmentTrackingService;

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> createShipmentTracking(@Valid @RequestBody CreateTracking createTracking) {
        String response = shipmentTrackingService.createShipmentTracking(createTracking);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/getTrackingInfo/{slug}/{trackingNumber}")
    public ResponseEntity<ShipmentTrackingCustomResponse> getTrackingInfo(@PathVariable(name = "slug", required = true) String slug,
                                                                    @PathVariable(name = "trackingNumber", required = true) String trackingNumber) {
        ShipmentTrackingCustomResponse shipmentTrackingcustomResponse = shipmentTrackingService.getTrackingInfoByTrackingNumber(slug, trackingNumber);
        return new ResponseEntity<>(shipmentTrackingcustomResponse, HttpStatus.OK);
    }

}
