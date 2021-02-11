package com.ayan.SpringExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayan.SpringExample.beans.Order;

/**
 * Spring Bean creation with XML configuration Example
 *
 */
public class App {
	public static void main(String[] args) {
		// create context using configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Order order = context.getBean("order", Order.class);
		order.buyItems();
		// close the context
		context.close();
	}
}
