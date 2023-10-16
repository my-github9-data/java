package q1;

import java.util.Scanner;

public class Salesman extends Employee{

		
		private double comm;
		
		public Salesman(double salary, String name) {
			super(salary, name);
		}
		
		public void acceptSalesman() {
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter Comm = ");
			this.comm=sc.nextDouble();
		}

		public void displaySalesman() {
			System.out.println("Comm is= "+comm);
		}
		
		public double getComm() {
			return comm;
		}

		public void setComm(double comm) {
			this.comm = comm;
		}

		@Override
		double calculateTotalSalary() {
			
			return this.getSalary()+this.comm;
		}
	
		
		
	}

