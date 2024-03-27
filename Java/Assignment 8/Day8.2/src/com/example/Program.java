package com.example;
import java.util.Scanner;

public class Program {
    private static final int MAX_DISHES = 10;
    private static String[] menu = new String[MAX_DISHES];
    private static double[] prices = new double[MAX_DISHES];
    private static int size = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Restaurant Menu Management System!");
            System.out.println("Choose an option:");
            System.out.println("a. View the current menu with prices");
            System.out.println("b. Add a new dish to the menu");
            System.out.println("c. Remove a dish from the menu");
            System.out.println("d. Modify the price of a dish on the menu");
            System.out.println("e. Exit");

            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    viewMenu();
                    break;
                case 'b':
                    addDish();
                    break;
                case 'c':
                    removeDish();
                    break;
                case 'd':
                    modifyPrice();
                    break;
                case 'e':
                    exit = true;
                    System.out.println("Thank you for using the Restaurant Menu Management System!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void viewMenu() {
        System.out.println("Current Menu:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - $" + prices[i]);
        }
    }

    private static void addDish() {
        if (size < MAX_DISHES) {
            System.out.print("Enter the name of the new dish: ");
            String dish = scanner.next();
            System.out.print("Enter the price of the new dish: ");
            double price = scanner.nextDouble();

            menu[size] = dish;
            prices[size] = price;
            size++;

            System.out.println("New dish added to the menu!");
        } else {
            System.out.println("Sorry, the menu is full. Cannot add more dishes.");
        }
    }

    private static void removeDish() {
        if (size > 0) {
            System.out.print("Enter the index of the dish to remove: ");
            int index = scanner.nextInt();
            if (index >= 1 && index <= size) {
                for (int i = index - 1; i < size - 1; i++) {
                    menu[i] = menu[i + 1];
                    prices[i] = prices[i + 1];
                }
                size--;
                System.out.println("Dish removed from the menu!");
            } else {
                System.out.println("Invalid index. Please enter a valid index.");
            }
        } else {
            System.out.println("The menu is empty. Cannot remove dishes.");
        }
    }

    private static void modifyPrice() {
        if (size > 0) {
            System.out.print("Enter the index of the dish to modify: ");
            int index = scanner.nextInt();
            if (index >= 1 && index <= size) {
                System.out.print("Enter the new price for the dish: ");
                double newPrice = scanner.nextDouble();
                prices[index - 1] = newPrice;
                System.out.println("Price of the dish updated!");
            } else {
                System.out.println("Invalid index. Please enter a valid index.");
            }
        } else {
            System.out.println("The menu is empty. Cannot modify prices.");
        }
    }
}
