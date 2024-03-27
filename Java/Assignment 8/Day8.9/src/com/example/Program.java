package com.example;

import java.util.Scanner;

enum Dish{
	BIRYANI("Biryani",200),PIZZA("Pizza",150),SANDWICH("Sandwich",150);
	private String dishname;
	private int dishPrice;
	Dish(String dishName, int dishPrice) {
		this.dishname=dishName;
		this.dishPrice=dishPrice;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public int getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}
	public static void printMenu(){
		for(Dish d: Dish.values())
		{
			System.out.println((d.ordinal()+1)+" . "+d.getDishname() + ": $" + d.getDishPrice());
		}
	}

	static void getOrder(Scanner sc) {
		OrderHistory[] od=null;
		int count=0;
		char choice='y';
		int numOFDish = 0;
		System.out.println("Enter the number of dishes you want to order");

		od=new OrderHistory[sc.nextInt()];
		while(choice !='n' || count<od.length)
		{
			System.out.println("Please enter the dish number you wish to order");

			int orderDigit=sc.nextInt();
			Boolean flag= false;
			int orderQuantity;
			float orderedSum;
			int itemPrice = 0;
			String orderedDish = null;
			for(Dish d:Dish.values()) {
				if(orderDigit-1 == d.ordinal()) {
					System.out.println("Item present");
					flag=true;
					orderedDish=d.getDishname();
					itemPrice=d.dishPrice;
					System.out.println("Dish price is "+itemPrice);
					break;
				}

			}
			if(flag==true) {
				System.out.println("Enter Quantity");
				orderQuantity=sc.nextInt();
				orderedSum=itemPrice*orderQuantity;
				od[count]= new OrderHistory(orderedDish,orderQuantity,orderedSum,count);
				//od.addData(orderedDish,orderQuantity,orderedSum,count);
			}
			count++;
			System.out.println("Do you wish to continue? y=yes n=no");
			choice=sc.next().charAt(0);
		}
		float total=0;
		for(OrderHistory odOBJ : od) {
			if(odOBJ.name!= null) {
				System.out.println(odOBJ.name+" - "+odOBJ.quantity+" -  $"+odOBJ.total);
				total=total+odOBJ.total;

			}

		}
		System.out.println("Total cost is $"+total);

	}
}

class OrderHistory{
	String name;
	int quantity;
	float total;
	private float sum;
	public OrderHistory(String orderedDish, int orderQuantity, float orderedSum, int count) {
		name=orderedDish;
		quantity=orderQuantity;
		total=orderedSum;

	}
}
public class Program {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Dish.printMenu();
		Dish.getOrder(sc);


	}


}
