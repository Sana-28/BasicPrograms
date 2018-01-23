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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	/**
	 * This program User Input and Replace String 
	 * Template“Hello <<UserName>>, How are you?” 
	  * @param input
	 */
	public static void userName(String input)
	{
		String REGEX = "<<UserName>>";
		String INPUT = "Hello <<UserName>> , How are you?";
		Pattern pattern  = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT); 
		INPUT = matcher.replaceAll(input); 
		System.out.println(INPUT);
	}
	
	/**
	 * This program Flips a Coin and print percentage 
	 * of Heads and Tails
	 * @param input
	 */
	public static void flipCoin(int input)
	{
		int flip;
		int headCount = 0;
		int tailCount = 0;
		for (flip = 1; flip <= input; flip++) {
			if (Math.random() < 0.5) {
				headCount++;
			} else {
				tailCount++;
			}
		}
		System.out.println("headCount=" + headCount);
		System.out.println("tailCount=" + tailCount);

		System.out.println("per of heads " + ((Double.valueOf(headCount)) * 100) / input + " %");
		System.out.println("per of tails " + ((Double.valueOf(tailCount)) * 100) / input + " %");
	}
	
	/** This program determine if it is a Leap Year.
	 * @param year
	 */
	public static void leapYear(int year) {
		if(((year%400==0) || ((year%100!=0) && (year%4==0))))
		{
			System.out.println("Year "+year+" is a Leap Year");
		}
		else
		{
			System.out.println("Year "+year+" is not a Leap Year");
		}

	}
	
	/**This program takes a command-line argument N 
	 * and prints a table of the powers of 2 that are
	 *  less than 2^N
	 * @param number
	 */
	public static void powerOfTwo(int number) {
		int i = 0;
		int power = 1;
		System.out.println("Powers of 2 that are less than 2^"+number);
		while (i < number)
		{
			System.out.println("2^"+i+" = " + power);
			power = power * 2;
			i++;
		}
		
	}
	
	/**This program prints the Nth harmonic number
	 * @param value
	 */
	public static void harmonicNumber(int value) {
		float i;
		float term;
	    float sum=0;
	    for(i=1;i<=value;i++)
		{
			term = 1/i;
			sum=sum+term;
		}
	    System.out.println("Sum of Harmonic series is=" +sum);
		
	}
	
	/**This program computes the prime factorization
	 *  of a Number
	 * @param number
	 */
	public static void primeFactoristaion(int number) {
		while(number%2==0)
		{
			System.out.println(2+ "");
			number/=2;
		}
		
		for(int i=3;i<=Math.sqrt(number);i+=2)
		{
			while(number%i==0)
			{
				System.out.println(i+ "");
				number/=i;
			}
		}
		
		if(number>2)
		{
			System.out.println(number);
		}
		
	}	
	
	/**
	 * @param stake
	 * @param goal
	 * @param trials
	 */
	public static void gambler(int stake, int goal, int trials) {
		int wins=0,i,loss=0;
		for(i=0;i<trials;i++)
		{
			int cash=stake;

			while(cash>0 && cash<goal)
			{
				if(Math.random()<0.5)
					cash++; 
				else 
					cash--; 
			}
			if(cash==goal) 
				wins++;
			else
				loss++;
		}
		System.out.println("Number of Percentage won..."+(100*wins)/trials+ "%");
		System.out.println("Number of Percentage loss..."+(100*loss)/trials+ "%");
		
	}

	
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
	 * This method takes temperature input in fahrenheit, outputs the temperature in Celsius or viceversa
	 ****/

	public static void temperatureConversion() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter 1 for Fahrenheit to Celsius" + "\nEnter 2 for Celsius to Fahrenheit" + "\nSomething else to Exit." + "\nYour Option:");
		int selection = input.nextInt();
		if (selection == 1) {
			System.out.println("Enter a degree in Fahrenheit:");
			far2cel();
		} else if (selection == 2) {
			System.out.println("Enter a degree in Celsius:");
			cel2far();
		} else {
			System.out.println("Invalid");
		}
		input.close();
	}

	private static void cel2far() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Double celsius = input.nextDouble();
		System.out.println(celsius + " celsius is " + ((celsius * 9 / 5.0) + 32) + " Fahrenheit");
		temperatureConversion();
		input.close();
	}

	private static void far2cel() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Double Fahrenheit = input.nextDouble();
		System.out.println(Fahrenheit + " Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0)) + " celsius");
		temperatureConversion();
		input.close();
	}

	/****
		This method takes a command-line argument N, asks you to think of a number between 0 and N-1,and always guesses the answer with n questions.

	 ****/

	public void search(int number) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Guess a number:");
		int guess=scanner.nextInt();
		for(int i = 1; i<=number-1; )
		{
			int first=1;
			int last=number-1;
			int mid= (first+ last)/2;
			
			System.out.println("");
			
			if (mid>guess)
			{
				mid=mid+1;
				System.out.println("The guess number is:"+mid);
				break;
			}
			else if(mid<guess)
			{
				mid=mid-1;
				System.out.println("The guess number is:"+mid);
				break;
			}
			else if(mid == guess)
			{
				System.out.println("The guess number is:"+mid);
				break;
			}
			else
			{
				System.out.println("Enter a valid number:");
				break;
			}
		}
		scanner.close();
	}

	/****
	 * This program binarySearch for integer an prints an output in sorted form
	 ****/
	
	public static int binarySearch(int[] array, int key) {
		int left=0;
		int right= array.length-1;
		
		while (left <= right)
		{
			int mid = (left + (array.length-1))/2;
			if(array[mid] == key)
				System.out.println("Element found" +array[mid]);
			
			if(array[mid] < key)
			{
				left=array[mid] +1;
				
			}
			else
			{
				right=array[mid]-1;
			}
			return 1;
	}
		return -1;
}
	/****
	 This program is to find day of week
	 ****/
	
	public static int dayOfWeek(int month,int day,int year)
	{
		System.out.println("Entered date is : " +month+"/"+day+"/"+year);
		int y0 = year - (14 -month) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 =month + 12*((14 -month ) / 12) - 2;
		int d0 = ( day + x + 31*m0/12)%7;
		return d0;
	}

	/**** This program to calculate the minimum number of Notes 
	 as well as the Notes to be returned by the Vending Machine
	  as a Change ****/
	
	public static void vendingMachine(int amount) {
		// TODO Auto-generated method stub
		int currency[]={1, 2, 5, 10, 20, 50, 100, 500, 1000};
		for(int i=amount-1; i>=0; i--)
		{
			
		}
	}

}
