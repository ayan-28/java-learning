package com.ayan.springautowiring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	private IStore store;
	
	//Setter Injection
	@Autowired
	public void setStore(IStore store) {
		this.store = store;
	}

	public void buyItems() {
		store.doPurchase();
	}
}
