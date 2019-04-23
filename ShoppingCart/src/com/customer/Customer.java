package com.customer;

import com.Cart.ShoppingCart;

public class Customer {
	
	private long id;
	
	private String name;
	
	private String emailAddress;
	
	private Address address;
	
	private CustomerType type;
	
	private ShoppingCart shoppingCart;
	
	public enum CustomerType{
		REGULAR , PREMIUM , GOLD , PLATINUM
	}
	
	public Customer(long id, String name, String emailAddress, Address address, CustomerType type) {
		super();
		this.id = id;
		this.name = name;
		this.emailAddress = emailAddress;
		this.address = address;
		this.type = type;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

}
