/***********************************************
 * Purpose :This program to return all permutation of a String​        
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class Permutation {
	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		int length = string.length();
		scanner.close();
		// utility.permutation(str);
		utility.permute(string, 0, length - 1);
	}
}
