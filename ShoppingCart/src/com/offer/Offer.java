package com.offer;

import com.discount.Discount;

public class Offer {
	
	private int maxAmount;
	
	private int minAmount;
	
	private int discount;

	public Offer(int maxAmount, int minAmount, int discount) {
		super();
		this.maxAmount = maxAmount;
		this.minAmount = minAmount;
		this.discount = discount;
	}

	public int getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(int maxAmount) {
		this.maxAmount = maxAmount;
	}

	public int getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(int minAmount) {
		this.minAmount = minAmount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
