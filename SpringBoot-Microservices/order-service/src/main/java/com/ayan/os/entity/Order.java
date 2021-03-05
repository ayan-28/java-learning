package com.ayan.os.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER_TABLE")
public class Order {
    @Id
    int id;
    String name;
    int qty;
    double price;
}
