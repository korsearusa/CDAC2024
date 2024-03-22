package com.example;

import java.util.Scanner;

class ElectricityBill{
	String customerName;
	double unitsConsumed;
	double billAmount;
	ElectricityBill(String customerName,double unitsConsumed){
		this.customerName=customerName;
		this.unitsConsumed=unitsConsumed;
	}
	void calculateBillAmount() {
		if(unitsConsumed <= 100) {
			billAmount=unitsConsumed*5;}
			else if(unitsConsumed > 100 && unitsConsumed<=300) {
		double rest = unitsConsumed-100;
			this.billAmount=(100*5)+(rest*7);
		}
			else
		{
			double rest = unitsConsumed-300;
			this.billAmount=(100*5)+(200*7)+(rest*10);
			}
		
		System.out.println("Customer name :"+this.customerName);
		System.out.println("Units Consumed  :"+this.unitsConsumed);
		System.out.println("Bill Amount  :"+this.billAmount);
	}
	
}
public class Program {
	public static void main(String [] args)
	{
		ElectricityBill e1= new ElectricityBill("Arusa",201);
		e1.calculateBillAmount();
		
	}

}
