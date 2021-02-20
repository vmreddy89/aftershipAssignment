package com.shipment.tracking.model.response;

import java.io.Serializable;

public class Data implements Serializable {

    private static final long SerialVersionUID = 10l;

    Tracking tracking;

    public Tracking getTracking() {
        return tracking;
    }

    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }
}
