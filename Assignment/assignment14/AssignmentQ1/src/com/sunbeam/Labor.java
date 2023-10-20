package com.sunbeam;

public class Labor implements Emp {
	double hrs;
	double rate;
	
	
	public Labor(double hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return hrs+rate;
	}
	
	@Override
	public double CalcIncentives() {
		if(hrs>300)
			return 0.05*hrs*rate;
		return 0.0;
	}
}
