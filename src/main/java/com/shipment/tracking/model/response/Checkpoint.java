package com.shipment.tracking.model.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Checkpoint implements Serializable {

    private static final long SerialVersionUID = 10l;

    private String slug;
    private Object city;
    private Date created_at;
    private String location;
    private String country_name;
    private String message;
    private String country_iso3;
    private String tag;
    private String subtag;
    private String subtag_message;
    private Date checkpoint_time;
    private List<Object> coordinates;
    private Object state;
    private Object zip;
    private String raw_tag;

    public Checkpoint(){}
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCountry_iso3() {
        return country_iso3;
    }

    public void setCountry_iso3(String country_iso3) {
        this.country_iso3 = country_iso3;
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

    public Date getCheckpoint_time() {
        return checkpoint_time;
    }

    public void setCheckpoint_time(Date checkpoint_time) {
        this.checkpoint_time = checkpoint_time;
    }

    public List<Object> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Object> coordinates) {
        this.coordinates = coordinates;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getZip() {
        return zip;
    }

    public void setZip(Object zip) {
        this.zip = zip;
    }

    public String getRaw_tag() {
        return raw_tag;
    }

    public void setRaw_tag(String raw_tag) {
        this.raw_tag = raw_tag;
    }
}
