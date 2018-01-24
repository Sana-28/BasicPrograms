package com.bridgelabz.functional;

import java.lang.String;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose:This program takes a number and generate distinct coupon

 * @author SanaShaikh
 * @since  13/01/2018  
 *
 */
public class CouponNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number of Coupons");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		Utility.couponNumber(number);
		scanner.close();
	}

}
