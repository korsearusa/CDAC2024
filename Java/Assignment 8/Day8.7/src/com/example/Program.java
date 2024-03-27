package com.example;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int cols1 = scanner.nextInt();

        System.out.print("Enter number of rows for second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = scanner.nextInt();
        int[][] matrix1 = inputMatrix(scanner, rows1, cols1, "first");
        int[][] matrix2 = inputMatrix(scanner, rows2, cols2, "second");
        System.out.println("\nMatrix Operations Menu:");
        System.out.println("a. Addition of two matrices");
        System.out.println("b. Subtraction of two matrices");
        System.out.println("c. Multiplication of two matrices");
        System.out.println("d. Transpose of a matrix");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);


        switch (choice) {
            case 'a':
                if (rows1 != rows2 || cols1 != cols2) {
                    System.out.println("Matrix addition is not possible. Dimensions must be the same.");
                } else {
                    displayMatrix(addMatrices(matrix1, matrix2));
                }
                break;
            case 'b':
                if (rows1 != rows2 || cols1 != cols2) {
                    System.out.println("Matrix subtraction is not possible. Dimensions must be the same.");
                } else {
                    displayMatrix(subtractMatrices(matrix1, matrix2));
                }
                break;
            case 'c':
                if (cols1 != rows2) {
                    System.out.println("Matrix multiplication is not possible. Number of columns in first matrix must be equal to number of rows in second matrix.");
                } else {
                    displayMatrix(multiplyMatrices(matrix1, matrix2));
                }
                break;
            case 'd':
                displayMatrix(transposeMatrix(matrix1));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }


    private static int[][] inputMatrix(Scanner scanner, int rows, int cols, String ordinal) {
        System.out.println("Enter elements for " + ordinal + " matrix:");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }


    private static void displayMatrix(int[][] matrix) {
        System.out.println("Resultant Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
