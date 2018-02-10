package com.bridgelabz.objectOriented;

import com.bridgelabz.util.Utility;

public class CliniqueManagement {

	public static void main(String[] args) {
		int choice;
		do
		{
			System.out.println("1.Add Patient:");
			System.out.println("2.:");
			System.out.println("3.:");
			System.out.println("4.");
			System.out.println("5.Quit");
			choice=Utility.getInteger();
			
			switch(choice)
			{
			case 1:
				//Utility.addPatient();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
			}
		}
		while(choice<=5);
	}

}
