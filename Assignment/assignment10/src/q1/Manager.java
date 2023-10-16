package q1;

import java.util.Scanner;

public class Manager extends Employee{
		private double bonus;
		
		public Manager(double salary, String name, double bonus) {
			super(salary, name);
			this.bonus = bonus;
		}

		
		public void acceptManager() {
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter Bonus = ");
			this.bonus=sc.nextDouble();
		}

		public void displayManager() {
			System.out.println("Bonus is= "+bonus);
		}
		
		@Override
		double calculateTotalSalary() {
			return this.getSalary()+this.bonus;
		}
		
	}
