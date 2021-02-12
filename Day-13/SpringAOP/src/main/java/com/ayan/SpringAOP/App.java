package com.ayan.SpringAOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ayan.SpringAOP.beans.Customer;
import com.ayan.SpringAOP.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Customer customer = context.getBean(Customer.class);

		customer.setName("Ayan");
		customer.setAge(32);

		customer.getName();
		customer.getAge();
	}
}
