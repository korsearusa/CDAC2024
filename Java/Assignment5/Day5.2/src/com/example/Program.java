package com.example;

import java.util.Scanner;

class Book{
	String title;
	String author;
	String publisher;
	String isbn;
	int year;
	double price;
	int quantity;
	Book(String title,String author, String publisher,String isbn,int year,double price,int quantity ){
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.isbn=isbn;
		this.year=year;
		this.price=price;
		this.quantity=quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void increaseQuantity(int quantity) {
		this.quantity =this.quantity + quantity;
	}
	public void decreaseQuantity(int quantity) {
		this.quantity=this.quantity - quantity;
	}
	public double getInventoryValue() {
		return this.quantity*this.price;
	}
		
}
public class Program {
	public static void main(String args[])
	{
		Book b1= new Book("java","herbert","xyz","5465132",2022,1200,4);
		b1.setPrice(2500);
		System.out.println("Details of book");
		System.out.println("Book title\t"+b1.getTitle());
		System.out.println("Book Author\t"+b1.getAuthor());
		System.out.println("Book Publisher\t"+b1.getPublisher());
		System.out.println("Book ISBN\t"+b1.getIsbn());
		System.out.println("Book Year\t"+b1.getYear());
		System.out.println("Book Price\t"+b1.getPrice());
		System.out.println("Book Quantity\t"+b1.getQuantity());
		b1.increaseQuantity(2);
		System.out.println("Book Quantity\t"+b1.getQuantity());
		b1.decreaseQuantity(1);
		System.out.println("Book Quantity\t"+b1.getQuantity());
		System.out.println("Inventory\t"+b1.getInventoryValue());
		
	}

}
