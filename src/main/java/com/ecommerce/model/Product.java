package com.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data@NoArgsConstructor@AllArgsConstructor
public class Product {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @OneToOne
    private Category category;
    private double price;
    private boolean newArrival;
    private boolean bestSelling;
}