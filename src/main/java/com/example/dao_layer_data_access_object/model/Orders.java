package com.example.dao_layer_data_access_object.model;

import lombok.Data;

import java.util.Date;

@Data
public class Orders {
    private int id;
    private Date date;
    private int customerId;
    private String productName;
    private int amount;
}
