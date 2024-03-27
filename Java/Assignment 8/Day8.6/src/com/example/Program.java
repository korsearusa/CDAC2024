package com.example;

import java.util.Scanner;
class SalesPerson{
	String name;
	int id;
	float salary[]=new float[12];
	SalesPerson() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float[] getSalary() {
		return salary;
	}
	public void setSalary(float[] salary) {
		this.salary = salary;
	}
}



public class Program {
	static Scanner sc = new Scanner(System.in);
	private static SalesPerson[] acceptData(SalesPerson[] sp) {
		for (int i = 0; i < sp.length; i++) {
			sp[i] = new SalesPerson(); // Instantiate each SalesPerson object
			System.out.println("Enter name, id, and salary of employee " + (i + 1) + ":");
			sp[i].setName(sc.nextLine());
			sp[i].setId(sc.nextInt());
			System.out.println("Enter sales of each month for employee " + (i + 1) + ":");
			for (int j = 0; j < 12; j++) {
				System.out.println("Month " + (j + 1) + " sales:");
				sp[i].salary[j] = sc.nextFloat();
			}
			sc.nextLine(); // consume newline character
		}
		return sp;
	}
	private static void printData(SalesPerson[] sp) {
		for (SalesPerson s : sp) {
			System.out.println("Name: " + s.name);
			System.out.println("ID: " + s.id);
			System.out.println("Salary:");
			for (float sal : s.salary) {
				System.out.print(sal+"\t");
			}
			System.out.println();
		}

	}
	private static SalesPerson[] updateSalary(SalesPerson[] sp) {
		System.out.println("Enter the employee id to edit details");
		int empid = sc.nextInt();
		for(int i=0;i<sp.length;i++) {
			if(sp[i].getId()==empid) {
				System.out.println("Enter sales of each month for employee " + (i + 1) + ":");
				for (int j = 0; j < 12; j++) {
					System.out.println("Month " + (j + 1) + " sales:");
					sp[i].salary[j] = sc.nextFloat();
				}
				break;
			}
		}
		return sp;
	}

	private static void totalSalesPerEmployee(SalesPerson[] sp) {
		float total=0.0f;
		System.out.println("Enter the employee id to view total sales of that employee");
		int empid = sc.nextInt();
		for(int i=0;i<sp.length;i++) {
			if(sp[i].getId()==empid) {
				for (int j = 0; j < 12; j++) {
					total+=sp[i].salary[j];
				}
				break;
			}
		}
		System.out.println("total sales is "+total);

	}
	private static void totalSalesOfAllSalesPersons(SalesPerson[] sp) {
		float total=0.0f; 
		System.out.print("Total Sales Of All SalesPersons is ");
		for(int i=0;i<sp.length;i++) {
			for (int j = 0; j < 12; j++) {
				total+=sp[i].salary[j];
			}


		}
		System.out.println("total sales is "+total);

	}
	public static void main(String[] args) {

		System.out.println("Enter number of Sales persons' data you want to enter:");
		int numSalesPersons = sc.nextInt();
		sc.nextLine(); // consume newline character

		SalesPerson[] sp = new SalesPerson[numSalesPersons];
		SalesPerson[] s1=acceptData(sp);
		printData(sp);
		int choice;
		do {
			System.out.println("1.Modify salary");
			System.out.println("2.Total of some employee");
			System.out.println("3.Total sales of all employees");
			System.out.println("0.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:SalesPerson[] s2=updateSalary(sp);
			printData(sp);
			break;
			case 2:totalSalesPerEmployee(sp);
			printData(sp);
			break;
			case 3:totalSalesOfAllSalesPersons(sp);
			break;
			}	
		}while(choice!=0);



	}


}
