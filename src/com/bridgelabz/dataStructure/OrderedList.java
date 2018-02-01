package com.bridgelabz.dataStructure;
import java.util.LinkedList;
import com.bridgelabz.util.Utility;

/**Purpose: This program is to read from file the list of 
 * words and take user input new word to search and if it 
 * is found then remove it,else add to the list
 * @author Sana Shaikh
 * @since 13/01/2018
 *
 */
public class OrderedList 
{
	public static void main(String[] args)
	{
		try
		{
			//Initialize the linked list
			LinkedList<Integer> linkedlist=new LinkedList<Integer>();
			Utility.readingDataFromFile(linkedlist);
			
			System.out.println("Enter the word to be search:");
			int search = Utility.getInteger();
			Utility.searchFromFile(linkedlist,search);
			Utility.writeDataToFile(linkedlist);
		}
		catch(Exception e)
		{
			//trace exception where actual problem occured
			e.printStackTrace();
		}
	}
}