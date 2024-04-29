package com.springcore.autowiring;

public class Emp {
	
	private Address add;

	public Emp() {
		super();
	}

	public Emp(Address add) {
		super();
		this.add = add;
		System.out.println("Inside Constructor");
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
		System.out.println("Inside Setter Method");
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}
	
}
