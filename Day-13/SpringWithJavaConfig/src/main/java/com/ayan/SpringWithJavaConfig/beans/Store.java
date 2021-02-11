package com.ayan.SpringWithJavaConfig.beans;

public class Store implements IStore {
	public Store() {
		System.out.println("The store constructor is called.");
	}

	public void doPurchase(int items) {
		System.out.println("Doing purchase of " + items + " Items");
	}
}