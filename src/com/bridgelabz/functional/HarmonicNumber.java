package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose: This program prints the Nth harmonic number
 * @author SanaShaikh
 * @since   13/01/2018 
 *
 */
public class HarmonicNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter value of N");
		Scanner scanner =new Scanner(System.in);
		int value=scanner .nextInt();

		Utility.harmonicNumber(value);
		scanner.close();
	}

}
