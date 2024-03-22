package com.example;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateConversion {

	public static void main(String[] args) throws ParseException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date and timme in the format Day(Sun) Month(Feb) Date(18) Time(hh:mm:ss) timezone(IST) year(yyyy)");
		System.out.println("Example: Thu Jun 18 20:56:02 IST 2009");
		//String str= sc.nextLine();
		String str="Thu 06 18 08:56:02 IST 2009";
		SimpleDateFormat sdf= new SimpleDateFormat("EEE MM d HH:mm:ss zzz yyyy");
		Date d = sdf.parse(str);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(d);
        System.out.println("dd/MM/yyyy\t\t"+formattedDate);
        formatter = new SimpleDateFormat("MM/dd/yyyy");
        formattedDate = formatter.format(d);
        System.out.println("MM/dd/yyyy\t\t"+formattedDate);
        formatter = new SimpleDateFormat("yyyy/MM/dd");
        formattedDate = formatter.format(d);
        System.out.println("yyyy/MM/dd\t\t"+formattedDate);
        formatter = new SimpleDateFormat("HH:mm:ss");
        formattedDate = formatter.format(d);
        System.out.println("HH/mm/ss\t\t"+formattedDate);
        formatter=new SimpleDateFormat("K:mm:ss aa");
        formattedDate=formatter.format(d);
        System.out.println("HH:mm:ss aa\t\t"+formattedDate);
        formatter=new SimpleDateFormat("HH:mm");
        formattedDate=formatter.format(d);
        System.out.println("HH:mm\t\t"+formattedDate);
        formatter=new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        formattedDate=formatter.format(d);
        System.out.println("dd/mm/yyyy hh:mm:ss\t\t"+formattedDate);
        formatter=new SimpleDateFormat("MM/dd/yyy K:mm:ss a");
        formattedDate=formatter.format(d);
        System.out.println("mm/dd/yyyy hh:mm:ss a\t\t"+formattedDate);
        formatter=new SimpleDateFormat("yyy/MM/dd HH:mm");
        formattedDate=formatter.format(d);
        System.out.println("yyyy/mm/dd hh:mm\t\t"+formattedDate);
        
        
		

	}

}
