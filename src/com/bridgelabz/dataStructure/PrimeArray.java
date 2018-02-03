package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;

/**Purpose: This program find the Prime numbers in 0-1000 range
 * and store in an 2-D array
 * @author Sana shaikh
 *
 */
public class PrimeArray {
	public static void main(String[] args) {
		int primeNumber[][] = new int[10][100];//specify row and column
		int i, j;
		String prime = "";
		System.out.println("Prime numbers between 0-1000:");
		for (i = 0; i < 10; i++) {
			for (j = 0; j <= 100; j++) {
				int number = i * 100 + j;
				//check for prime
				if (Utility.isPrime(number)) {
					primeNumber[i][j] = number;
					prime = prime + number + " ";//append all primes to prime
				}
			}
		}

		System.out.println("\n"+"Prime numbers representation in 2-D Array:");

		//loop for printing
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 100; j++) {
				if (primeNumber[i][j] != 0)
					System.out.print(primeNumber[i][j] + " ");
			}
			System.out.println();
		}
	}

}