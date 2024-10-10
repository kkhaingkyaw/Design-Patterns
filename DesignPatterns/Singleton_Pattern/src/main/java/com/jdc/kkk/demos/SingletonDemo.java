package com.jdc.kkk.demos;

import com.jdc.kkk.domain.Student;

public class SingletonDemo {

	public static void main(String[] args) {
		Student student1= Student.getInstance();
		
		student1.name="kkk";
		System.out.println(student1.name);
	}
}
