package com.jdc.kkk.demos;

import com.jdc.kkk.domain.Student;

public class BuilderDemo {
	public static void main(String[] args) {
		Student s1=Student.builder().setName("tts").build();
		System.out.println(s1.getName());
		
		Student s2=Student.builder().setName("mmk").setEmail("mmk@gmail.com").build();
		System.out.println(s2.getEmail());
	}

}
