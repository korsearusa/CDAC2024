package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] array1 = {5,14,35,89,140};
        int[] array2 = new int[array1.length-2];
        if(array1.length>=3)
        {
        	for (int i =1;i<array1.length-1;i++)
        	{
        		int b=i-1;
        		int a=i+1;
        		array2[i-1]=(array1[b]+array1[i]+array1[a])/3;
        	}
        }

       System.out.println(Arrays.toString(array2));
    }

   
}

