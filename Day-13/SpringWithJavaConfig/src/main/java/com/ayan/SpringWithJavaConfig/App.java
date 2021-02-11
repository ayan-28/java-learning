package com.ayan.SpringWithJavaConfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ayan.SpringWithJavaConfig.beans.Order;
import com.ayan.SpringWithJavaConfig.config.AppConfig;

/**
 * Spring Bean creation with XML configuration Example
 *
 */
public class App {
	public static void main(String[] args) {
		// create context using configuration
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Order order = context.getBean("order", Order.class);
		order.buyItems();
		context.close();
	}
}
