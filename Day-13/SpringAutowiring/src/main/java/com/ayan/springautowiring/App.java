package com.ayan.springautowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayan.springautowiring.services.OrderService;

/**
 * Spring Bean creation with XML configuration Example
 *
 */
public class App {
	public static void main(String[] args) {
		// create context using configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		OrderService orderService = context.getBean("orderService", OrderService.class);
		orderService.buyItems();
		// close the context
		context.close();
	}
}
