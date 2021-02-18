package com.ayan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

//mark class as an Entity 
@Entity
@Table//defining class name as Table name
public class Products {
//Defining product id as primary key
	@Id
	@Column(name = "productid")
	private int productid;
	
	@Column
	private String productname;
	
	@Column
	private String weight;
	
	@Column
	private int price;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productId) {
		this.productid = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productName) {
		this.productname = productName;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}