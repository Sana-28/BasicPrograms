/***********************************************
 * Purpose :This program takes strings from standard input and prints them in sorted order,using insertion sort.

 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class InsertionSortString {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of a string:");
		int size  = scanner.nextInt();
		String[] array = new String[size ];
		int length=array.length;
		System.out.println(length);
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < length; i++) {
			array[i] = scanner.next();
		}
		
		System.out.println("List after sorting:");
		scanner.close();
		//Utility.insertionString(inputArray);
		//Utility.printInputArray(inputArray);
		}
}
