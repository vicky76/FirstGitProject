package com.mart;

import com.customer.Customer;
import com.customer.GoldCustomer;
import com.customer.PlatinumCustomer;
import com.customer.PremiumCustomer;
import com.customer.RegularCustomer;
import com.offer.Offer;

public class Mart {
	
	private Customer customer;
	
	public Mart(Customer customer) {
		super();
		populateDiscountForRegularCustomer();
		populateDiscountForPremiumCustomer();
		populateDiscountForGoldCustomer();
		popualteDiscountForPlatinumCustomer();
		this.customer = customer;
	}

	public long calculateAndPrintBill(){
		return 0;
	}
	
	private void populateDiscountForRegularCustomer(){
		Offer offer1 = new Offer(10000 , 1000 , 10);
		Offer offer2 = new Offer(20000 , 10000 , 20);
		Offer offer3 = new Offer(30000 , 20000 , 30);
		Offer offer4 = new Offer(-1 , 30000 , 40);
		RegularCustomer.addOffers(offer1);
		RegularCustomer.addOffers(offer2);
		RegularCustomer.addOffers(offer3);
		RegularCustomer.addOffers(offer4);
	}
	
	private void populateDiscountForPremiumCustomer(){
		Offer offer1 = new Offer(10000 , 1000 , 12);
		Offer offer2 = new Offer(20000 , 10000 , 22);
		Offer offer3 = new Offer(30000 , 20000 , 32);
		Offer offer4 = new Offer(-1 , 30000 , 42);
		PremiumCustomer.addOffers(offer1);
		PremiumCustomer.addOffers(offer2);
		PremiumCustomer.addOffers(offer3);
		PremiumCustomer.addOffers(offer4);
	}
	
	private void populateDiscountForGoldCustomer(){
		Offer offer1 = new Offer(10000 , 1000 , 15);
		Offer offer2 = new Offer(20000 , 10000 , 25);
		Offer offer3 = new Offer(30000 , 20000 , 35);
		Offer offer4 = new Offer(-1 , 30000 , 45);
		GoldCustomer.addOffers(offer1);
		GoldCustomer.addOffers(offer2);
		GoldCustomer.addOffers(offer3);
		GoldCustomer.addOffers(offer4);
	}
	
	private void popualteDiscountForPlatinumCustomer(){
		Offer offer1 = new Offer(10000 , 1000 , 18);
		Offer offer2 = new Offer(20000 , 10000 , 28);
		Offer offer3 = new Offer(30000 , 20000 , 38);
		Offer offer4 = new Offer(-1 , 30000 , 48);
		PlatinumCustomer.addOffers(offer1);
		PlatinumCustomer.addOffers(offer2);
		PlatinumCustomer.addOffers(offer3);
		PlatinumCustomer.addOffers(offer4);
	}

}
