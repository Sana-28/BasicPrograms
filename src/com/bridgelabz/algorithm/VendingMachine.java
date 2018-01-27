/**
 * Purpose :This program to calculate the minimum number
 *  of Notes as well as the Notes to be returned by the 
 *  Vending Machine as a Change
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 */

package com.bridgelabz.algorithm;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int notes[] = {1,2,5,10,50,100,500,1000};
		System.out.println("Enter the amount:");
		int amount = scanner.nextInt();
		int length = notes.length;
		int count = Utility.vendingMachine(notes,amount,length);
		System.out.println("Number of notes to be returned : " +count );
		scanner.close();
	}
}