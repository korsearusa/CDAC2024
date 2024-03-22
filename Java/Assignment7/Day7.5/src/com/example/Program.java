package com.example;

import java.util.Arrays;

public class Program {
	static int min,max;
	public static void main(String[] args) {
		int a[]=new int[] {11,2,9,4,1};
		min=a[0];
		max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]< min) 
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
	
	System.out.println("minimum is "+min);
	System.out.println("maximum is "+max);

}
}
