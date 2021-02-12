package com.ayan.springautowiring.services;

import org.springframework.stereotype.Component;

@Component
public class RetailStore  implements IStore {
	public RetailStore () {
		System.out.println("The RetailStore constructor is called.");
	}

	public void doPurchase() {
		System.out.println("Purchasing from a Retail store.");
	}
}