package com.springcore.lifecycle;

public class Samosa {

	private double price;

	public Samosa() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void init() {
		System.out.println("This is init method");
	}

	public void destroy() {
		System.out.println("This is destroy method");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
}
