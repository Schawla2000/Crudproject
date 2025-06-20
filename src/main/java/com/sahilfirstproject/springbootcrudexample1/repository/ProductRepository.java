package com.sahilfirstproject.springbootcrudexample1.repository;

import com.sahilfirstproject.springbootcrudexample1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
