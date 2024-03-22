package com.example;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] array = {24, 54, 31, 16, 82, 45, 67};
        int thirdLargest = findThirdLargest(array);
        System.out.println("The third-largest number in the array is: " + thirdLargest);
    }

    public static int findThirdLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax;
    }
}

