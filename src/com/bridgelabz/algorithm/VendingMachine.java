/***********************************************
 * Purpose :This program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

package com.bridgelabz.algorithm;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=scanner.nextInt();
		
		scanner.close();
		System.out.println("Amount contains Rs./coins is" );
		Utility.vendingMachine(amount);
		
	}

}
