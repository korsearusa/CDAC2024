package com.example;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

import java.util.Scanner;

public class Program {
    // Static array to represent the shelves in the warehouse
    private static String[][] shelves = new String[10][10];
    private static int count[]=new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nWarehouse Inventory Management System");
            System.out.println("a. Add item to shelf");
            System.out.println("b. Remove item from shelf");
            System.out.println("c. Display contents of all shelves");
            System.out.println("d. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    addItemToShelf(scanner);
                    break;
                case 'b':
                    removeItemFromShelf(scanner);
                    break;
                case 'c':
                    displayContentsOfAllShelves();
                    break;
                case 'd':
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 'd');

        scanner.close();
    }

    // Method to add an item to a shelf
    private static void addItemToShelf(Scanner scanner) {
        System.out.print("Enter the name of the item: ");
        String itemName = scanner.next();
        System.out.print("Enter the shelf number (1-10): ");
        int shelfNumber = scanner.nextInt();

        if (shelfNumber < 1 || shelfNumber > 10) {
            System.out.println("Invalid shelf number! Shelf number must be between 1 and 10.");
            return;
        }
        else {
        	if(count[shelfNumber-1]<10) {
        		System.out.println("Enter the column or slot you want to place your item between 1 to 10");
        		int slot=scanner.nextInt();
        		if(shelves[shelfNumber-1][slot-1] !=null) {
        			System.out.println("Sorry ! This slot already has an item");
        		}
        		else {
        			shelves[shelfNumber - 1][slot -1] = itemName;
        			count[shelfNumber-1]++;
        			System.out.println("item added successfully");
        		}
        	}
        	else {
        		System.out.println("This shelf is full");
        	}
        }

    }

    // Method to remove an item from a shelf
    private static void removeItemFromShelf(Scanner scanner) {
        System.out.print("Enter the shelf number (1-10) from which you want to remove the item: ");
        int shelfNumber = scanner.nextInt();

        if (shelfNumber < 1 || shelfNumber > 10) {
            System.out.println("Invalid shelf number! Shelf number must be between 1 and 10.");
            return;
        }
        else {
        	if(count[shelfNumber-1]>0) {
        		System.out.println("Enter the column or slot you want to remove your item from  between 1 to 10");
        		int slot=scanner.nextInt();
        		if(slot>0 && slot<=10)
        		{ if(count[shelfNumber-1]>0){
        			shelves[shelfNumber - 1][slot -1]=null;
        			System.out.println("Item removed");}
        		else {
        			System.out.println("Shelf is empty");
        		}
        		}
        		else {
        			System.out.println("invalid slot number");
        		}
        		
        	}
        }


    }


    // Method to display contents of all shelves
    private static void displayContentsOfAllShelves() {
        System.out.println("\nContents of all shelves:");
        System.out.println("Shelf No. \t Items");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "\t\t");
           for(int j=0;j<10;j++)
        	   System.out.print(shelves[i][j]+"         ");
           System.out.println();
        }
    }
}
