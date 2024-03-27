package com.example;
enum DayOfWeek{
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, 
	Saturday
};
public class Program {
    public static void main(String[] args) {
        DayOfWeek day =DayOfWeek.Friday;
        DayOfWeek(day);
        getNextDay(day);
        getDayNumber(day);
        DayOfWeek[] weekendDays = getWeekendDays();
        System.out.println("Weekend Days are : ");
        System.out.println(weekendDays[0]);
        System.out.println(weekendDays[1]);
}

	private static DayOfWeek[] getWeekendDays() {
		DayOfWeek[] arr = {DayOfWeek.Saturday, DayOfWeek.Sunday};
	    return arr;
		
	}

	private static void getDayNumber(DayOfWeek day) {
		int DayNumber = day.ordinal()+1;
		System.out.println("Day Number is :"+DayNumber);
		
		
	}

	private static void getNextDay(DayOfWeek day) {
		int nextDayNumber=(day.ordinal()+1)%7;
		DayOfWeek[] arr = DayOfWeek.values();
		System.out.println("Next Day is "+arr[nextDayNumber]);
		
	}
	

	private static void DayOfWeek(DayOfWeek day) {
		System.out.println("Day is "+day);
		
	}
    
}
	