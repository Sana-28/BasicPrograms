package com.bridgelabz.algorithm;

import java.io.*;
import java.util.Arrays;

import com.bridgelabz.util.Utility;

/**Purpose: This program reads in a list of words,
 *and prints the result if the word is found or not
 * @author Sana Shaikh
 * @since   13/01/2018   
 */
public class BinaryWord {
	
	static String string = null;
	String search;
	private static BufferedReader buffer;

	public static void main(String[] args) throws IOException 
	{
		  File file = new File("/home/bridgelabz/Documents/file.txt");
		  FileReader read = new FileReader(file);
		  buffer = new BufferedReader(read);
		  
		  if(file.exists())
			{
				if(file.canRead())
				{

					string = buffer.readLine();
				}
				else
				{
					System.out.println("File can not read");
				}
			}
			else
			{
				System.out.println("File not found");
			}
		// Utility.bubbleSort(array);
		  

	}
}
