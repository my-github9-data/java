package com.sunbeam;

import java.util.Scanner;

public class TestMain implements Arithmetic {

	@Override
	public double calc(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	public static int menu() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction,");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter Your Choice- ");
		choice=new Scanner(System.in).nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		
		while((choice=menu())!=0) {
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter No1- ");
			double a= sc.nextDouble();
			
			System.out.print("Enter No2- ");
			double b=sc.nextDouble();
			switch(choice) {
			case 1:
				calculate(a, b, (x,y)-> x+y);
				break;
			case 2:
				calculate(a, b, (x,y)-> x-y);
				break;
			case 3:
				calculate(a, b, (x,y)-> x*y);
				break;
			case 4:
				if(b==0)
					System.out.println("Cannot divde by 0");
				else
					calculate(a, b, (x,y)-> x/y);
				break;
			}
		}
		
	}
	
}
