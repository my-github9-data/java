package q2;

import java.util.Scanner;

public class Employee {
	private String firstname;
	private String lastname;
	private double monthlysalary;
	public Employee() {
		this("","",0.0);
	}
	public Employee(String firstname, String lastname, double monthlysalary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.monthlysalary = monthlysalary;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getMonthlysalary() {
		return monthlysalary;
	}
	public void setMonthlysalary(double monthlysalary) {
		if(this.monthlysalary <0) {
			System.out.println("Salary must be Positive!!!");
		}
		else
			this.monthlysalary = monthlysalary;
		
	}
	
	
	public void acceptData() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Name=");
		firstname=sc.next();
		System.out.print("Enter Last Name=");
		lastname=sc.next();
		
		System.out.print("Enter Monthly Salary=");
		monthlysalary=sc.nextDouble();
		if(this.monthlysalary <0) {
			System.out.println("Salary must be Positive...!!!");
		System.exit(0);
		}
		else
			this.monthlysalary = monthlysalary;
		
	}
	
	public void displayData() {
		System.out.println("First Name ="+ firstname);
		System.out.println("Last Name ="+ lastname);
		System.out.println("Monthly Salary ="+ monthlysalary);
		this.annualSalary();
	}
	
	public void annualSalary() {
		System.out.println("Annual Salary ="+(this.monthlysalary*12));
	}
	public void raise() {
		this.monthlysalary+=this.monthlysalary*0.1;
		System.out.println("Annual Salary after Raise ="+this.monthlysalary*12);
	}

}
