package com.ayan.SpringExample.beans;

public class Order {
	private IStore store;
	private int items;

	public Order(IStore store, int items) {
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
