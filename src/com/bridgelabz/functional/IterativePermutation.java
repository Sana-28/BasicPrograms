package com.bridgelabz.functional;

import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class IterativePermutation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		int length = string.length();
		Utility.permutations(string, string.length());
		scanner.close();

	}

}
