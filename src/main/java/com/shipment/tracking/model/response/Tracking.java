package com.shipment.tracking.model.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Tracking implements Serializable {

    private static final long SerialVersionUID = 10l;

    private String id;
    private Date created_at;
    private Date updated_at;
    private Date last_updated_at;
    private String tracking_number;
    private String slug;
    private boolean active;
    private List<Object> android;
    private Object custom_fields;
    private Object customer_name;
    private int delivery_time;
    private Object destination_country_iso3;
    private Object courier_destination_country_iso3;
    private List<Object> emails;
    private Object expected_delivery;
    private List<Object> ios;
    private Object note;
    private Object order_id;
    private Object order_id_path;
    private Object order_date;
    private Object origin_country_iso3;
    private int shipment_package_count;
    private Object shipment_pickup_date;
    private Object shipment_delivery_date;
    private Object shipment_type;
    private Object shipment_weight;
    private Object shipment_weight_unit;
    private Object signed_by;
    private List<Object> smses;
    private String source;
    private String tag;
    private String subtag;
    private String subtag_message;
    private String title;
    private int tracked_count;
    private Object last_mile_tracking_supported;
    private Object language;
    private String unique_token;
    private List<Object> checkpoints;
    private List<Object> subscribed_smses;
    private List<Object> subscribed_emails;
    private boolean return_to_sender;
    private Object tracking_account_number;
    private Object tracking_origin_country;
    private Object tracking_destination_country;
    private Object tracking_key;
    private Object tracking_postal_code;
    private Object tracking_ship_date;
    private Object tracking_state;
    private String order_promised_delivery_date;
    private String delivery_type;
    private String pickup_location;
    private String pickup_note;
    private String courier_tracking_link;
    private String courier_redirect_link;
    private Object first_attempted_at;

    public Tracking(){}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getLast_updated_at() {
        return last_updated_at;
    }

    public void setLast_updated_at(Date last_updated_at) {
        this.last_updated_at = last_updated_at;
    }

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Object> getAndroid() {
        return android;
    }

    public void setAndroid(List<Object> android) {
        this.android = android;
    }

    public Object getCustom_fields() {
        return custom_fields;
    }

    public void setCustom_fields(Object custom_fields) {
        this.custom_fields = custom_fields;
    }

    public Object getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(Object customer_name) {
        this.customer_name = customer_name;
    }

    public int getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(int delivery_time) {
        this.delivery_time = delivery_time;
    }

    public Object getDestination_country_iso3() {
        return destination_country_iso3;
    }

    public void setDestination_country_iso3(Object destination_country_iso3) {
        this.destination_country_iso3 = destination_country_iso3;
    }

    public Object getCourier_destination_country_iso3() {
        return courier_destination_country_iso3;
    }

    public void setCourier_destination_country_iso3(Object courier_destination_country_iso3) {
        this.courier_destination_country_iso3 = courier_destination_country_iso3;
    }

    public List<Object> getEmails() {
        return emails;
    }

    public void setEmails(List<Object> emails) {
        this.emails = emails;
    }

    public Object getExpected_delivery() {
        return expected_delivery;
    }

    public void setExpected_delivery(Object expected_delivery) {
        this.expected_delivery = expected_delivery;
    }

    public List<Object> getIos() {
        return ios;
    }

    public void setIos(List<Object> ios) {
        this.ios = ios;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public Object getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Object order_id) {
        this.order_id = order_id;
    }

    public Object getOrder_id_path() {
        return order_id_path;
    }

    public void setOrder_id_path(Object order_id_path) {
        this.order_id_path = order_id_path;
    }

    public Object getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Object order_date) {
        this.order_date = order_date;
    }

    public Object getOrigin_country_iso3() {
        return origin_country_iso3;
    }

    public void setOrigin_country_iso3(Object origin_country_iso3) {
        this.origin_country_iso3 = origin_country_iso3;
    }

    public int getShipment_package_count() {
        return shipment_package_count;
    }

    public void setShipment_package_count(int shipment_package_count) {
        this.shipment_package_count = shipment_package_count;
    }

    public Object getShipment_pickup_date() {
        return shipment_pickup_date;
    }

    public void setShipment_pickup_date(Object shipment_pickup_date) {
        this.shipment_pickup_date = shipment_pickup_date;
    }

    public Object getShipment_delivery_date() {
        return shipment_delivery_date;
    }

    public void setShipment_delivery_date(Object shipment_delivery_date) {
        this.shipment_delivery_date = shipment_delivery_date;
    }

    public Object getShipment_type() {
        return shipment_type;
    }

    public void setShipment_type(Object shipment_type) {
        this.shipment_type = shipment_type;
    }

    public Object getShipment_weight() {
        return shipment_weight;
    }

    public void setShipment_weight(Object shipment_weight) {
        this.shipment_weight = shipment_weight;
    }

    public Object getShipment_weight_unit() {
        return shipment_weight_unit;
    }

    public void setShipment_weight_unit(Object shipment_weight_unit) {
        this.shipment_weight_unit = shipment_weight_unit;
    }

    public Object getSigned_by() {
        return signed_by;
    }

    public void setSigned_by(Object signed_by) {
        this.signed_by = signed_by;
    }

    public List<Object> getSmses() {
        return smses;
    }

    public void setSmses(List<Object> smses) {
        this.smses = smses;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSubtag() {
        return subtag;
    }

    public void setSubtag(String subtag) {
        this.subtag = subtag;
    }

    public String getSubtag_message() {
        return subtag_message;
    }

    public void setSubtag_message(String subtag_message) {
        this.subtag_message = subtag_message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTracked_count() {
        return tracked_count;
    }

    public void setTracked_count(int tracked_count) {
        this.tracked_count = tracked_count;
    }

    public Object getLast_mile_tracking_supported() {
        return last_mile_tracking_supported;
    }

    public void setLast_mile_tracking_supported(Object last_mile_tracking_supported) {
        this.last_mile_tracking_supported = last_mile_tracking_supported;
    }

    public Object getLanguage() {
        return language;
    }

    public void setLanguage(Object language) {
        this.language = language;
    }

    public String getUnique_token() {
        return unique_token;
    }

    public void setUnique_token(String unique_token) {
        this.unique_token = unique_token;
    }

    public List<Object> getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(List<Object> checkpoints) {
        this.checkpoints = checkpoints;
    }

    public List<Object> getSubscribed_smses() {
        return subscribed_smses;
    }

    public void setSubscribed_smses(List<Object> subscribed_smses) {
        this.subscribed_smses = subscribed_smses;
    }

    public List<Object> getSubscribed_emails() {
        return subscribed_emails;
    }

    public void setSubscribed_emails(List<Object> subscribed_emails) {
        this.subscribed_emails = subscribed_emails;
    }

    public boolean isReturn_to_sender() {
        return return_to_sender;
    }

    public void setReturn_to_sender(boolean return_to_sender) {
        this.return_to_sender = return_to_sender;
    }

    public Object getTracking_account_number() {
        return tracking_account_number;
    }

    public void setTracking_account_number(Object tracking_account_number) {
        this.tracking_account_number = tracking_account_number;
    }

    public Object getTracking_origin_country() {
        return tracking_origin_country;
    }

    public void setTracking_origin_country(Object tracking_origin_country) {
        this.tracking_origin_country = tracking_origin_country;
    }

    public Object getTracking_destination_country() {
        return tracking_destination_country;
    }

    public void setTracking_destination_country(Object tracking_destination_country) {
        this.tracking_destination_country = tracking_destination_country;
    }

    public Object getTracking_key() {
        return tracking_key;
    }

    public void setTracking_key(Object tracking_key) {
        this.tracking_key = tracking_key;
    }

    public Object getTracking_postal_code() {
        return tracking_postal_code;
    }

    public void setTracking_postal_code(Object tracking_postal_code) {
        this.tracking_postal_code = tracking_postal_code;
    }

    public Object getTracking_ship_date() {
        return tracking_ship_date;
    }

    public void setTracking_ship_date(Object tracking_ship_date) {
        this.tracking_ship_date = tracking_ship_date;
    }

    public Object getTracking_state() {
        return tracking_state;
    }

    public void setTracking_state(Object tracking_state) {
        this.tracking_state = tracking_state;
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

    public String getCourier_tracking_link() {
        return courier_tracking_link;
    }

    public void setCourier_tracking_link(String courier_tracking_link) {
        this.courier_tracking_link = courier_tracking_link;
    }

    public String getCourier_redirect_link() {
        return courier_redirect_link;
    }

    public void setCourier_redirect_link(String courier_redirect_link) {
        this.courier_redirect_link = courier_redirect_link;
    }

    public Object getFirst_attempted_at() {
        return first_attempted_at;
    }

    public void setFirst_attempted_at(Object first_attempted_at) {
        this.first_attempted_at = first_attempted_at;
    }
}
