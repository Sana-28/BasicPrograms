package com.bridgelabz.functional;

import java.util.Scanner;
import com.bridgelabz.util.Utility;

/**
 * Purpose: This program determine if it is a Leap Year.
 * @author: SanaShaikh
 * @since : 13/01/2018  
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter year:");
			int year=scanner.nextInt();
			
			scanner.close();
			Utility.leapYear(year);
		}
	}
}
