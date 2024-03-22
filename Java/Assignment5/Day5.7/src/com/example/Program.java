package com.example;
import java.util.Scanner;

class Program {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("a. Enter vehicle type (car, van, bus, or truck)");
            System.out.println("b. Enter number of axles");
            System.out.println("c. Enter distance traveled");
            System.out.println("d. Calculate toll fee");
            System.out.println("e. Generate bill");
            System.out.println("f. Exit");
            System.out.print("Choose an option: ");
            char option = scanner.next().charAt(0);

            switch (option) {
                case 'a':
                    System.out.print("Enter vehicle type: ");
                    vehicleType = scanner.next();
                    break;
                case 'b':
                    System.out.print("Enter number of axles: ");
                    numAxles = scanner.nextInt();
                    break;
                case 'c':
                    System.out.print("Enter distance traveled: ");
                    distanceTraveled = scanner.nextDouble();
                    break;
                case 'd':
                    calculateTollFee();
                    System.out.println("Toll fee calculated.");
                    break;
                case 'e':
                    generateBill();
                    System.out.println("Bill generated.");
                    break;
                case 'f':
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }

    private void calculateTollFee() {
        double baseRate;
        if (vehicleType.equalsIgnoreCase("car") || vehicleType.equalsIgnoreCase("van") || vehicleType.equalsIgnoreCase("bus")) {
            baseRate = 0.25;
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            baseRate = 0.50;
        } else {
            System.out.println("Invalid vehicle type.");
            return;
        }
        tollFee = baseRate * numAxles * distanceTraveled;
    }

    private void generateBill() {
        totalAmountDue = tollFee + 2.00;
        System.out.println("Bill:");
        System.out.println("Vehicle type: " + vehicleType);
        System.out.println("Number of axles: " + numAxles);
        System.out.println("Distance traveled: " + distanceTraveled);
        System.out.println("Toll fee: $" + tollFee);
        System.out.println("Total amount due: $" + totalAmountDue);
    }

    public static void main(String[] args) {
        Program tollBooth = new Program();
        tollBooth.showMenu();
    }
}
