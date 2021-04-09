package com.taskexam.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class OrderLine extends BaseIdentity {
    @OneToMany(mappedBy = "", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Order> orders = new HashSet<>();

    @OneToMany(mappedBy = "", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Goods> goods = new HashSet<>();

    @Column(nullable = false)
    private BigDecimal count;
}
