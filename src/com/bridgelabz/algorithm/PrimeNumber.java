/***********************************************
 * Purpose :This program is to find prime number between a given range
       
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/
package com.bridgelabz.algorithm;

import java.util.LinkedHashSet;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lower limit :");
		int lowerLimit = scanner.nextInt();
		System.out.println("Enter the upper limit :");
		int upperLimit = scanner.nextInt();

		Utility utility = new Utility();
		String primeNumber = utility.prime(lowerLimit, upperLimit);
		System.out.println("" + primeNumber);

		String[] anagram = primeNumber.split(" ");
		System.out.println(primeNumber);

		int[] numbers = new int[anagram.length];
		for (int i = 0; i < anagram.length; i++)
			numbers[i] = Integer.parseInt(anagram[i]);
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		System.out.println("The Anagram numbers are:");
		for (int i = 0; i < anagram.length; i++) {
			for (int j = i + 1; j < anagram.length; j++) {
				if (Utility.anagramDetection(anagram[i], anagram[j])) {
					lhs.add(anagram[i]);
					lhs.add(anagram[j]);
				}
			}
		}
		System.out.println(lhs);
		System.out.println("Palindrome Numbers are:");
		String[] anagramNumber = new String[lhs.size()];

		lhs.toArray(anagramNumber);
		Utility.palindromeNumber(anagramNumber);
		scanner.close();

	}
}
