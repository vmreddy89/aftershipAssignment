package com.shipment.tracking.model.response;

import java.io.Serializable;

public class Meta implements Serializable {

    private static final long SerialVersionUID = 10l;

    private int code;

    public Meta(){

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
