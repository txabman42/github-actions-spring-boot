package com.hexagonal.medium.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {

    private int productId;
    private String type;
    private String description;
}
