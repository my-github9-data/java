//2. In above assignment use LinkedHashSet instead of HashSet. 
//If any book with duplicate isbn is added, what will happen? 
//Books are stored in which order?

package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestBook {
	public static void main(String[] args) {
		Set<Book> set= new LinkedHashSet<>();
		
		set.add(new Book("No1", 111.11,"Sarvesh",10));
		set.add(new Book("No5", 555.55,"Raj",40));
		set.add(new Book("No2", 333.33,"Pratik",20));
		set.add(new Book("No3", 222.22,"Soma",30));
		set.add(new Book("No4", 444.44,"Vinayak",50));
		set.add(new Book("No1", 123.45,"Onkar",11));
		
		Iterator<Book> itr= set.iterator();

		while(itr.hasNext()) {
				Book b = itr.next();
				System.out.println(b +",");
		}
	}
}
