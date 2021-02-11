package com.ayan.SpringWithJavaConfig.beans;

public class Order {
	private IStore store;
	private int items;

	public Order(IStore store, int items) {
		System.out.println("The Order constructor is called.");
		this.store = store;
		this.items = items;
	}

	public void setStore(IStore store) {
		this.store = store;
	}

	public void buyItems() {
		store.doPurchase(items);
	}
}
