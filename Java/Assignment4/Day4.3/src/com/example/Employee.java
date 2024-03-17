package com.example;

public class Employee {
	int emp_id;
	float sal = 45000;
	String name;
	void display() {
		name="ABC";
		sal=25000;
		emp_id=101;
		System.out.println("Name "+name);
		System.out.println("ID "+emp_id);
		System.out.println("Salary "+sal);
	}
	void display(String name,int emp_id,float sal) {
		System.out.println("Name "+name);
		System.out.println("ID "+emp_id);
		System.out.println("Salary "+sal);
	}
	void display(String name,int emp_id) {
		System.out.println("Name "+name);
		System.out.println("ID "+emp_id);
		System.out.println("Salary "+sal);
	}
}
