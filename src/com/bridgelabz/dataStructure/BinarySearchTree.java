package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;

/**Purpose: This program is to find the number of binary search trees
 * @author Sana Shaikh
 * @since 15/01/2018
 */
public class BinarySearchTree {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter the number of test case.");
			int test = Utility.getInteger();
			
			System.out.println("Enter the number of node.");
			int node = Utility.getInteger();
			
			int count = 0;
			
			for (int i=1;i<=test;i++)
			{
				count = (int) Utility.find((int) node);
			}
			System.out.println("We have" +" "+count+ "trees using"+" "+node+"nodes");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}