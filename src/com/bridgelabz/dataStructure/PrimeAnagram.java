package com.bridgelabz.dataStructure;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Utility;

public class PrimeAnagram{
	public static void main(String[] args) {
		//Initialize a arraylist
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listanagram = new ArrayList<Integer>();
		
		//loop to check prime between 0-1000
		for (int i = 0; i < 1000; i++) {
			if (Utility.isPrime(i)) {
				list.add(i);
			}
		}
		System.out.println("prime numbers are:" + list);
		//System.out.println("Total number of prime numbers are:" + list.size());
		
		//another loop to store primes
		for (int j = 0; j < list.size() - 1; j++) {
			//another loop to store prime and compare
			for (int k = j + 1; k < list.size() - 1; k++) {
				
				if (Utility.anagramChecker2(list.get(j), list.get(k))) {
					listanagram.add(list.get(j));
				}
			}
		}
		System.out.println("\nAnagram numbers are :" + listanagram);
		//System.out.println("Total number of anagram numbers are :" + listanagram.size());
	}
}

