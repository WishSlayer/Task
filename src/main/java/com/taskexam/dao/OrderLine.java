package com.taskexam.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class OrderLine extends BaseIdentity {

    @JoinColumn(name = "orders_id")
    private long order_id;

    @JoinColumn(name = "goods_id")
    private long goods_id;

    @Column(nullable = false)
    private int count;
}
