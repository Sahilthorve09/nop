package com.practiceset;

public class Book {
	private Book(String title, String aurthor, double price) {

		System.out.println("Title of book: " + title);
		System.out.println("Name of aurthor: " + aurthor);
		System.out.println("Price: " + price);

	}

	public static void main(String[] args) {
		
		Book detail1 = new Book("xyz", "zyx", 120.50);
		
	}
}
