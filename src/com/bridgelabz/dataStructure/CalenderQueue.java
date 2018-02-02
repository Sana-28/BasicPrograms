package com.bridgelabz.dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import com.bridgelabz.util.Utility;

/**Purpose: This program implements calender using Queue
 * @author Sana shaikh
 *
 */
public class CalenderQueue {

	public static void main(String[] args) {

		System.out.println("Enter month to display Calender:");
		int month = Utility.getInteger();

		System.out.println("Enter year to display Calender:");
		int year = Utility.getInteger();

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		// Initializing a queue
		Queue<String> queue = new LinkedList<String>();

		for (int i = 0; i < months.length; i++) {
			queue.add(months[i]);// add months to queue
		}
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < days.length; i++) {
			queue.add(Integer.toString(days[i]));
		}
		System.out.println("Elements of queue" + queue);
		// queue.display();

		if (month == 2 && isLeapYear(year)) {
			days[month] = 29;
		}
		System.out.println(" " + months[month] + " " + year);
		System.out.println(" S M Tu W Th F S");
		int d = Utility.dayOfWeek(month, 1, year);
		for (int i = 0; i <= d; i++) {
			System.out.print(" ");
		}
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%d ", i);
			if (((i + d) % 7 == 0) || (i == days[month]))
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
