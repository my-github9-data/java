package q1;

import java.util.Scanner;

public class Customer {
	private int accno;
	private int balance;
	private int total_item;
	private int total_credit;
	private int credit_limit;
	private int new_balance;
	
	public Customer() {
		
	}

	public Customer(int accno, int balance, int total_item, int total_credit, int credit_limit, int new_balance) {
		this.accno = accno;
		this.balance = balance;
		this.total_item = total_item;
		this.total_credit = total_credit;
		this.credit_limit = credit_limit;
	}
	public void newBalance() {
		this.new_balance=(this.balance+this.total_item)-this.total_credit;
		System.out.println("New Balance= "+this.new_balance);
	}
	public void creditLimit() {
		if(this.new_balance>this.credit_limit) 
			System.out.println("Credit Limit Exceeded..!!!");
	}
	public void acceptData() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Account No.=");
		this.accno=sc.nextInt();
		System.out.print("Enter Balance at the Beginning of the Month= ");
		this.balance=sc.nextInt();
		System.out.print("Enter total Charges in the Month= ");
		this.total_item=sc.nextInt();
		System.out.print("Enter the total Credits of the Month= ");
		this.total_credit=sc.nextInt();
		System.out.print("Enter Credit Limits= ");
		this.credit_limit=sc.nextInt();
	}
}
