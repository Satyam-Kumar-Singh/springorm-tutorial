package com.springcore.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // it mark javaconfig is a configuration class
// @ComponentScan(basePackages = "com.springcore.withoutxml") // it find the class that annoted with @component in this package
public class JavaConfig {

	@Bean //2nd example
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean (name = {"student","obj","temp"})//2nd example
	public Student getStudent() {
		Student studentobj = new Student(getSamosa());
		return studentobj;
	}
	
}
