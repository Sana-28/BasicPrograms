package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose: This program takes a command-line argument N 
 * and prints a table of the powers of 2

 * @author  SanaShaikh
 * @since   13/01/2018 
 *
 */

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter power value N:");
		int number=scanner.nextInt();

		Utility.powerOfTwo(number);
		scanner.close();

	}
}
