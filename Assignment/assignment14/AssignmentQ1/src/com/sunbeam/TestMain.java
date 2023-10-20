package com.sunbeam;

public class TestMain {

	public static void main(String[] args) {
		Emp[] arr=new Emp[3];
		arr[0]= new Clerk(20000);
		arr[1]= new Manager(500,30000);
		arr[2]= new Labor(400, 400);
		
		double total=Emp.CalculateTotalIncome(arr);
		System.out.println(total);

	}

}
