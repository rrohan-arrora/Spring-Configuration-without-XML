package com.spring.noXML;

import org.springframework.beans.factory.annotation.Autowired;

public class MainClass {
	
	@Autowired
	private Dependency dep;
//	public MainClass(Dependency dep) {
//		this.dep=dep;
//	}
	
	public String returnDep() {
		return dep.dependency();
	}

}
