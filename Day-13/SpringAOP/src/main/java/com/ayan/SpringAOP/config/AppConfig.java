package com.ayan.SpringAOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ayan")
@EnableAspectJAutoProxy
public class AppConfig {
}