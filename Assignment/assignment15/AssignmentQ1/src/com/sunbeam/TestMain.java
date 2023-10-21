package com.sunbeam;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class TestMain {
	public static void main(String[] args) {
		List<Book> list =new ArrayList<>();
		int index;
		int choice;

		while ((choice = menu())!=0) {
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);


			switch(choice)
			{
			case 1:
				Book b =new Book();
				b.accept();

				if(list.contains(b))
				{
					index =list.indexOf(b);
					Book bk =list.get(index);
					bk.setQuantity(bk.getQuantity()+1);

				}
				else
				{
					list.add(b);
				}
				break;

			case 2:
				for(int i=0;i<list.size();i++)
				{
					b=list.get(i);
					System.out.println(b);
				}
				break;

			case 3:				
				System.out.println("Enter isbn:");
				String isbn =sc.next();
				Book bk =new Book();
				bk.setIsbn(isbn);
				index =list.indexOf(bk);
				if(index == -1)
					System.out.println("isbn not found");
				else
					System.out.println("isbn found at Index" +index);
				b=list.get(index);
				System.out.println(b);
				break;

			case 4:
				System.out.println("Enter index No :");
				index =sc.nextInt();
				list.remove(index);
				System.out.println("Deleted.....");
				break;

				//			case 5:
				//				System.out.println("Enter isbn:");
				//				String str =sc.next();
				//				list.rem
				//				break;

			case 6:
				System.out.println("Original List :" +list);
				Collections.reverse(list);
				System.out.println("Modified List :" +list);
				break;

			case 7:
				try(FileOutputStream fout =new FileOutputStream("Books.txt")){
					try(DataOutputStream dout =new DataOutputStream(fout)){
						for (Book b1 : list) {
							dout.writeUTF(b1.getIsbn());
							dout.writeDouble(b1.getPrice());
							dout.writeUTF(b1.getAuthorName());
							dout.writeInt(b1.getQuantity());
						}

					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("Books Saved");
			
			break;

			case 8:
			try(FileInputStream fin =new FileInputStream("Books.txt")){
				try(DataInputStream din=new DataInputStream(fin)){
					while(true) {
						Book b2=new Book();
						b2.setIsbn(din.readUTF());
						b2.setPrice(din.readDouble());
						b2.setAuthorName(din.readUTF());
						b2.setQuantity(din.readInt());
						System.out.println(b2);
					}
				}
			}
			
			catch(EOFException e)
			{
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("Please Enter Valid Choice:");
			break;
		}               
	}
	System.out.println("Thanks For Visting Our website.....");
}

public static int menu()
{
	int choice;
	System.out.println("----------------------------");

	System.out.println("1. Add new book in List");
	System.out.println("2. Display all books in forward order using random access");
	System.out.println("3. Search a book with given isbn");
	System.out.println("4. Delete a book at given index.");
	System.out.println("5. Delete a book with given isbn.");
	System.out.println("6. Reverse the list");
	System.out.println("7. Save Books in File");
	System.out.println("8. Load Books from File");
	
	
	System.out.println("----------------------------");
	System.out.print("Enter your choice :");
	
	@SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
	choice =sc.nextInt();
	return choice;
}
}