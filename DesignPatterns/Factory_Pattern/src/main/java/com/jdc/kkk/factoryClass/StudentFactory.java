package com.jdc.kkk.factoryClass;

import com.jdc.kkk.domain.Student;

public class StudentFactory {
	
	//must be static method
	public static Student generatedByNameAndEmail(String name, String email) {
		Student student=new Student();
		student.setName(name);
		student.setEmail(email);
		return student;
	}
	
	public static Student generatedByNameAndAddress(String name, String address) {
		Student student=new Student();
		student.setName(name);
		student.setAddress(address);
		return student;
	}
	

}
