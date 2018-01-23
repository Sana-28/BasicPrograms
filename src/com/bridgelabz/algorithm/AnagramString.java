/***********************************************
 * Purpose :This program is to find one string is an anagram of second string.  
       
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

package com.bridgelabz.algorithm;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class AnagramString 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first string");
		String string1=scanner.nextLine();
		System.out.println("Enter second string");
		String string2=scanner.nextLine();
		scanner.close();
		//Utility utility = new Utility();
		if (Utility.isAnagram(string1, string2)) 
		{
			System.out.println(string1 + " " + string2 + " are anagram");
		} 
		else 
		{
			System.out.println(string1 + " " + string2 + " are not an anagram");
		}
		//System.out.println(utility.isAnagram(str1, str2));
	}

}
