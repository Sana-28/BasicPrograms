package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySearch {

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
		Utility.insertionSort(array);
		Utility.printArray(array);

		System.out.println("Enter the key element to be searched:");
		int key=scanner.nextInt();

		int result=Utility.binarySearch(array, key);
		if (result == -1)
			System.out.println("Element not present");
	    else
	        System.out.println("Element found");
	}
}
