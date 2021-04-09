package com.taskexam.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Order extends BaseIdentity {
    @Column(nullable = false)
    private String client;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private String address;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
