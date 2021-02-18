package com.ayan.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayan.model.Products;
import com.ayan.service.ProductsService;

//mark class as Controller
@RestController
public class ProductsController {
	//autowire the ProductsService class
	@Autowired
	ProductsService productsService;

	//creating a get mapping that retrieves all the products detail from the database 
	@GetMapping("/product")
	private List<Products> getAllProducts() {
		return productsService.getAllProducts();
	}

	//creating a get mapping that retrieves the detail of a specific product
	@GetMapping("/product/{productid}")
	private Products getProducts(@PathVariable("productid") int productid) {
		return productsService.getProductsById(productid);
	}

	//creating a delete mapping that deletes a specified product
	@DeleteMapping("/product/{productid}")
	private void deleteProduct(@PathVariable("productid") int productid) {
		productsService.delete(productid);
	}

	//creating post mapping that post the product detail in the database
	@PostMapping("/products")
	private int saveProduct(@RequestBody Products products) {
		productsService.saveOrUpdate(products);
		return products.getProductid();
	}

	//creating put mapping that updates the product detail 
	@PutMapping("/products")
	private Products update(@RequestBody Products products) {
		productsService.saveOrUpdate(products);
		return products;
	}
}
