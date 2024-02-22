package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ColdDrink implements InitializingBean, DisposableBean{
	private double price;
	
	

	public ColdDrink() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("set cold drink price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "ColdDrink [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Cold drink init");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy cold drink bottle");
		
	}
	
		
	
}
