package com.jdc.kkk.domain;

public class Student {
	static Student instance;
	
	public String name;
	
	private Student() {
		
	}
	
	public static Student getInstance() {
		if (instance == null) {
			instance = new Student();
		}
		
		return instance;
	}

}
