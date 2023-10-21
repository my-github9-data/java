package com.sunbeam;

import java.util.*;

	public class Book {
		private String isbn;
		private double price;
		private String authorName;
		private int quantity;
		
		public Book() {
		}
		
		public Book(String isbn, double price, String authorName, int quantity) {
			super();
			this.isbn = isbn;
			this.price = price;
			this.authorName = authorName;
			this.quantity = quantity;
		}


		public String getIsbn() {
			return isbn;
		}


		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public String getAuthorName() {
			return authorName;
		}


		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public void accept() {
			Scanner sc= new Scanner (System.in);
			System.out.print("Enter the Book no: ");
			this.isbn=sc.nextLine();
			System.out.print("Enter the Book Price: ");
			this.price=sc.nextDouble();
			System.out.print("Enter the Author Name: ");
			this.authorName=sc.next();
			sc.nextLine();
			System.out.print("Enter the Book Qty: ");
			this.quantity=sc.nextInt();
		}
		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", price=" + price + ", AuthorName=" + authorName + ", quantity=" + quantity
					+ "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj == null)
				return false;
			if(this == obj)
				return true;
			if(obj instanceof Book) {
				Book other = (Book) obj;
				if(this.isbn.equals(other.isbn))
					return true;
			}
			return false;
		}
	}