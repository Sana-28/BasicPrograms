package BankingCashCounter;

import com.bridgelabz.util.Utility;

public class BankingCashCounter {

	public static void main(String[] args) {
		System.out.println("\n"+" ***Simulate Banking Cash Counter***" +"\n");
		System.out.println("Enter the number of people in a queue:");
		int numberOfPeople=Utility.getInteger();
		Utility.addPeople(numberOfPeople);
		
		int choice;
		do
		{// Add your account number

			System.out.println("1. Deposit Cash"+"\n");
			System.out.println("2. Check Balance"+"\n");
			System.out.println("3. Withdraw Cash"+"\n");
			System.out.println("4. Quit"+"\n");
			
			System.out.println("Enter your choice: ");
			choice = Utility.getInteger();
			
			switch (choice)
			{
				case 1:
					System.out.println("Enter amount to deposit in your Account:");
					int amount=Utility.getInteger();//Amount deposited
					Utility.deposit(amount);
				case 2:	
					
					//Utility.deposit();
					
				case 3:
					
				case 4:
					
				case 5:
					
			
				default:
					System.out.println("\n"+" Invalid Choice");
			}
	
		}
		while(choice!=5);
		
}
}
