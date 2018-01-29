package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose:This method reads three command-line arguments principal, year, and rate and calculates the monthly payments 
 * @author Sana Shaikh
 *@since 13/01/2018
 */
public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		int principal=scanner.nextInt();
		
		System.out.println("Enter year:");
		int year=scanner.nextInt();
		
		System.out.println("Enter rate:");
		double rate=scanner.nextDouble();
		Utility.monthlyPayment(principal,year,rate);
		scanner.close();

	}

}
