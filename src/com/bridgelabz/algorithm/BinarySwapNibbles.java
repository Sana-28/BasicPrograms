package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySwapNibbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scanner.nextInt();
		Utility.toBinary(number);
		
		scanner.close();

	}
	//unsigned char swapNibbles()

}
