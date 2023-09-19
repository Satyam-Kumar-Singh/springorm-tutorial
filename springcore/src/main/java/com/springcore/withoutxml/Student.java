package com.springcore.withoutxml;

import org.springframework.stereotype.Component;


// @Component("obj") //only for 1st example
public class Student {
	// 2nd example
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		samosa.display();
		System.out.println("I am reading");
	}
}
