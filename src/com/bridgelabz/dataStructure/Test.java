package com.bridgelabz.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

import com.bridgelabz.util.Utility;

public class Test {
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
				withdraw(cash);

			} else if (choice == 2) {
				queue.remove();
				deposite(cash);
			} else if(choice==3)
			{
				queue.remove();
				checkBalance();
			}
			j++;
		}
		
	}

	private static void deposite(int cash) {
		// TODO Auto-generated method stub
		int maxCount=3;
		Queue<String> queue = new LinkedList<String>();
		for (int i=0; i<maxCount; i++)
		{
			System.out.print("Enter Nominee Name: ");
			String name = Utility.getString();
			queue.add(name);
			
			System.out.println("Enter your Account Number:");
			Integer number=Utility.getInteger();
			queue.add(Integer.toString(number));
			
			System.out.println("Enter your Account Balance:");
			int balance=Utility.getInteger();
			queue.add(Integer.toString(balance));
			//deposit(balance);
		}
		
	}
	

	private static void withdraw(int cash2) {
		// TODO Auto-generated method stub
//			int amount;
//			int balance;
//			if(balance>amount)
//			{
//			balance-=amount;
//			
//			else if(Bankbalance<=0)
//			{
//			System.out.println("maintain your account with Rs.2000 .");
//			}
		
	}	
	private static void checkBalance() {
		// TODO Auto-generated method stub
	}
}