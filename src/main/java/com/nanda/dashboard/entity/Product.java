package com.nanda.dashboard.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {
    @Id
    private String id;
    private String name;
    private int price;

}
