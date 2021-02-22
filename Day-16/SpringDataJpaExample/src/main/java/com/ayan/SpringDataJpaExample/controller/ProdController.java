package com.ayan.SpringDataJpaExample.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayan.SpringDataJpaExample.entity.Products;
import com.ayan.SpringDataJpaExample.service.ProductService;

import ch.qos.logback.classic.Logger;

@RestController
public class ProdController {
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ProdController.class);

	@Autowired
	ProductService productService;

	@GetMapping("/getProducts")
	private List<Products> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping("/AddProduct")
	private String saveProduct(@RequestBody Products product) throws Exception {
		LOGGER.info("INFO MESSAGE: Entered saveProduct() method");

		productService.saveOrUpdate(product);

		LOGGER.debug("DEBUG MESSAGE: saveProduct() method successfully completed.");
		return "Product Details added";
	}

	@GetMapping("/product/{pId}")
	private Optional<Products> getProducts(@PathVariable("pId") int prodId) {
		LOGGER.info("Entered getProducts() method");
		return productService.getProductsById(prodId);
	}

	@GetMapping("/product/search/{initialChars}")
	private List<Products> getProductByInitials(@PathVariable("initialChars") String initialChars) {
		LOGGER.info("Entered getProductByInitials() method");
		return productService.getByProdNameStartingWith(initialChars);
	}
	
	//Controller level Exception handling
	@ExceptionHandler({Exception.class})
	public String handleException() {
		LOGGER.debug("Inside handleException() method");
		return "Exception caught and handled";
	}
}
