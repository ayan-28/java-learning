package com.ayan.SpringDataJpaExample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ayan.SpringDataJpaExample.entity.Products;
import com.ayan.SpringDataJpaExample.repository.ProductsRepository;

@Service
public class ProductService {

	@Autowired
	ProductsRepository productsRepository;
	
	public List<Products> getAllProducts() {
		List<Products> products = new ArrayList<Products>();
		productsRepository.findAll(Sort.by("price")).forEach(p -> products.add(p));
		return products; 
	}

	public void saveOrUpdate(Products product) throws Exception {
		productsRepository.save(product);
		throw new Exception("Random Exception Thrown for demo.");
	}

	public Optional<Products> getProductsById(int prodId) {
		return productsRepository.findById(prodId);
	}
	
	public List<Products> getByProdNameStartingWith(String initialChars) {
		return productsRepository.findByProdNameStartingWith(initialChars);
	}
}
