package com.ayan.SpringExample.beans;

public class Store implements IStore {
	public void doPurchase(int items) {
		System.out.println("Doing purchase of " + items + " Items");
	}
}