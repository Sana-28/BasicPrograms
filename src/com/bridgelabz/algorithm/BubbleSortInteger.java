package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose: This program reads input integers prints 
 * them in sorted order using Bubble Sort.
 * 
 * @author Sana Shaikh
 * @since   13/01/2018
 *
 */
public class BubbleSortInteger {
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
		scanner.close();

	}
}