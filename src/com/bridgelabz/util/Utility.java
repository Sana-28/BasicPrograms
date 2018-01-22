/***********************************************
 * Purpose : To store all logic of the programs
 *           
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018          
 ***********************************************/

package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	/****
	 * This method is to calculate Permutation
	 ****/

	public void permutation(String str) {
		// System.out.println(str);
	}

	public void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/****
	 * This method is to calculate WindChill
	 ****/
	public double wind(double temperature, double velocity) {
		double windchill = 35.74 + 0.6215 * temperature + (0.4275 - 35.75) * Math.pow(velocity, 0.16);
		return windchill;
	}

	/****
	 * This method is to find the square root
	 ****/
	public double root(int a, int b, int c) {
		double root1, root2;
		double delta = ((b * b) - (4 * a * c));

		if (delta > 0) {

			System.out.println("Roots are real and unequal");
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("First root is:" + root1);
			System.out.println("Second root is:" + root2);
		}

		else if (delta == 0) {
			System.out.println("Roots are real and equal");
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Root:" + root1);
		} else {
			System.out.println("Roots are imaginary");
		}
		return delta;
	}

	/****
	 * This method is to find the one string anagram of another
	 * 
	 * @return
	 ****/
	public static boolean isAnagram(String string1, String string2) {
		// int n1=str1.length();
		// int n2=str2.length();
		char n1[] = string1.toLowerCase().toCharArray();
		char n2[] = string2.toLowerCase().toCharArray();
		Arrays.sort(n1);
		Arrays.sort(n2);

		if (n1.length != n2.length) {
			return false;
		} else {

			for (int i = 0; i < n1.length; i++) {

				boolean isAnagram;
				if (n1[i] == n2[i]) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}

			}

		}
		return true;
		// System.out.println(str1.compareTo(str2);
	}

	/****
	 * This method is to find prime number between a given range
	 ****/
	public void prime(int lowerLimit, int upperLimit) {
		for (int i = lowerLimit; i <= upperLimit; i++) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println(i);
			}
		}
	}

	/****
	 * This method is to sort a integer list and print it, using insertion sort
	 ****/
	public static void insertionSort(int array[]) {
		for (int i = 1; i < array.length; ++i) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");

		System.out.println();
	}

	/****
	 * This method is to sort a string list using insertion sort
	****/
	  public static void insertionString(String inputArray[])
	  {
		  int i = 0, j =0;
		  String key = inputArray[i];
		  for (i = 1; i < inputArray.length; i++)
		  {
			  for (j = i; j > 0; j--) 
			  {
				  if (key.compareTo(inputArray[j - 1]) < 0) 
				  {
					  inputArray[j] = inputArray[j - 1];
				  } 
				  else
				  break; 
			  }
			  inputArray[j] = key;
		  }
	  }
	  
	  public static void printInputArray(String[] inputArray) 
	  { 
		  for (int i = 0;i < inputArray.length; ++i) 
		  {
			  System.out.print(inputArray[i] + " ");
		  }
	  System.out.println();
	  
	  }

	/****
	 * This method is to sort a integer list using bubble sort
	 ****/
	
}
	