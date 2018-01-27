package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose: This program computes the square root of a
 *  nonnegative number c given in the input using 
 *  Newton's method:
 * @author Sana Shaikh
 *@since   13/01/2018   
 */
public class SqrtNewtonsMethod {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int c=scanner.nextInt();
		Utility.sqrt(c);
		scanner.close();
	}

}
