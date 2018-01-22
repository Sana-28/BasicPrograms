/***********************************************
 * Purpose :This program calculate and prints windchill​ 
       
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

package com.bridgelabz.functional;
import com.bridgelabz.util.Utility;
import java.util.Scanner;
public class WindChill 
{
	public static void main(String args[])
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the temperature of wind...");
	double temperature=scanner.nextDouble();
	System.out.println ("Enter the velocity of wind...");
	double velocity=scanner.nextDouble();
	scanner.close();
	Utility utility = new Utility();
	System.out.println(utility.wind(temperature, velocity));
	}
}
