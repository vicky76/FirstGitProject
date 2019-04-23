package com.customer;

import java.util.ArrayList;
import java.util.List;

import com.offer.Offer;

public class GoldCustomer extends Customer{
	
	private static List<Offer> offerList = new ArrayList<Offer>();
	
	public GoldCustomer(long id, String name, String emailAddress, Address address, CustomerType type) {
		super(id, name, emailAddress, address, type);
	}

	public static final List<Offer> getOfferList() {
		return offerList;
	}

	public static void addOffers(Offer offer){
		offerList.add(offer);
	}
	
	public static void removeOffer(Offer offer){
		offerList.remove(offer);
	}

}
