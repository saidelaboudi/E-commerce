package com.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
@Data@NoArgsConstructor@AllArgsConstructor
public class Order {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private User user;
    @OneToMany(targetEntity = User.class)
    private List<OrderItem> itemList;
    private double amount ;
}
