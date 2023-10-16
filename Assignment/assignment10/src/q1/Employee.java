package q1;

import java.util.Scanner;

public abstract class Employee extends Person{

	private double salary;
	public Employee(double salary, String name) {
		super(name);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void acceptemployee() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Salary = ");
		this.salary=sc.nextDouble();
	}

	public void displayemployee() {
		System.out.println("Salary is= "+salary);
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
   
	abstract double calculateTotalSalary();
}

