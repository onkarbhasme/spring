package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("add2")
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
