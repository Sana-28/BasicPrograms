package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

/**
 * Purpose: this program Flip Coin and prints
 *  percentage of Heads and Tails
 * @author SanaShaikh
 * @since   13/01/2018  
 */
public class FlipCoin {
	public static void main(String[] args) {
		{
			System.out.println("Enter number of times you want to flip coin");
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			Utility.flipCoin(input);
			scanner.close();
		}
	}

}
