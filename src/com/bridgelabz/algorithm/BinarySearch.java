package com.bridgelabz.algorithm;

import java.util.Arrays;
import com.bridgelabz.util.Utility;

/**Purpose :This program binary search for the key element  
 * @author Sana Shaikh
 * @version 1.0
 * @since   13/01/2018
 */
public class BinarySearch {

	public static void main(String[] args) {
	
		System.out.println("Enter the size of list:");
		int size =Utility.getInteger();
		Integer[] array = new Integer[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = Utility.getInteger();
		}
		Arrays.sort(array);
		System.out.println("Enter the Key Element to Search..");
		int key1=Utility.getInteger();
	
		if(Utility.binarySearch(array,key1,0,array.length-1)!=0)
			System.out.println("Element Found..");
		else 
			System.out.println("Element not Found..");
		
		
		System.out.println("Enter the size of a string:");
		int sizeString  = Utility.getInteger();
		String[] arrayString = new String[sizeString];
		//System.out.println(length);
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < arrayString.length; i++) {
			arrayString[i] = Utility.getString();
			//System.out.println("" +arrayString[i]);
		}
		Arrays.sort(arrayString);
		System.out.println("Sorted array is:"  +Arrays.toString(arrayString));
		
		System.out.println("Enter the Key Element to Search..");
		String key2=Utility.getString();
		if(Utility.binarySearch(arrayString,key2,0,arrayString.length-1)!=0)
			System.out.println("Element Found..");
		else 
			System.out.println("Element not Found..");
	
	}
}
