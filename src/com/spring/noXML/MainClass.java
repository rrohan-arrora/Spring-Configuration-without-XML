package com.spring.noXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainClass {
	
	@Autowired
	private Dependency dep;
	
	public String returnDep() {
		return dep.dependency();
	}

}
