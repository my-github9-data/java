package com.sunbeam;

public class Clerk implements Emp {

	double sal;
	
	public Clerk(double sal) {
		super();
		this.sal = sal;
	}

	@Override
	public double getSal() {
		return sal;
	}
	
}
