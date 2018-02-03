package com.bridgelabz.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

import com.bridgelabz.util.Utility;

/**Purpose: This program is to implement Banking Cash Counter where people
 * come in to deposit Cash and withdraw Cash.
 * @author Sana Shaikh
 * @since 15/01/2018
 */
public class BankingCashCounter{
	public static int cash = 25000;

	public static void main(String[] args) {
		System.out.println("\n"+" ***Simulate Banking Cash Counter***" +"\n");
		System.out.println("Enter the number of people in a queue:");
		int numberOfPeople=Utility.getInteger();
		peopleQueue(numberOfPeople);
		System.out.println("Available balance in bank :" + cash);
	}

	static void peopleQueue(int numberOfPeople) {
		Queue<Integer> queue = new LinkedList<>();
		int choice;
		int i = 0,j=0;

		while (i < numberOfPeople) {
			queue.add(i);
			//System.out.println("Elements of queue-"+queue);
			i++;
		}
		while (j < numberOfPeople) {
			System.out.println(" Person " + (j + 1) + " \n 1.Deposit Cash \n 2.Withdraw Cash"
					+ " \n 3.Check Balance");

			choice = Utility.getInteger();
			if (choice == 1) {
				queue.remove();
				//System.out.println("removed element" + choice);
				Utility.deposite(cash);
				
			} else if (choice == 2) {
				queue.remove();
				Utility.withdraw(cash);
			}
			j++;
		}
	}
}