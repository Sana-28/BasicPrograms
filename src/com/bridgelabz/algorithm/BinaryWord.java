package com.bridgelabz.algorithm;

import java.util.*;
import java.util.Arrays;

public class BinaryWord {


	public static void main(String[] args) 
	{
		int i;  
	   Scanner scanner = new Scanner(System.in);

	   System.out.println("Enter number of words you wish to input: ");
	   int input=scanner.nextInt();

	   String[] words= new String[input];

	   System.out.println("Enter the words");
	   for ( i = 0; i < words.length; i++)
	   {
	       System.out.print("Word " + (i + 1) + ": ");
	       words[i] = scanner.next();
	   }

	   System.out.println("enter the word you want to search for");
	   String word=scanner.next();

	   Arrays.sort(words);
	   int index= Arrays.binarySearch(words,word);
	   System.out.println(word+ "="+ index);


	}
}
