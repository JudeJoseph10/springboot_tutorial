package com.example.lombokdemo.dao;

import com.example.lombokdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositiry extends JpaRepository<Product, Integer> {
}
