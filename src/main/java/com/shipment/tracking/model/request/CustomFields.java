package com.shipment.tracking.model.request;

import java.io.Serializable;

public class CustomFields implements Serializable {

    private static final long SerialVersionUID = 10l;

    public String product_name;
    public String product_price;

    public CustomFields() {
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }
}