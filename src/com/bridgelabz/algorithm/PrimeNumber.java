/***********************************************
 * Purpose :This program is to find prime number between a given range 

       
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lower limit :");
		int lowerLimit = scanner.nextInt();
		System.out.println("Enter the lower limit :");
		int upperLimit = scanner.nextInt();
		scanner.close();

		Utility utility = new Utility();
		utility.prime(lowerLimit, upperLimit);
	}
}
