package com.example;
public class Vehicle {
	String company;
	int year;
	String fuel;
	void display(String company,int year,String fuel)
	{
		System.out.println("Company :"+company);
		System.out.println("Year :"+year);
		System.out.println("Fuel :"+fuel);
	}
	void display(int year,String fuel,String company)
	{
		System.out.println("Company :"+company);
		System.out.println("Year :"+year);
		System.out.println("Fuel :"+fuel);
	}

}
