package com.springcore.lifecycle;

public class Samosa {

	private double price;
	
	

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("set Samosa price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("inside Samosa init method");
	}
	
	public void destroy() {
		System.out.println("inside Samosa destroy method");
	}
}
