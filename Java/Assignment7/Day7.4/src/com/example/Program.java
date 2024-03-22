package com.example;

import java.util.Arrays;

public class Program {
	static int temp;
	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		for(int i=0, j=a.length-1;i<a.length/2 && j>i;i++,j--) {//outer loop to go till second last element
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	
	System.out.println(Arrays.toString(a));

}
}
