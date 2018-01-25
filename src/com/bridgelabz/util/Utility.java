/***********************************************
 * Purpose : To store all logic of the programs
 *           
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018          
 ***********************************************/

package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter writer = new PrintWriter(System.out, true);

	/**
	 * This method takes User Input and Replace String Template“Hello
	 * <<UserName>>, How are you?”
	 * 
	 * @param input
	 */
	public static void userName(String input) {
		String REGEX = "<<UserName>>";
		String INPUT = "Hello <<UserName>> , How are you?";
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);
		INPUT = matcher.replaceAll(input);
		System.out.println(INPUT);
	}

	/**
	 * This method Flips a Coin and print percentage of Heads and Tails
	 * 
	 * @param input
	 */
	public static void flipCoin(int input) {
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

	/**
	 * This method determine if it is a Leap Year.
	 * 
	 * @param year
	 */
	public static void leapYear(int year) {
		if (((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))) {
			System.out.println("Year " + year + " is a Leap Year");
		} else {
			System.out.println("Year " + year + " is not a Leap Year");
		}

	}

	/**
	 * This method takes a command-line argument N and prints a table of the
	 * powers of 2 that are less than 2^N
	 * 
	 * @param number
	 */
	public static void powerOfTwo(int number) {
		int i = 0;
		int power = 1;
		System.out.println("Powers of 2 that are less than 2^" + number);
		while (i < number) {
			System.out.println("2^" + i + " = " + power);
			power = power * 2;
			i++;
		}

	}

	/**
	 * This function prints the Nth harmonic number
	 * 
	 * @param value
	 */
	public static void harmonicNumber(int value) {
		float i;
		float term;
		float sum = 0;
		for (i = 1; i <= value; i++) {
			term = 1 / i;
			sum = sum + term;
		}
		System.out.println("Sum of Harmonic series is=" + sum);

	}

	/**
	 * This method computes the prime factorization of a Number
	 * 
	 * @param number
	 */
	public static void primeFactoristaion(int number) {
		while (number % 2 == 0) {
			System.out.println(2 + "");
			number /= 2;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				System.out.println(i + "");
				number /= i;
			}
		}

		if (number > 2) {
			System.out.println(number);
		}

	}

	/**
	 * This method prints the percentage of win and lose
	 * 
	 * @param stake
	 * @param goal
	 * @param trials
	 */
	public static void gambler(int stake, int goal, int trials) {
		int wins = 0, i, loss = 0;
		for (i = 0; i < trials; i++) {
			int cash = stake;

			while (cash > 0 && cash < goal) {
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
			else
				loss++;
		}
		System.out.println("Number of Percentage won..." + (100 * wins) / trials + "%");
		System.out.println("Number of Percentage loss..." + (100 * loss) / trials + "%");

	}

	/**
	 * This method generates distinct coupon number
	 * 
	 * @param array
	 */
	public static void couponNumber(int number) {

		int[] array = new int[number];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * number);
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
				}
			}
		}
		for (int i : array) {
			System.out.println("Generated number is : " + i);
		}
		System.out.println("Distinct generated number are :" + number);
	}

	/**
	 * This method reads integer array from user
	 * 
	 * @param array
	 * @param rows
	 * @param columns
	 */
	public static void inputArray(Integer[][] array, int rows, int columns) {
		writer.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		Utility.printArray(array, rows, columns);
	}

	/**
	 * This method reads double array from user
	 * 
	 * @param array
	 * @param rows
	 * @param columns
	 */
	public static void inputArray(Double array[][], int rows, int columns) {
		writer.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scanner.nextDouble();
			}
		}
		Utility.printArray(array, rows, columns);

	}

	/**
	 * This method reads boolean input array from user
	 * 
	 * @param array
	 * @param rows
	 * @param columns
	 */
	public static void inputArray(Boolean array[][], int rows, int columns) {
		writer.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scanner.nextBoolean();
			}
		}
		Utility.printArray(array, rows, columns);

	}

	/**
	 * This method prints the output of 2D array
	 * 
	 * @param array
	 * @param rows
	 * @param columns
	 */
	public static <E> void printArray(E[][] array, int rows, int columns) {
		writer.println("Array elements are:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				writer.print(array[i][j] + "  ");
			}
			writer.println(" ");
		}
	}

	/**
	 * This method finds the triplet with sum zero
	 * 
	 * @param N
	 * @param array
	 */
	public static void findTriplet(int number, int[] array) {
		// System.out.println("hi..");
		boolean found = false;

		for (int i = 0; i < number - 2; i++) {
			for (int j = i + 1; j < number - 1; j++) {
				for (int k = j + 1; k < number; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println("Triplets are :" + array[i] + " " + array[j] + " " + array[k]);
						found = true;
					}
				}
			}
		}
		if (found == false)
			System.out.println("Triplets not Exist...");
	}

	/**
	 * This method calculates distance between two points
	 * 
	 * @param initial1
	 * @param initial2
	 * @param final1
	 * @param final2
	 */
	public static void findDistance(int initial1, int initial2, int final1, int final2) {
		double distance;
		distance = Math.sqrt((initial1 * final1) + (initial2 * final2));
		System.out.println("distancebetween initial and final points" + distance);

	}

	/**
	 * This method is to calculate Permutation
	 * 
	 * @param string
	 * @param left
	 * @param right
	 */
	public void permute(String string, int left, int right) {
		if (left == right)
			System.out.println(string);
		else {
			for (int i = left; i <= right; i++) {
				string = swap(string, left, i);
				permute(string, left + 1, right);
				string = swap(string, left, i);
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

	/**
	 * This method calculates the time between start and stop watch
	 * 
	 */
	public static void stopWatch() {

		System.out.println("Press 1 to Start the time:");
		scanner.nextLong();
		long startTime = System.currentTimeMillis();
		System.out.println("Start time.." + startTime);

		System.out.println("Press 2 to stop the time:");
		scanner.nextLong();
		long stopTime = System.currentTimeMillis();
		System.out.println("Stop Time." + stopTime);

		long elapsedTime = stopTime - startTime;
		// System.out.println("Elapsed time between start and stop.."
		// +elapsedTime);
		System.out.println(" " + (elapsedTime / 1000) % 60 + "sec");
	}

	/**
	 * This method is to find the square root
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
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
	 * This method is to calculate WindChill
	 * 
	 * @param temperature
	 * @param velocity
	 * @return
	 */
	public double wind(double temperature, double velocity) {
		double windchill = 35.74 + 0.6215 * temperature + (0.4275 - 35.75) * Math.pow(velocity, 0.16);
		return windchill;
	}

	/****
	 * This method is to find the one string anagram of another
	 * 
	 * @param string1
	 * @param string2
	 * @return
	 */
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

	/**
	 * This method sort the array using insertion sort
	 * 
	 * @param array
	 */
	public static <T extends Comparable> T[] insertionSort(T[] array) {

		int i, temporary;
		for (i = 1; i < array.length; i++) {
			T key = array[i];
			temporary = i;

			while (temporary > 0 && array[temporary - 1].compareTo(key) > 0) {
				array[temporary] = array[temporary - 1];
				temporary--;
			}
			array[temporary] = key;
		}
		return array;
	}

	/**
	 * THis method sorts list of elements using bubble sort
	 * 
	 * @param array
	 * @return
	 */
	public static <T extends Comparable> T[] bubbleSort(T[] array) {
		int i, j;
		int length = array.length;
		for (i = 0; i < length; i++) {
			for (j = 1; j < length - i; j++) {
				if ((array[j - 1]).compareTo(array[j]) > 0) {
					T temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * This method search a element in sorted list using binary search
	 * 
	 * @param array
	 * @param key
	 * @return
	 */
	public static <T extends Comparable> int binarySearch(T[] array, T key, int left, int right) {

		if (left > right)
			return 0;

		int mid = (left + right) / 2;

		if (array[mid].equals(key))
			return 1;
		else if ((array[mid]).compareTo(key) > 0)
			return binarySearch(array, key, left, mid - 1);
		else
			return binarySearch(array, key, mid + 1, right);
	}
	
	/**
	 * This method prints a sorted array
	 * 
	 * @param array
	 */
	public static <T> void printArray(T[] array) {
		System.out.println("Sorted array list :");
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + " ");

	}

	/****
	 * This method takes temperature input in fahrenheit, outputs the
	 * temperature in Celsius or viceversa
	 ****/

	public static void temperatureConversion() {
		// TODO Auto-generated method stub
		System.out.println("\nEnter 1 for Fahrenheit to Celsius" + "\nEnter 2 for Celsius to Fahrenheit"
				+ "\nSomething else to Exit." + "\nYour Option:");
		int selection = scanner.nextInt();
		if (selection == 1) {
			System.out.println("Enter a degree in Fahrenheit:");
			fahrenheitToCelsius();
		} else if (selection == 2) {
			System.out.println("Enter a degree in Celsius:");
			celsiusToFahrenheit();
		} else {
			System.out.println("Invalid");
		}

	}

	private static void celsiusToFahrenheit() {
		// TODO Auto-generated method stub
		Double celsius = scanner.nextDouble();
		System.out.println(celsius + " celsius is " + ((celsius * 9 / 5.0) + 32) + " Fahrenheit");
		temperatureConversion();
	}

	private static void fahrenheitToCelsius() {
		// TODO Auto-generated method stub
		Double Fahrenheit = scanner.nextDouble();
		System.out.println(Fahrenheit + " Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0)) + " celsius");
		temperatureConversion();
	}

	/**
	 * This method takes a command-line argument N, asks you to think of a
	 * number between 0 and N-1,and always guesses the answer with n questions.
	 * 
	 * @param number
	 */
	public void search(int number) {
		// TODO Auto-generated method stub
		System.out.println("Guess a number:");
		int guess = scanner.nextInt();
		for (int i = 1; i <= number - 1;) {
			int first = 1;
			int last = number - 1;
			int mid = (first + last) / 2;

			System.out.println("");

			if (mid > guess) {
				mid = mid + 1;
				System.out.println("The guess number is:" + mid);
				break;
			} else if (mid < guess) {
				mid = mid - 1;
				System.out.println("The guess number is:" + mid);
				break;
			} else if (mid == guess) {
				System.out.println("The guess number is:" + mid);
				break;
			} else {
				System.out.println("Enter a valid number:");
				break;
			}
		}
	}

	/****
	 * This program is to find day of week
	 ****/

	public static int dayOfWeek(int month, int day, int year) {
		System.out.println("Entered date is : " + month + "/" + day + "/" + year);
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;
	}

	/****
	 * This program to calculate the minimum number of Notes as well as the
	 * Notes to be returned by the Vending Machine as a Change
	 ****/

	public static void vendingMachine(int amount) {
		// TODO Auto-generated method stub
		int currency[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		for (int i = amount - 1; i >= 0; i--) {

		}
	}

}
