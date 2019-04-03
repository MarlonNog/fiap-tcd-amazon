package com.fiap.tcd.amazon.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.tcd.amazon.model.Product;

@RestController
public class ProductController {

	@RequestMapping("/products")
	public List<Product> getProductsByCategory(@RequestParam(value="category") String category) {
		List<Product> productList = productList();
		
		return productList;
	}
	
	@RequestMapping("/product/{id}")
	public Product getProductById(@PathVariable Long id) {
		Map<Long, Product> base = productCollection();
		
		Product product = base.get(id);
		
		return product;
	}
	
	@RequestMapping("/cart/add/{id}")
	public List<Product> addToCart(@PathVariable Long id) {
		List<Product> productList = new ArrayList<Product>();
		
		Product productById = this.getProductById(id);
		productList.add(productById);
		
		return productList;
	}

	private Map<Long, Product> productCollection() {
		Map<Long, Product> base = new HashMap<Long, Product>();
		List<Product> productList = productList();
		
		for (Product product : productList) {
			base.put(product.getId(), product);
		}
		return base;
	}

	private List<Product> productList() {
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
