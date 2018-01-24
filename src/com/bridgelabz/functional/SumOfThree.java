package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose: This program takes N integers and counts the 
 *   number of triples that sum to exactly 0.

 * @author SanaShaikh
 * @since  13/01/2018 
 *
 */
public class SumOfThree {

	public static void main(String agrs[]) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter array size:");
		int number = scanner.nextInt();
		int array[] = new int[number];
		System.out.println("Input array elements:");
		for (int i = 0; i <number; i++) {
			array[i] = scanner .nextInt();
		}
		Utility.findTriplet(number, array);
		scanner.close();
	}

}
