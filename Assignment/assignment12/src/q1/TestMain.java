package q1;

import java.util.*;

public class TestMain {

	public static void main(String[] args) {
		List<Book> list= new ArrayList<>();
	Book b;
	int index = 0;
	int choice;
	do {
		System.out.println("------------------------------------------");
		System.out.println("1. Add new book in List");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list");
		System.out.println("------------------------------------------");
		System.out.print("Enter Your Choice- ");
		Scanner sc = new Scanner(System.in);
		choice=sc.nextInt();
		switch (choice) {
		case 0:
			System.out.println("Thank You...");
			break;
		case 1:
			b = new Book();
			b.accept();
			if(list.contains(b)) {
				index=list.indexOf(b);
			Book bk=list.get(index);
				bk.setQuantity(bk.getQuantity()+1);
			}
			else {
				list.add(b);
			System.out.println("Book Added..!!");
			}
			break;
		case 2:
			for(int i=0;i<list.size();i++) {
				b=list.get(i);
				System.out.println(b);
			}
			break;
		case 3:
				System.out.println("Enter isbn : ");
				String s = new Scanner(System.in).nextLine();
				Book b = new Book();
				b.setIbsn(s);
				if(list.indexOf(b)==-1)
					System.out.println("Not found");
				else
					System.out.println("Found at " + list.indexOf(b));
				break;
		case 4:
				System.out.println("Enter index : ");
				int x = new Scanner(System.in).nextInt();
				
				if (x < 0 && x > list.size()) {
					System.out.println("Wrong Index...:(");

				} else {
					list.remove(x);
					System.out.println("Book at given " + x + " index deleted");

				}
				break;
		case 5:
			System.out.println("Enter isbn : ");
				s = new Scanner(System.in).nextLine();
				b = new Book();
				b.setIsbn(s);
				if(list.indexOf(b)==-1)
					System.out.println("Not found");
				else
					list.remove(list.indexOf(b));

				break;
			
			
			break;
		case 6:
			System.out.println("Reverse Book list : ");
				Collections.reverse(list);
				for (Book book : list) {
					System.out.println(book);
				}
				break;
		}
		
	} while (choice!=0);
	
	}

}
