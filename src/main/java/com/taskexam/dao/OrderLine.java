package com.taskexam.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class OrderLine extends BaseIdentity {

    @Column(nullable = false)
    private BigDecimal count;
}
