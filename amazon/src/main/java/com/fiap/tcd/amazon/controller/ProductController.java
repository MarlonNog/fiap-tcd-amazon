package com.fiap.tcd.amazon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.tcd.amazon.model.Product;

@RestController
public class ProductController {

	@RequestMapping("/products")
	public List<Product> getProductsByCategory(@RequestParam(value="category") String category) {
		Product product1 = new Product(1l, "Livro 1", "book");
		Product product2 = new Product(2l, "Fifa 19", "game");
		Product product3 = new Product(3l, "Iphone 8", "electronic");
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		return productList;
	}
}
