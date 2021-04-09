package com.taskexam.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Goods extends BaseIdentity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
