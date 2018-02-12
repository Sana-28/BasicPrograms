package com.bridgelabz.objectOriented;

import com.bridgelabz.util.Utility;

/**Purpose:This program is used to manage a list of 
 * Doctors associated with the Clinique. 
 * @author SANA SHAIKH
 * @since 13/01/2018
 */
public class CliniqueManagement {

	public static void main(String[] args) {
		int choice;
		do
		{
			System.out.println("1.Add Patient:");
			System.out.println("2.Fix appointment:");
			System.out.println("3.Appointment Details:");
			System.out.println("4.Display Clinique Report:");
			System.out.println("5.Quit");
			choice=Utility.getInteger();
			
			switch(choice)
			{
			case 1:
				Utility.addPatient();
				break;
			case 2:
				Utility.fixAppointment();
				break;
			case 3:
				//Utility.appointmentDetails();
				break;
			case 4:
				Utility.displayCliniqueDetails();
				break;
			case 5:
				System.exit(0);
			}
		}
		while(choice<=5);
	}

}
