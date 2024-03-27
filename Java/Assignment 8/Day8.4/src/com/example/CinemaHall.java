package com.example;

import java.util.Random;
import java.util.Scanner;

class CinemaHall{
	static int   seats[][]= new int [4][4];
	 static int seatvacant;
	 
		public  void displayChart() {
			System.out.println("F : Full");
			System.out.println("V : Vacant");
			for(int i=0;i<seats.length;i++)
			{
				for(int j = 0;j<seats[0].length;j++)
				{
					if(seats[i][j]==0)
							System.out.print("V\t");
					else
						System.out.print("F\t");
				}
				System.out.println();
			}
			
		}
		
		public  void bookSeat() {
			char choice='y';
			Scanner sc= new Scanner(System.in);
			do {
			System.out.println("Enter Row number");
			
			int i= sc.nextInt();
			System.out.println("Enter Column number");
			int j= sc.nextInt();
			if(i<=seats.length && j<=seats[0].length) {
			 if(seats[i-1][j-1]==0)
			 {
				 seats[i-1][j-1]=1;
				 System.out.println("Seat Booked Successfully");
			 }
			 else {
				 System.out.println("Seat not available");
			 }
			}
			 else {
				 System.out.println("Invalid row and column");
			 }
			System.out.println("Do you wish to book another seat\n for yes press y\nfor no press n");
			choice= sc.next().charAt(0);
			}while (choice!='n');
			Random r=new Random();
			long trans = r.nextLong();
			while(trans<0) {
				trans = r.nextLong();
			}
			System.out.println("Your transaction number is"+trans);
		}
		
		
		
		
		public void report() {
			int count=0;
			for(int i=0;i<seats.length;i++)
			{
				for(int j = 0;j<seats[0].length;j++)
				{
					if(seats[i][j]==1)
							count++;
				}

			}
			System.out.println("Total seats booked ="+count);
			System.out.println("Revenue genreated = "+count*500);
			
		}
	
}