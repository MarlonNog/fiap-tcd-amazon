package com.fiap.tcd.amazon.model;

public class Product {
	private Long id;
	private String description;
	private String category;
	
	public Product(long id, String description, String category) {
		this.id = id;
		this.description = description;
		this.category = category;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
