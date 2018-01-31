package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String string;
		System.out.println("Enter the Parenthsis......");
		string=Utility.getString();
		System.out.println(Utility.isBalanced(string));
	}

}
