package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

/**Purpose:This program takes stake amount, goal and trials
 *  from user and prints number of percentage won and lose
 * @author SanaShaikh
 * @since  13/01/2018 
 *
 */
public class Gambler {
	public static void main(String args[]) 
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter initial stake amount :");
		int stake = scanner.nextInt();

		System.out.println("set the goal amount :");
		int goal = scanner.nextInt();

		System.out.println("Enter number of times u want to play :");
		int trials = scanner.nextInt();

		Utility.gambler(stake, goal, trials);
		scanner.close();

	}
}
