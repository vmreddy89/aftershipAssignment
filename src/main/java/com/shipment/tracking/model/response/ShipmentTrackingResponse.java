package com.shipment.tracking.model.response;

import java.io.Serializable;

/**
 * Shipment tracking response for get trackings API
 *
 * @Author : Malli
 */
public class ShipmentTrackingResponse implements Serializable {

    private static final long SerialVersionUID = 10l;

    private Meta meta;
    private Data data;

    public ShipmentTrackingResponse(){}

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
