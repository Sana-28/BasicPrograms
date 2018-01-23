package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.util.Utility;


/***********************************************
 * Purpose :This program User Input and Replace String Template “Hello <<UserName>>, How are you?”        
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

public class UserName {
	public static void main(String[] args) {

		System.out.println("Enter The String....");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine(); 
		//String name=input.replace("<<UserName>>", name); 
		Utility.userName(input);
		scanner.close();
	}

}
