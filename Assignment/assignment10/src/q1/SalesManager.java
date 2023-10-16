package q1;

import java.util.Scanner;

public class SalesManager extends Employee {
	private int sales;
	

	public SalesManager(double salary, String name, int sales) {
		super(salary, name);
		this.sales = sales;
	}

	public void acceptSalesmanager() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Sales = ");
		this.sales=sc.nextInt();
	}

	public void displaySalesmanager() {
		System.out.println("Sales is= "+sales);
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	@Override
	double calculateTotalSalary() {
		return this.getSalary()+(this.sales*10);
		
	}
		
}
