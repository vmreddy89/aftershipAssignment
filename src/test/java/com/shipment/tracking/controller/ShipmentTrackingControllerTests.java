package com.shipment.tracking.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shipment.tracking.model.request.CreateTracking;
import com.shipment.tracking.model.request.Tracking;
import com.shipment.tracking.model.response.ShipmentTrackingCustomResponse;
import com.shipment.tracking.model.response.ShipmentTrackingResponse;
import com.shipment.tracking.service.ShipmentTrackingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import javax.sound.midi.Track;

import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ShipmentTrackingControllerTests {

    @MockBean
    private ShipmentTrackingServiceImpl shipmentTrackingService;

    @Autowired
    private MockMvc mockMvc;

    CreateTracking createTracking;

    @BeforeEach
    public void init() {
        createTracking = new CreateTracking();
        Tracking tracking = new Tracking();
        tracking.setSlug("FedEx");
        tracking.setTracking_number("123456789");
        tracking.setPickup_location("KPHB, Hyderabad");
        tracking.setOrigin_country_iso3("USA");
        createTracking.setTracking(tracking);
    }

    @Test
    public void createShipmentTrackingTest() throws Exception {
        String response = "success";
        org.mockito.Mockito.when(shipmentTrackingService.createShipmentTracking(createTracking)).thenReturn(response);
        mockMvc.perform(post("/create").contentType(MediaType.APPLICATION_JSON).
                content(asJsonString(createTracking))).andExpect(status().isOk());
    }

    @Test
    public void createShipmentTrackingBadRequestTest() throws Exception {
        String response = "bad Request";
        org.mockito.Mockito.when(shipmentTrackingService.createShipmentTracking(createTracking)).thenReturn(response);
        mockMvc.perform(post("/create").contentType(MediaType.APPLICATION_JSON).
                content(asJsonString(null))).andExpect(status().isBadRequest());
    }

    @Test
    public void getTrackingInfoTest() throws Exception {
        ShipmentTrackingCustomResponse shipmentTrackingResponse = new ShipmentTrackingCustomResponse();
        String slug = "usps";
        String trackingNumber = "12345";
        org.mockito.Mockito.when(shipmentTrackingService.getTrackingInfoByTrackingNumber(anyString(),anyString())).thenReturn(shipmentTrackingResponse);
        mockMvc.perform(get("/getTrackingInfo/usps/940011169900035246030/")).andExpect(status().isOk());
    }

    @Test
    public void getTrackingInfoBadRequestTest() throws Exception {
        // missing path param
        mockMvc.perform(get("/getTrackingInfo/940011169900035246030/")).andExpect(status().is4xxClientError());
    }

    private static String asJsonString(final Object obj){
        try{
            return new ObjectMapper().writeValueAsString(obj);
        }catch (Exception e){
            throw new RuntimeException("error when wrap json");
        }
    }
}
