package com.example;
import java.util.Scanner;

class Program{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter customer name");
		String name=  sc.nextLine();
		System.out.println("Enter phone number");
		long phoneNumber= sc.nextLong();
		System.out.println("Enter  number of calls made");
		int callsMade= sc.nextInt();
		System.out.println("Enter the duration of calls in minutes");
		float duration=sc.nextFloat();
		double bill= (100*0.5)+((callsMade-100)*0.25)+10;
		System.out.println("BIll is"+bill);
	}
}