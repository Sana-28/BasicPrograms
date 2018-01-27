package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose: This program  outputs the binary (base 2) 
 * representation of the decimal 
 * @author Sana shaikh
 *@since   13/01/2018   
 */
public class ToBinary {

	public static void main(String[] args) {
	
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number:");
			int number = scanner.nextInt();
			Utility.convertBinary(number);
			 scanner.close();
	}

}
