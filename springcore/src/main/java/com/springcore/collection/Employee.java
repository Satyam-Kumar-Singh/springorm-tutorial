package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private Set<String> addresses;
	private List<String> phones;
	private Map<String, String> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Employee(String name, Set<String> addresses, List<String> phones, Map<String, String> courses) {
		super();
		this.name = name;
		this.addresses = addresses;
		this.phones = phones;
		this.courses = courses;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", addresses=");
		builder.append(addresses);
		builder.append(", phones=");
		builder.append(phones);
		builder.append(", courses=");
		builder.append(courses);
		builder.append("]");
		return builder.toString();
	}

}
