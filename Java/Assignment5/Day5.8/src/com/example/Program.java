package com.example;

import java.util.Scanner;

class Program {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter numerator of first number");
		int num1=sc.nextInt();
		System.out.println("Enter denominator of first number");
		int den1=sc.nextInt();
		System.out.println("Enter numerator of second number");
		int num2=sc.nextInt();
		System.out.println("Enter denominator of second number");
		int den2=sc.nextInt();*/
		System.out.println("+ addition");
		System.out.println("- subtraction");
		System.out.println("* multiplication");
		System.out.println("/ division");
		System.out.println("Enter choice");
		int num1=2,den1=3,num2=2,den2=4;
		char ch= sc.next().charAt(0);
		int numresult,denresult;
		switch (ch){
		case'+' :
			numresult=(num1*den2)+(num2*den1);
			denresult=(den1*den2);
			int gcd =calculate(numresult,denresult);
			System.out.println("Ans is "+ numresult/gcd+"/"+denresult/gcd);
			break;
		case'-' :
			numresult=(num1*den2)-(num2*den1);
			denresult=(den1*den2);
			int gcd1 =calculate(numresult,denresult);
			System.out.println("Ans is "+ numresult/gcd1+"/"+denresult/gcd1);
			break;
		case'*' :
			numresult=(num1*num2);
			denresult=(den1*den2);
			int gcd2 =calculate(numresult,denresult);
			System.out.println("Ans is "+ numresult/gcd2+"/"+denresult/gcd2);
			break;
		case'/' :
			numresult=(num1*den2);
			denresult=(den1*num2);
			int gcd3 =calculate(numresult,denresult);
			System.out.println("Ans is "+ numresult/gcd3+"/"+denresult/gcd3);
			break;
			
		}
		
			
		}
		
		static int calculate(int n1,int d1) {
			int max=n1>d1?n1:d1;
			int a[]=new int[max+1];
			for(int i=1;i<=n1;i++) {
				if(n1%i==0) {
					a[i]=i;
				}
			}
			int d[]=new int[max+1];
			for(int i=1;i<=d1;i++) {
				if(d1%i==0) {
					d[i]=i;
				}
			}
			int gcd=0;
			for(int i=0;i<=max;i++) {
				if(a[i]==d[i]) {
					if(a[i]!=0 || d[i]!=0)
					{
						gcd=a[i];
					}
				}
			}
			return gcd;
			
		}
		
}