package com.example;

import java.util.Arrays;

public class Program {
	static int count;
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4};
		int arr1[]=new int[] {1,2,3,4};
		int arr2[]=new int[] {1,2,7,4};
		if(arr1.length ==arr2.length) {
			for (int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i]) {
					count++;
				}
			}
		}
		if(count==arr2.length) {
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
		
	
		
	}

}
