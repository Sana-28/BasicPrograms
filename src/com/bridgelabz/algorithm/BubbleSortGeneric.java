/***********************************************
 * Purpose :This program takes i
nteger from standard input and prints them in sorted order,using bubble sort.

 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BubbleSortGeneric {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of list:");
		int size = scanner.nextInt();
		Integer[] array = new Integer[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		Utility.bubbleSort(array);
		Utility.printArray(array);

		System.out.println("Enter the size of a string:");
		int sizeString = scanner.nextInt();
		String[] arrayString = new String[sizeString];
		int length = array.length;
		// System.out.println(length);
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < length; i++) {
			arrayString[i] = scanner.next();
		}
		Utility.bubbleSort(arrayString);
		Utility.printArray(arrayString);
		scanner.close();

	}
}
