//Write a Java program that throws an arithmetic exception and catch it using a try-catch block.
package com.example;

import java.util.Scanner;

public class Program {
	public static void main(String args[] ) throws Exception{
	int num1=5;
	if(num1%2!=0)
		throw new Exception("Number is odd");
	else
		System.out.println("Number is even");

}
}