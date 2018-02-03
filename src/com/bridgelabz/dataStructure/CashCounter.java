package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;

/**Purpose: This program is to implement Banking Cash Counter where people
 * come in to deposit Cash and withdraw Cash
 * @author Sana Shaikh
 *
 */
public class CashCounter{

	public static void main(String[] args) {
		int ch = 0 , amount_Deposite,amount_Withdraw ;
		cashCounterQueue q=new cashCounterQueue();
		do
		{ 
			System.out.println();
		   	System.out.println("\n"+" ***Simulate Banking Cash Counter***" +"\n");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3.Number of people in the Queue ");
		   	System.out.println("4.Display Balacne");
		   	System.out.println("5.Exit");
		   	System.out.println();
		   	int choice=Utility.getInteger();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		amount_Deposite=Utility.getInteger();
			  		q.insert(amount_Deposite);
			   		q.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
			   		amount_Withdraw=Utility.getInteger();
			   		q.remove();
			   		System.out.println(" Your Available Balance is: "); 
			   		q.display();
			   		break;
			case 3:
					int j=q.getSize();
					System.out.println("The Number of People in Queue is: "+j);	
					break;
			case 4: System.out.println(" Your Available Balance is: "); 
	   				q.display();
	   				break;
		 
		   	default: 
			   		System.out.println("You entered wrong choice");
			   		return;
		   	}
	   	}
while(ch<5);
	}
}