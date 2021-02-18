package com.ayan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayan.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
