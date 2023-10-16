package q1;

import java.util.Scanner;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void acceptperson() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Name = ");
		this.name=sc.next();
	}

	public void displayperson() {
		System.out.println("Name is= "+name);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
