/***********************************************
 * Purpose :This program is to find the roots of the equation
       
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

package com.bridgelabz.functional;
import com.bridgelabz.util.Utility;
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first input value");
		int a=scanner.nextInt();
		System.out.println("Enter second input value");
		int b=scanner.nextInt();
		System.out.println("Enter third input value");
		int c=scanner.nextInt();
		scanner.close();
		Utility utility = new Utility();
		System.out.println(utility.root(a,b,c));
	}

}
