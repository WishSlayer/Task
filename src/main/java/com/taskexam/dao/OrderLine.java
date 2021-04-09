package com.taskexam.dao;

import javax.persistence.*;

@Entity
public class OrderLine extends BaseIdentity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id")
    private Goods goods;

    @Column(nullable = false)
    private int count;
}
