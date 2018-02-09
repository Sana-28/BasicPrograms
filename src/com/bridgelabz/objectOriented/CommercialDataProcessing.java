package com.bridgelabz.objectOriented;

import java.io.IOException;

import com.bridgelabz.util.Utility;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * Purpose: This program is to implements a data type that might be used by a
 * financial institution to keep track of customer information
 * 
 * @author SANA SHAIKH
 * @since 15/01/2018
 */
public class CommercialDataProcessing {

	public static void main(String[] args) throws Throwable {

		// Utility.companyShares();

		int choice;
		do {
			System.out.println("\n"+"Enter your choice:");
			System.out.println("1.Create user:");
			System.out.println("2.Buy:");
			System.out.println("3.Sell:");
			System.out.println("4.Display:");
			System.out.println("5.Exit:");
			choice = Utility.getInteger();

			switch (choice) {
			case 1:
				System.out.println("Create User:" + "\n");
				Utility.createUser();
				break;

			case 2:
				Utility.buyShare();
				break;

			case 3:
				Utility.sellShare();
				break;

			case 4:
				Utility.displayReport();
				break;
			case 5:
				System.exit(0);
				break;
			}
		} while (choice <= 4);

	}
}
