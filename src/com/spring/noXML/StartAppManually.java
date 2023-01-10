package com.spring.noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartAppManually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(sportConfig.class);
		
		MainClass mc = context.getBean("setBeanClass", MainClass.class);
		
		System.out.println(mc.returnDep());
		System.out.println(mc.getEmail());
		System.out.println(mc.getPosition());
		
		context.close();

	}

}
