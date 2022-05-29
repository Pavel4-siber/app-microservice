package com.example.appmicroservice.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    @Column(name = "street_address")
    private String street;
}
