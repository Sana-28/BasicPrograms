package com.bridgelabz.algorithm;

import com.bridgelabz.util.Utility;

/**
 * Purpose: This program outputs the binary representation of the decimal
 * 
 * @author Sana shaikh
 * @since 13/01/2018
 */
public class ToBinarySwapNibbles {

	public static void main(String[] args) {

		int decimal;
		System.out.println("Enter the Number:");
		decimal = Utility.getInteger();
		String binary = Utility.toBinary(decimal);
		System.out.println("The binary number corresponding to decimal:" + (binary));
		char[] array = binary.toCharArray();

		int sum = 0;
		int result = (int) Utility.toDecimal(array, sum);
		Utility.isPowerOfTWo(result);
		System.out.println(Utility.isPowerOfTWo(+result) ? "Number is power of two" : "Number is not power of two");

		while (binary.length() != 8) {
			binary = "0" + binary;
		}
		int j = 4;
		char array1[] = binary.toCharArray();
		for (int i = 0; i < array1.length / 2; i++) {
			char temp1 = array1[i];
			array1[i] = array1[j];
			array1[j] = temp1;
			j++;
		}
		System.out.print("After Swapping the nibbles: ");
		System.out.println(array1);
		int result1 = (int) Utility.toDecimal(array1, 0);

		System.out.println("Decimal form after swapping nibbles.. : " + (int) (result1));
	}
}
