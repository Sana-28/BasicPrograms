package com.bridgelabz.dataStructure;

import com.bridgelabz.util.Utility;
/**Purpose: This program takes a input string from user,
 * and use a deque to store the characters of the string. 
 * We will process the string from left to right and add 
 * each character to the rear of the deque
 * @author Sana Shaikh
 * @since 15/01/2018
 */
class PalindromeChecker {

    public static void main(String[] args) {

    	System.out.print("Enter any string:");
        String inputString = Utility.getString();
        //System.out.println(inputString.toLowerCase());
        String lowerString=inputString.toLowerCase();
        Utility.palindromeChecker(lowerString);
    }
}