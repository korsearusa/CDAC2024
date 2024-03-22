package com.example;

import java.util.Scanner;
class CreditScoreCalculator{
	int creditHistory;
	double creditUtilization;
	boolean paymentHistory;
	CreditScoreCalculator(int creditHistory,double creditUtilization,boolean paymentHistory){
		this.creditHistory=creditHistory;
		this.creditUtilization=creditUtilization;
		this.paymentHistory=paymentHistory;
	}
	public int getCreditHistory() {
		return creditHistory;
	}
	public void setCreditHistory(int creditHistory) {
		this.creditHistory = creditHistory;
	}
	public double getCreditUtilization() {
		return creditUtilization;
	}
	public void setCreditUtilization(double creditUtilization) {
		this.creditUtilization = creditUtilization;
	}
	public boolean isPaymentHistory() {
		return paymentHistory;
	}
	public void setPaymentHistory(boolean paymentHistory) {
		this.paymentHistory = paymentHistory;
	}
	int calculateCreditScore() {
		int score=0;
		if (paymentHistory == true) {
			score = (creditHistory * 15) + (int)(creditUtilization * 30) + 55 ;
		}
		else
			score = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
		
		return score;
	}
}

class Program {
	public static void main(String args[])
	{
		CreditScoreCalculator c= new CreditScoreCalculator(10,555.0,true);
		System.out.println("Credit Score is :  "+c.calculateCreditScore());
		
		}
		
}
