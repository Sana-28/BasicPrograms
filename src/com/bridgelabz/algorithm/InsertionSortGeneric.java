package com.bridgelabz.algorithm;

import com.bridgelabz.util.Utility;

public class InsertionSortGeneric {
	public static void main(String[] args) {
	
		System.out.println("Enter the size of list:");
		int size = Utility.getInteger();
		Integer[] array = new Integer[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] =  Utility.getInteger();
		}
		Utility.insertionSort(array);
		Utility.printArray(array);
		
		String[] arrayString = new String[size ];
		int length=array.length;
		//System.out.println(length);
		System.out.println("Enter the string of elements to be sorted:");
		for (int i = 0; i < length; i++) {
			arrayString[i] = Utility.getString();
		}
		Utility.insertionSort(arrayString);
		Utility.printArray(arrayString);
	}
}
 