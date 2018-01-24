package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class Distance {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter initial point:");
		int initial1=scanner.nextInt();
		
		System.out.println("Enter initial point:");
		int initial2=scanner.nextInt();
		
		System.out.println("Enter final1point:");
		int final1=scanner.nextInt();
		
		System.out.println("Enter final point:");
		int final2=scanner.nextInt();
	
		Utility.findDistance(initial1, initial2, final1, final2);
		scanner.close();
	}

}
