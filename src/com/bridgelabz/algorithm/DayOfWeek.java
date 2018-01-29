/***********************************************
 * Purpose :This program takes a date as input and prints the day of the week that date falls on.

 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

package com.bridgelabz.algorithm;
import java.util.Scanner;
import com.bridgelabz.util.Utility;


public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array[] = {"Sun","Mon","Tue","Wed","Thus","Fri","Sat"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter month:");
		int month=scanner.nextInt();
		System.out.println("Enter date");
		int date=scanner.nextInt();
		System.out.println("Enter year");
		int year=scanner.nextInt();
		int result = Utility.dayOfWeek(month,date,year);
		System.out.println(array[result]);
		scanner.close();	
	}
}
