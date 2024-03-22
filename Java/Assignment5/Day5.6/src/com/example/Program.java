package com.example;

import java.util.Random;
import java.util.Scanner;

class Account {
	static String accountName;
	static int accountNo;
	static double accountBalance=0;
	
	static void addAccount() {
		System.out.println("Enter name");
		Scanner sc= new Scanner(System.in);
		 accountName= sc.nextLine();
		 accountBalance=0;
		Random r = new Random();
		accountNo= r.nextInt();
		System.out.println("Account Created Successfully");
	}
	 static void  deposit() {
		System.out.println("Enter account no");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n==accountNo) {
			System.out.println("Enter amount to be deposited");
			int depositAmount=sc.nextInt();
			accountBalance+=depositAmount;
			System.out.println("Successfull Deposit");
		}
		else {
			System.out.println("Error: Invalid Account number");
		}
	}
	 static void withdraw() {
		System.out.println("Enter account no");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n==accountNo) {
			System.out.println("Enter Withdrawal amount");
			int withdrawAmount=sc.nextInt();
			if(accountBalance>=withdrawAmount)
			{
				accountBalance-=withdrawAmount;
				System.out.println("Successfull withdraw");
			}
			else
				System.out.println("Error: Insufficient Balance");
		}
		else
			System.out.println("Error: Invalid Account Number");
	}
	 
	 
	 static void display()
	 {
		 System.out.println("Name="+accountName);
		 System.out.println("Account Number="+accountNo);
		 System.out.println("Account Balance="+accountBalance);
		 
	 }
	 static void displayBalance()
	 {
		 System.out.println("Account Balance="+accountBalance);
	 }
}

class Program {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int choice;
		System.out.println("1.Create Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Display Balance");
		System.out.println("5.Display Account Information");
		System.out.println("0.Exit");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		do {
			
			switch(choice) {
			case 1: 
				Account.addAccount();
				break;
			case 2:
				Account.deposit();
				break;
			case 3:
				Account.withdraw();
				break;
			case 4:
				Account.displayBalance();
				break;
			case 5:
				Account.display();
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Enter choice");
			choice=sc.nextInt();
		}while(choice!=0);
	System.out.println("Thankyou for banking with us !!!!");
}
}