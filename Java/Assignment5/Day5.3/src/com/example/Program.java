package com.example;

import java.util.Scanner;

class BMI{
	float height;
	float weight;
	BMI(){
		this.height=0;
		this.weight=0;
	}
	void getHeight() {
		System.out.println("Enter height in meters");
		Scanner sc= new Scanner(System.in);
		this.height=sc.nextFloat();
	}
	void getWeight() {
		System.out.println("Enter weight in kg");
		Scanner sc= new Scanner(System.in);
		this.weight=sc.nextFloat();
	}
	void bmiCalculator()
	{
		System.out.println("BMI is "+(weight/(height*height)));
	}
	
}
public class Program {
	public static void main(String args[])
	{
		BMI b1= new BMI();
		b1.getHeight();
		b1.getWeight();
		b1.bmiCalculator();
	}

}
