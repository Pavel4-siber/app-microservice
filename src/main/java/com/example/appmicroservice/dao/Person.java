package com.example.appmicroservice.dao;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

//    @Embedded
//    @AttributeOverride(name = "street" ,column = @Column(name = "street_name"))
//    private Address address;

    @ElementCollection(fetch = FetchType.LAZY)
    List<Address> itemAddress = new ArrayList<>();

}
