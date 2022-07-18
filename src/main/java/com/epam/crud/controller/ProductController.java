package com.epam.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epam.crud.entity.Product;
import com.epam.crud.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {

		return service.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> product) {

		return service.saveProducts(product);
	}

	@GetMapping("/findAll")
	public List<Product> findAllProducts() {

		return service.getProducts();

	}

	@GetMapping("/findbyId/{id}")
	public Product findProductById(@PathVariable int id) {

		return service.getProductsById(id);

	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {

		return service.updateProduct(product);

	}

	@DeleteMapping("/deleteProduct{id}")
	public String deleteProduct(@PathVariable int id) {

		return service.deleteProduct(id);
	}
}
