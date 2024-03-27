//Write a Java program that throws an arithmetic exception and catch it using a try-catch block.
package com.example;

import java.util.Scanner;

class Division{
	int num1,num2;
	Division(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	Division(){}
	int getNum1() {
		return this.num1;
	}
	int getNum2() {
		return this.num2;
	}
	int setNum1(int num1) {
		return this.num1=num1;
	}
	public int  setNum2(int num2) {
		return this.num2 = num2;
	}
	public void divideOperation(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println("Division result");
		System.out.println(n1/n2);
	}
	
	
}
public class Program {
	public static void main(String args[] ){
	Division d= new Division();
	try {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter num1");
	int n1=d.setNum1(sc.nextInt());
	System.out.println("Enter num2");
	int n2= d.setNum2(sc.nextInt());
	d.divideOperation(n1,n2);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Inside Array index out of bounds");

	}
	catch(ArithmeticException e) {
		System.out.println("Inside Arithmetic Exception");

	}
	catch(Exception e) {
		System.out.println("Inside super class Exception");

	}
}
}