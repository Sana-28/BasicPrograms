package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose:This program computes the prime factorization
 *  of a Number 
 * @author SanaShaikh
 * @since   13/01/2018 
 */
public class PrimeFactorization {

	public static void main(String[] args) {
		System.out.println("Enter the number to find factors: ");
		Scanner scanner=new Scanner (System.in);
		int number=scanner.nextInt();
		
		Utility.primeFactoristaion(number);
		scanner.close();

	}

}
