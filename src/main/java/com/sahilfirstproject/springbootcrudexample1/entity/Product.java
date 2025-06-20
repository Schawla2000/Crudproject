package com.sahilfirstproject.springbootcrudexample1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_TBL")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;



    private int quantity;
    private double price;


    public int getId() {
        return id;

    }
    public String getName() {
        return name;
    }
        public double getPrice() {
            return price;
        }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price= price;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setId(int id) {
        this.id= id;
    }
}
