package com.example;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Contents of Array: " + Arrays.toString(array));
        System.out.println("Sum of Array: " + findSum(array));
        System.out.println("Average of Array: " + findAverage(array));
        System.out.println("Largest element in Array: " + findLargest(array));
        System.out.println("Smallest element in Array: " + findSmallest(array));

        int[] sortedArray = sortArray(array);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double findAverage(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static int findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
