package com.bridgelabz.dataStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

import com.bridgelabz.util.Utility;

public class UnorderedList {

	public static void main(String[] args) throws Exception {
		File file = new File("/home/bridgelabz/Documents/file1.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));

		String string;
		while ((string =buffer.readLine()) != null)
			System.out.println(string);
		LinkedList<String> fileString=new LinkedList<String>(); 
		if(string!=null)
		{
			fileString.add("");
		}

	}
}
