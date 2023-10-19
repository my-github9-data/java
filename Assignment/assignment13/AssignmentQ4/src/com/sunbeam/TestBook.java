//Use TreeSet to store all books in descending order of price.
//Natural ordering for the Book should be isbn (do not change it).
//Display them using iterator()
//and descendingIterator()


package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestBook {
	public static void main(String[] args) {
		
		class DesendingBook implements Comparator<Book> {
			@Override
			public int compare(Book b1, Book b2) {
				int diff= Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}

		DesendingBook descbook= new DesendingBook();
		TreeSet<Book> set=new TreeSet<>(descbook);
		
		set.add(new Book("No1", 100.00,"Sarvesh",10));
		set.add(new Book("No5", 900.00,"Raj",40));
		set.add(new Book("No2", 500.00,"Pratik",20));
		set.add(new Book("No3", 400.00,"Soma",30));
		set.add(new Book("No4", 300.00,"Vinayak",50));


		System.out.println("Descending Order-");
		
		Iterator<Book> itr=set.descendingIterator();
		while(itr.hasNext()) {
			Book b= itr.next();
			System.out.println(b + ", ");
		}
		
		
		
		System.out.println("Assending Order-");
		Iterator<Book> itr2= set.iterator();

		while(itr2.hasNext()) {
				Book b = itr2.next();
				System.out.println(b +",");
		}	
	}
}
