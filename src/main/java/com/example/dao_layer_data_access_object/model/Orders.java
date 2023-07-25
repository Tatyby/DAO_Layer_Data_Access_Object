package com.example.dao_layer_data_access_object.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders", schema = "public")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private int customerId;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private int amount;
}
