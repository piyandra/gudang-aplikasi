package com.tokoonline.tokoonlineyann.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String productId;
    private String productName;
    @Getter
    @Setter
    private int price;
    private int stock;

    @OneToMany(mappedBy = "productId")
    private List<Transaction> transactions;

}
