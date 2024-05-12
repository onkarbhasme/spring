package com.springcore.javaconfig;

public class Student {

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println("Student is studying");
	}
}
