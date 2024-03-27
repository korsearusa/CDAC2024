package com.example;
import java.util.Scanner;


public class Program {
    private static final int MAX_FLIGHTS = 5;
    private static final int MAX_SEATS_PER_FLIGHT = 50;
    private static final int MAX_USERS = 100;
    private static String[] flights = {"Flight1", "Flight2", "Flight3", "Flight4", "Flight5"};
    private static int[][] seats = new int[MAX_FLIGHTS][MAX_SEATS_PER_FLIGHT];
    private static String[] users = new String[MAX_USERS];
    private static String[] emails = new String[MAX_USERS];
    private static String[] contacts = new String[MAX_USERS];
    private static int[] seatCount = new int[MAX_FLIGHTS];
    private static Scanner scanner = new Scanner(System.in);
    private static int userCount = 0;

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Airline Reservation System!");
            System.out.println("Choose an option:");
            System.out.println("a. User registration");
            System.out.println("b. Flight availability");
            System.out.println("c. Seat reservation");
            System.out.println("d. View reservations");
            System.out.println("e. Cancel reservations");
            System.out.println("f. Exit");

            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    registerUser();
                    break;
                case 'b':
                    viewFlightAvailability();
                    break;
                case 'c':
                    reserveSeat();
                    break;
                case 'd':
                    viewReservations();
                    break;
                case 'e':
                    cancelReservation();
                    break;
                case 'f':
                    exit = true;
                    System.out.println("Thank you for using the Airline Reservation System!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void registerUser() {
        if (userCount < MAX_USERS) {
            System.out.print("Enter your name: ");
            users[userCount] = scanner.next();
            System.out.print("Enter your email: ");
            emails[userCount] = scanner.next();
            System.out.print("Enter your contact number: ");
            contacts[userCount] = scanner.next();
            userCount++;
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Maximum user limit reached. Cannot register more users.");
        }
    }

    private static void viewFlightAvailability() {
        System.out.println("Flight Availability:");
        for (int i = 0; i < MAX_FLIGHTS; i++) {
            System.out.println(flights[i] + " - Seats available: " + (MAX_SEATS_PER_FLIGHT - seatCount[i]));
        }
    }

    private static void reserveSeat() {
        System.out.println("Enter your name: ");
        String name = scanner.next();
        int flightIndex = selectFlight();
        if (flightIndex != -1) {
            if (seatCount[flightIndex] < MAX_SEATS_PER_FLIGHT) {
                int seatNumber = seatCount[flightIndex] + 1;
                seats[flightIndex][seatCount[flightIndex]] = userCount;
                seatCount[flightIndex]++;
                System.out.println("Seat reserved successfully. Your seat number is: " + seatNumber);
            } else {
                System.out.println("Sorry, all seats are already reserved for this flight.");
            }
        } else {
            System.out.println("Invalid flight selection.");
        }
    }

    private static int selectFlight() {
        System.out.println("Select a flight:");
        for (int i = 0; i < MAX_FLIGHTS; i++) {
            System.out.println((i + 1) + ". " + flights[i]);
        }
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= MAX_FLIGHTS) {
            return choice - 1;
        } else {
            return -1;
        }
    }

    private static void viewReservations() {
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Your Reservations:");
        for (int i = 0; i < MAX_FLIGHTS; i++) {
            for (int j = 0; j < MAX_SEATS_PER_FLIGHT; j++) {
                if (seats[i][j] != 0 && users[seats[i][j] - 1].equals(name)) {
                    System.out.println("Flight: " + flights[i] + ", Seat: " + (j + 1));
                }
            }
        }
    }

    private static void cancelReservation() {
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your seat number: ");
        int seatNumber = scanner.nextInt();
        for (int i = 0; i < MAX_FLIGHTS; i++) {
            if (seats[i][seatNumber - 1] != 0 && users[seats[i][seatNumber - 1] - 1].equals(name)) {
                seats[i][seatNumber - 1] = 0;
                seatCount[i]--;
                System.out.println("Reservation cancelled successfully.");
                return;
            }
        }
        System.out.println("No reservation found with the given name and seat number.");
    }
}
