package BankingCashCounter;

import com.bridgelabz.util.Utility;

public class BankingCashCounter {

	public static void main(String[] args) {
		System.out.println("\n"+" ***Simulate Banking Cash Counter***" +"\n");
		System.out.println("Enter the number of people in a queue:");
		int numberOfPeople=Utility.getInteger();
		Utility.addPeople(numberOfPeople);
		
		System.out.println("Enter your choice: ");
		int choice = Utility.getInteger();
		do
		{
			System.out.println("1. Add your account number"+"\n");
			System.out.println("2. Check Balance"+"\n");
			System.out.println("3. Withdraw Cash"+"\n");
			System.out.println("4. Deposit Cash"+"\n");
			System.out.println("5. Quit"+"\n");
			
			switch (choice)
			{
				case 1:
					int addAmount=Utility.getInteger();
					Utility.enqueue(addAmount);
				case 2:	
					
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
