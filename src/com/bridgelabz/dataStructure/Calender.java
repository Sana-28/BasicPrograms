package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;

/**Purpose:This program takes the month and year as command-line
 * arguments and prints the Calendar of the month.
 * @author Sana shaikh
 * @since 15/01/2018
 */
class Calender {
	public static void main(String[] args) {
		System.out.println("Enter month to display Calender:");
		int month = Utility.getInteger();

		System.out.println("Enter year to display Calender:");
		int year = Utility.getInteger();

		String[] months = { "", "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && leapYear(year)) {
			days[month] = 29;
		}

		System.out.println("\n");
		System.out.println("   " + "%java Calender%");
		System.out.println("   " + months[month] + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");
		int date = Utility.dayOfWeek(month, 1, year);

		for (int i = 0; i < date; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%2d ", i);
			if (((i + date) % 7 == 0) || (i == days[month]))
				System.out.println();
		}
	}

	public static boolean leapYear(int year) {
		if (((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))) {
			return true;
		}
		return false;
	}
}