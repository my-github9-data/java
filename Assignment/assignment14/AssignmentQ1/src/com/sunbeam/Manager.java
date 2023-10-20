package com.sunbeam;

public class Manager implements Emp {
	double da;
	double bs;
	public Manager(double da, double bs) {
		super();
		this.da = da;
		this.bs = bs;
	}
	@Override
	public double getSal() {
		return bs+da;
	}
	@Override
	public double CalcIncentives() {
		return 0.2*bs;
	}
}
