package com.bridgelabz.dataStructure;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Utility;

/**Purpose: This program is to find Prime Number and store only 
 * the numbers in that range that are Anagrams,And implemented 
 * using queue.
 * @author Sana Shaikh
 * @since 15/01/2018
 */
public class PrimeAnagramQueue {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listAnagram = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) {
			if (Utility.isPrime(i)) {
				list.add(i);
			}
		}
		
		System.out.println("prime numbers are:" + list);
		//System.out.println("Total number of prime numbers are:" + list.size());

		for (int j = 0; j < list.size() - 1; j++) {
			for (int k = j + 1; k < list.size() - 1; k++) {
				if (Utility.anagramChecker2(list.get(j), list.get(k))) {
					listAnagram.add(list.get(j));
				}
			}
		}

		System.out.println("\nAnagram numbers are :" + listAnagram);
		//System.out.println("\nTotal number of anagram numbers are :" + listAnagram.size());
		//Queue operations 
		QueueArray queue = new QueueArray(listAnagram.size());
		for (int i = 0; i < listAnagram.size() - 1; i++) {
			queue.insert(list.get(i));
		}

		//System.out.println(" data in queue=");
		queue.display();
	}
}
