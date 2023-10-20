package com.sunbeam;

public interface Emp {

	public double getSal();
	default double CalcIncentives() {
		return 0.0;
	}
	static double CalculateTotalIncome(Emp[] arr) {
		double total= 0.0;
		for (Emp e : arr) {
			total+=e.getSal()+e.CalcIncentives();
		}
		return total;
	}
}
