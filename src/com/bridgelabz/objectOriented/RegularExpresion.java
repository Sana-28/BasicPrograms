package com.bridgelabz.objectOriented;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class RegularExpresion {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String userName = scanner.next();

		System.out.println("Enter your full Name");
		String fullUserName=scanner.nextLine();

		System.out.println("Enter your Mobile Number:");
		String mobileNumber=scanner.next();

		String message=" Hello <<name>> , "
				+ "We have your full name as <<full name>>  in our system."
				+ " Your contact number is 91-xxxxxxxxxx. "
				+ "Please,let us know in case of any clarification.Thank you BridgeLabz 01/01/2016. ";
		//System.out.println("" +message);


		System.out.println(Utility.regexExpression(userName,fullUserName,mobileNumber,message));
		scanner.close();
	}
}
