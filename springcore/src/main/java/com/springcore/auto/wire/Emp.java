package com.springcore.auto.wire;

public class Emp {
	private Address address;

	public Emp() {
		super();
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	 
}
