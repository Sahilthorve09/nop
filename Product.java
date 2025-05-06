package com.practiceset;

public class Product {
	private Product(int id, String name, double price) {
		System.out.println("Product Id: "+id);
		System.out.println("Product Name: "+name);
		System.out.println("Salary: "+price+" INR");
		System.out.println("---------- End ---------");
	}
	
	public static void main(String[] args) {
		Product detail1 = new Product(1010, "T-shirt", 200);
		Product detail2 = new Product(1012, "Formal shirt", 700);
		Product detail3 = new Product(1015, "Printed shirt", 600);
	}
}
