package com.bridgelabz.algorithm;

import java.io.*;

import com.bridgelabz.util.Utility;

/**
 * Purpose: This program reads in a list of words, and prints the result if the
 * word is found or not
 * 
 * @author Sana Shaikh
 * @since 13/01/2018
 */
public class BinaryWord {

	public static void main(String[] args) throws IOException {
		try {
			String key;
			String word = null;
			File file = new File("/home/bridgelabz/Documents/file.txt");
			if (file.exists()) {
				if (file.canRead()) {
					BufferedReader bufferReader = new BufferedReader(new FileReader(file));
					word = bufferReader.readLine();
					System.out.println("File data:" + "\n" + word);

					bufferReader.close();
					String[] str = word.trim().split(" ");
					String[] string = Utility.bubbleSort(str);
					Utility.printArray(string);
					System.out.println("\n" + "\n" + "Enter the Key To search..");
					key = Utility.getString();

					if (Utility.binarySearch(string, key, 0, string.length - 1) > 0) {
						System.out.println("Element is found......");
					} else {
						System.out.println("Not Found......");
					}
				} else {
					System.out.println("File cannot read");
				}
			} else {
				System.out.println("File not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
