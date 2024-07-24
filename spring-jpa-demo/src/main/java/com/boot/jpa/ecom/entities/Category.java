package com.boot.jpa.ecom.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="jpa_category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;


    private String title;
    @OneToOne(mappedBy = "category")
    private  Product product;

    private List<Product> productList;
}
