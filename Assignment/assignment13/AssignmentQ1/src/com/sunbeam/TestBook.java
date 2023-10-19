//Store few books (hardcoded values with the Book class in previous assignment) 
//in a HashSet and display them using iterator. If any book with duplicate
//isbn is added, what will happen? Books are stored in which order? 
//Solve duplicate ISBN problem

package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestBook {

	public static void main(String[] args) {
	Set<Book> set= new HashSet<>();
	
	set.add(new Book("No1", 111.11,"Sarvesh",10));
	set.add(new Book("No5", 555.55,"Raj",40));
	set.add(new Book("No2", 333.33,"Pratik",20));
	set.add(new Book("No3", 222.22,"Soma",30));
	set.add(new Book("No4", 444.44,"Vinayak",50));
	set.add(new Book("No1", 543.21,"ABC",1));
	set.add(new Book("No3", 123.45,"XYZ",5));
	
	Iterator<Book> itr= set.iterator();

	while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b +",");
	}
}
}
