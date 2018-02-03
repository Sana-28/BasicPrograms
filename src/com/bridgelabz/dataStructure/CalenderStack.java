package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;

/**Purpose: This program implements calender using Stack
 * @author Sana shaikh
 * @since 15/01/2018
 */

class Stack {

	/*This method determines the string and push
	day and month to stack*/
    public static void push(String string)
    {

        }
 
	public static void main(String[] args) {

		System.out.println("Enter month to display Calender:");
		int month = Utility.getInteger();

		System.out.println("Enter year to display Calender:");
		int year = Utility.getInteger();

		String[] months = { "", "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December" };

		for (int i = 0; i < months.length; i++) {
			push(months[i]);// add months to stack
		}

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < days.length; i++) {
			push(Integer.toString(days[i]));
		}
	    //System.out.println("" +push);
		
		if (month == 2 && isLeapYear(year)) {
			days[month] = 29;
		}
		
		System.out.println("\n");
		System.out.println(" " + months[month] + " " + year);
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");

		// starting date
		int date = Utility.dayOfWeek(month, 1, year);
		// System.out.println(""+date);

		for (int i = 0; i <= date * 4 - 1; i++) {
			System.out.print(" ");
		}
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%-3d ", i);
			if (((i + date) % 7 == 0) || (i == days[month]))
				System.out.println();
		}
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0)
			return true;
		else
			return false;

	}
}
