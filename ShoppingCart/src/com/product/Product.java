package com.product;

import com.discount.Discount;

public class Product {
	
	private long id;
	
	private String name;
	
	private int price;
	
	private Category productCategory;
	
	private Discount discount;
	
	public enum Category{
		HEALTHCARE , FOOTWEAR , CLOTHES , ELECTRONICS , APPLIANCES
	}

	public Product(long id, String name, int price, Category productCategory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.productCategory = productCategory;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

}
