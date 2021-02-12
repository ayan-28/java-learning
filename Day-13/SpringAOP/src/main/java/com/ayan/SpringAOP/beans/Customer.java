package com.ayan.SpringAOP.beans;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int id;
	private String name;
	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		System.out.println("Age : " + age);
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}
