package com.bridgelabz.functional;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the number of Coupons");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		for(int i=0;i<number; i++)
		{
			int Random=(int) (Math.random() * number);
			System.out.println("" +Random);
		}
		
}

}
