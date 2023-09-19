/*implementing bean lifecycle using interface which
content initializingBean and disposableBean interface
*/
package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pepsi [price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	public void afterPropertiesSet() throws Exception {
		 //init method of using interface
		System.out.println("Taking pepsi: init");
	}

	public void destroy() throws Exception {
		//destroy method of using interface
		System.out.println("Going to put bottle back to shop : destroy");
	}
	
	
}
