package com.example;

import java.util.Scanner;

class Student{
	String name;
	int rollNo;
	int marks;
	public String setName() {
		Scanner sc= new Scanner(System.in);
		name=sc.nextLine();
		return name;
	}
	public int setRollNo() {
		Scanner sc= new Scanner(System.in);
		rollNo=sc.nextInt();
		return rollNo;
	}
	public int setMarks() {
		Scanner sc= new Scanner(System.in);
		marks=sc.nextInt();
		return marks;
	}
	public void getMarks() {
		System.out.println("Marks :"+marks);
	}
	public void getRollNo() {
		System.out.println("RollNo :"+rollNo);
	}
	public void getName() {
		System.out.println("Name :"+name);
	}
}
