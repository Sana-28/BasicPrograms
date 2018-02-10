package com.bridgelabz.objectOriented;

import java.io.IOException;
import java.util.LinkedList;

import org.json.simple.parser.ParseException;

import com.bridgelabz.util.Utility;

/**
 * Purpose:he List of CompanyShares in a Linked List So new CompanyShares can be
 * added or removed easily.
 * 
 * @author SANA SHAIKH
 * @since 15/01/2018
 */
public class CompanyShares {

	public static void main(String[] args) throws Throwable {
		int choice;
		do {
			System.out.println("Press 1.To add Company Shares");
			System.out.println("Press 2.To Remove Shares");
			choice = Utility.getInteger();

			switch (choice) {

			// ADd a share symbol
			case 1:
				
				Utility.addShare();
				break;

			// Remove a share Symbol
			case 2:
				System.out.println("Enter index of share you want to Remove:");
				int position=Utility.getInteger();
				//list.remove(position);
			    //Utility.removeShare();
				break;

			case 3:
				
				break;
			case 4:
				break;
			}
		} while (choice < 2);

	}
}
