/***********************************************
 * Purpose :This program takes integer from standard input and prints them in sorted order,using insertion sort.

 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class InsertionSortInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of list:");
		int n = scanner.nextInt();
		int[] array = new int[n];

		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Sorted list is:");
		scanner.close();
		Utility.insertionSort(array);
		Utility.printArray(array);
	}

}