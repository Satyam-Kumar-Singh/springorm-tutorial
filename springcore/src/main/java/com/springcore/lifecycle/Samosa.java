//implementing bean lifecycle using xml

package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Samosa [price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	public void hey() {
		System.out.println("Inside init method : hey How are you");
	}
	public void bye() {
		System.out.println("Inside destroy method : bye bye i am going to die");
	}
}
