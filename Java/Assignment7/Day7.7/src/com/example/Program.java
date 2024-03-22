package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] array1 = {23,60,94,3,102};
        int[] array2 = {42,16,74};
        int smallArrayLength=array1.length <array2.length ? array1.length:array2.length;
        int newArray[]=new int[array1.length+array2.length];
        int j=0;
        for(int i=0;i<smallArrayLength;i++) {
        	newArray[j]=array1[i];
        	j++;
        	newArray[j]=array2[i];
        	j++;
        }
        if(array1.length > array2.length) {
        	for (int i=smallArrayLength;i<array1.length;i++) {
        		newArray[j]=array1[i];
        		j++;
        	}
        }
        if(array2.length > array1.length) {
        	for (int i=smallArrayLength;i<array2.length;i++) {
        		newArray[j]=array2[i];
        		j++;
        	}
        }
        System.out.println(Arrays.toString(newArray));
       
    }

   
}

