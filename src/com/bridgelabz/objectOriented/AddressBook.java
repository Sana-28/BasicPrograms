package com.bridgelabz.objectOriented;

import com.bridgelabz.util.Utility;

public class AddressBook {

	public static void main(String[] args) {
		
		int choice;
		do
		{
			System.out.println("1.Add NEw Person:");
			System.out.println("2.Edit Information of Person:");
			System.out.println("3.Delete the Person:");
			System.out.println("4.Display Address Book");
			System.out.println("5.Quit");
			choice=Utility.getInteger();
			switch(choice)
			{
			case 1:
				Utility.addNewPerson();
				break;
				
			case 2:
				//Utiltiy.editInformation();
				break;
				
			case 3:
				//Utility.deletePerson();
				break;
				
			case 4:
				//Utility.printAddressBook();
			case 5:
				System.exit(0);
				break;
			
			}
			
		}
		while (choice <= 4);
	}

}
