package com.bridgelabz.objectOriented;

import com.bridgelabz.util.Utility;

/**
 * Purpose: This program is to read in the Message and use regex to replace it
 * with user input.
 * 
 * @author SANA SHAIKH
 * @since 15/01/2018
 */
public class RegularExpression {

	public static void main(String[] args) {
		try {
			char again;
			do {
				String message = "\n" + " Hello <<name>>, We have your full name as"
						+ "<<full name>> in our system. \n your contact number"
						+ " is 91-xxxxxxxxxx.\n Please,let us know in case of"
						+ " any clarification \n Thank you BridgeLabz 01/01/2016.";
				System.out.println("" + message);

				System.out.println("Enter your name");
				String firstName = Utility.getWords();

				System.out.println("Enter Full name");
				String fullName = Utility.getWords();

				System.out.println("Enter 10 digit phno:");
				String mobileNumber = Utility.getWords();

				System.out.print("Enter Date in dd/mm/yyyy format: ");
				String date = Utility.getWords();

				Utility.regexExpression(message, firstName, fullName, mobileNumber, date);

				System.out.println("do you want to continue?" + "Press y");

				again = Utility.getString().charAt(0);
			} while (again == 'y' || again == 'Y');
			System.out.println("end");
		} catch (Exception e) {
			System.out.println("Type Error!!!");
		}
	}

}
