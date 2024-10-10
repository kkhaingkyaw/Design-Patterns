package com.jdc.kkk.demos;


import com.jdc.kkk.domain.Student;
import com.jdc.kkk.factoryClass.StudentFactory;

public class FactoryDemo {
	public static void main(String[] args) {
	Student s1=StudentFactory.generatedByNameAndEmail("kkk", "k@gmail.com");
	s1.displayName();
	}
}
