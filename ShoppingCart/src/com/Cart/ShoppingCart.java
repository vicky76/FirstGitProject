package com.Cart;

import java.util.ArrayList;
import java.util.List;

import com.product.Product;

public class ShoppingCart {
	
	private List<Product> productList;
	
	public ShoppingCart(){
		productList = new ArrayList<Product>();
	}
	
	public final List<Product> getProducts(){
		return productList;
	}
	
	public void addProducts(Product product){
		productList.add(product);
	}
	
	public void removeProduct(Product product){
		productList.remove(product);
	}

}
