package com.spring.noXML;

import org.springframework.beans.factory.annotation.Value;

public class MainClass {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.position}")
	private String position;
	
	private Dependency dep;
	public MainClass(Dependency dep) {
		this.dep=dep;
	}
	
	public String returnDep() {
		return dep.dependency();
	}

	public String getEmail() {
		return email;
	}

	public String getPosition() {
		return position;
	}

}
