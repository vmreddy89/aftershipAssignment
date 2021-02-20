package com.shipment.tracking.model.request;


import com.shipment.tracking.custom.annotation.ValidCourierCodeCategory;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

public class Tracking implements Serializable {

    private static final long SerialVersionUID = 10l;

    @NotNull(message = "Courier Code is required")
    @ValidCourierCodeCategory
    // this is courier code
    public String slug;
    @NotNull(message = "Tracking number is required")
    public String tracking_number;

    public String title;
    public List<String> smses;
    public List<String> emails;
    public String order_id;
    public String order_id_path;
    public CustomFields custom_fields;
    public String language;
    public String order_promised_delivery_date;
    public String delivery_type;
    @NotNull(message = "Destination Address is required")
    // This is considered as destination address
    public String pickup_location;
    public String pickup_note;
    public String tracking_postal_code;
    public String tracking_ship_date;
    public String tracking_account_number;
    public String tracking_key;
    public String tracking_origin_country;
    public String tracking_destination_country;
    public String tracking_state;
    @NotNull(message = "Origin Address is required")
    // This is considered as orgin address
    public String origin_country_iso3;
    public String destination_country_iso3;


    public Tracking() {
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getSmses() {
        return smses;
    }

    public void setSmses(List<String> smses) {
        this.smses = smses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_id_path() {
        return order_id_path;
    }

    public void setOrder_id_path(String order_id_path) {
        this.order_id_path = order_id_path;
    }

    public CustomFields getCustom_fields() {
        return custom_fields;
    }

    public void setCustom_fields(CustomFields custom_fields) {
        this.custom_fields = custom_fields;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOrder_promised_delivery_date() {
        return order_promised_delivery_date;
    }

    public void setOrder_promised_delivery_date(String order_promised_delivery_date) {
        this.order_promised_delivery_date = order_promised_delivery_date;
    }

    public String getDelivery_type() {
        return delivery_type;
    }

    public void setDelivery_type(String delivery_type) {
        this.delivery_type = delivery_type;
    }

    public String getPickup_location() {
        return pickup_location;
    }

    public void setPickup_location(String pickup_location) {
        this.pickup_location = pickup_location;
    }

    public String getPickup_note() {
        return pickup_note;
    }

    public void setPickup_note(String pickup_note) {
        this.pickup_note = pickup_note;
    }

    public String getTracking_postal_code() {
        return tracking_postal_code;
    }

    public void setTracking_postal_code(String tracking_postal_code) {
        this.tracking_postal_code = tracking_postal_code;
    }

    public String getTracking_ship_date() {
        return tracking_ship_date;
    }

    public void setTracking_ship_date(String tracking_ship_date) {
        this.tracking_ship_date = tracking_ship_date;
    }

    public String getTracking_account_number() {
        return tracking_account_number;
    }

    public void setTracking_account_number(String tracking_account_number) {
        this.tracking_account_number = tracking_account_number;
    }

    public String getTracking_key() {
        return tracking_key;
    }

    public void setTracking_key(String tracking_key) {
        this.tracking_key = tracking_key;
    }

    public String getTracking_origin_country() {
        return tracking_origin_country;
    }

    public void setTracking_origin_country(String tracking_origin_country) {
        this.tracking_origin_country = tracking_origin_country;
    }

    public String getTracking_destination_country() {
        return tracking_destination_country;
    }

    public void setTracking_destination_country(String tracking_destination_country) {
        this.tracking_destination_country = tracking_destination_country;
    }

    public String getTracking_state() {
        return tracking_state;
    }

    public void setTracking_state(String tracking_state) {
        this.tracking_state = tracking_state;
    }

    public String getOrigin_country_iso3() {
        return origin_country_iso3;
    }

    public void setOrigin_country_iso3(String origin_country_iso3) {
        this.origin_country_iso3 = origin_country_iso3;
    }

    public String getDestination_country_iso3() {
        return destination_country_iso3;
    }

    public void setDestination_country_iso3(String destination_country_iso3) {
        this.destination_country_iso3 = destination_country_iso3;
    }
}
