package com.example.lombokdemo.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {

    private int prodId;
    private String prodName;

}
