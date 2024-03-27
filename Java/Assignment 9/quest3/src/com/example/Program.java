//Write a Java program throws an array index out of bound exception.
package com.example;



public class Program {
	public static void main(String args[] ){
	int arr[]= {1,2,3,4,5};
	try {
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}


}
}