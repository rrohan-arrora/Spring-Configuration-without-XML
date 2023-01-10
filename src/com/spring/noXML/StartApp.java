package com.spring.noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(sportConfig.class);
		
		MainClass mc = context.getBean("mainClass", MainClass.class);
		
		System.out.println(mc.returnDep());
		
		context.close();

	}

}
