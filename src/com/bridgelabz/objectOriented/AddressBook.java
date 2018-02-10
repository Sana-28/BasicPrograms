package com.bridgelabz.objectOriented;

import com.bridgelabz.util.Utility;

/**Purpose:This program is to used to maintain an address book.
 * An address book holds a collection of entries, each recording
 * a person's first and last names, address, city, state, ZiPCode, and
 * phone number.
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
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
				Utility.editInformation();
				break;
				
			case 3:
				Utility.deletePerson();
				break;
				
			case 4:
				Utility.printAddressBook();
			case 5:
				System.exit(0);
				break;
			}
		}
		while (choice <= 4);
	}

}
