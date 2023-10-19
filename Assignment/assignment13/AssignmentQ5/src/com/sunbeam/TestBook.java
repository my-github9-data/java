//Use TreeSet to store all books in descending order of price.
//Natural ordering for the Book should be isbn (do not change it).
//Display them using iterator()
//and descendingIterator()

package com.sunbeam;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class TestBook {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String,Book> map = new HashMap<>();

		int choice;		
		do {
			System.out.print("\n0.to exit\n1.Insert in map\n2.Find in map\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				Book b= new Book();
				b.accept();
				map.put(b.getIsbn(), b);
				break;
			case 2:
				System.out.println("Enter key isbn");
				String isbn = sc.next();
				Book f = map.get(isbn);
				System.out.println(f+",");
				break;
			case 0: System.out.println("Good Byeee");
				break;
			}
		}while(choice != 0);		
		
	}
}
