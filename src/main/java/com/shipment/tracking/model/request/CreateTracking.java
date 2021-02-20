package com.shipment.tracking.model.request;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * Request model of creation of tracking
 *
 * @Author : Malli
 */
public class CreateTracking implements Serializable {
    private static final long SerialVersionUID = 10l;

    @Valid
    private Tracking tracking;

    public CreateTracking(Tracking tracking) {
        this.tracking = tracking;
    }

    public CreateTracking() {
    }

    public Tracking getTracking() {
        return tracking;
    }

    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }



}
