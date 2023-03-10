package com.spring.noXML;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan("com.spring.noXML") // though not needed when beans are defined explicitly.
@PropertySource("classpath:sport.properties")
public class sportConfig {
	
	//Manually defining the beans
	
	//Bean for dependency
	@Bean
	public Dependency setBeanDependency() {
		return new Dependency();
	}
	
	//Bean for Main class and inject dependency
	@Bean
	public MainClass setBeanClass() {
		return new MainClass(setBeanDependency());
	}

}
