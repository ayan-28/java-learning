package com.ayan.SpringWithJavaConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ayan.SpringWithJavaConfig.beans.IStore;
import com.ayan.SpringWithJavaConfig.beans.Order;
import com.ayan.SpringWithJavaConfig.beans.Store;

@Configuration
public class AppConfig {
	@Bean
	public Order order() {
		// Bean dependency (Constructor)
		int items = 5;
		return new Order(store(), items);
	}

	@Bean
	public IStore store() {
		return new Store();
	}
}