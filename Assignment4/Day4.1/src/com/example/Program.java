package com.example;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
	Student s1= new Student();
	System.out.println("Enter name : ");
	s1.setName();
	System.out.println("Enter Roll No : ");
	s1.setRollNo();
	System.out.println("Enter Marks : ");
	s1.setMarks();
	s1.getName();
	s1.getRollNo();
	s1.getMarks();

	}
}
