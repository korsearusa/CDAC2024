package com.example;
import java.util.Random;
import java.util.Scanner;


public class Program {
static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
    		CinemaHall c1=new CinemaHall();
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome");
            System.out.println("Choose an option:");
            System.out.println("a. Display seating chart");
            System.out.println("b. Book seat");
            System.out.println("c. Report");
            System.out.println("f. Exit");
            
            char choice = sc.next().charAt(0);
            switch (choice) {
                case 'a':
                    c1.displayChart();
                    break;
                case 'b':
                    c1.bookSeat();
                    break;
                case 'c':
                	c1.displayChart();
                    c1.report();
                    break;
                case 'f':
                    exit = true;
                    System.out.println("Thank you !!!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

	


 

	
}
