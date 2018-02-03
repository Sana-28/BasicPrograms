package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;

 /**Purpose:This program is to check Arithmetic Expression is Balanced
 * or not.
 * @author Sana Shaikh
 * @since 15/01/2018
 */
public class BalancedParenthesis 
{
	public static void main(String[] args) 
	{
		boolean result=false;
		System.out.println("Enter arithmatic expression");
		String string = Utility.getString();
		if(string.length()==0) 
		{
			System.out.println("Enter the expression: ");
		}
		else
		{	
			result = Utility.isValid(string);
			if(result == true) 
			{
				System.out.println("True!! It is valid expression.");
			}
			else
			{
				System.out.println("False!! it is not valid expression");
			
			}
		}
	}
}
 