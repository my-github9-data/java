package com.sunbeam;

public class Book implements Comparable<Book>{
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

		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", price=" + price + ", AuthorName=" + authorName + ", quantity=" + quantity
					+ "]";
		}

		public int compareTo(Book t) {
			int diff= this.isbn.compareTo(t.isbn);
			return diff;
		}
		
	}
