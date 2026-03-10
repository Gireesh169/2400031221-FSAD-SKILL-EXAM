package com.klf.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shipment {

    @Id
    private Long shipmentId;

    private String name;
    private String date;
    private String status;

    public Shipment() {}

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}