package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;
class PalindromeChecker {

    public static void main(String[] args) {

    	System.out.print("Enter any string:");
        String inputString = Utility.getString();
        //System.out.println(inputString.toLowerCase());
        String lowerString=inputString.toLowerCase();
        Utility.palindromeChecker(lowerString);
    }
}