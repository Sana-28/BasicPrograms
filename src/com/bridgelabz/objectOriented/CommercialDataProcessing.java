package com.bridgelabz.objectOriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.util.Utility;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * Purpose: This program is to implements a data type that might be used by a
 * financial institution to keep track of customer information
 * 
 * @author SANA SHAIKH
 * @since 15/01/2018
 */
public class CommercialDataProcessing {
	public static void main(String[] args) throws IOException, ParseException,
	Throwable {
		JSONParser parser = new JSONParser();

		try {
			Object object = parser.parse(new FileReader("/home/bridgelabz/" 
		            + "SANAworkspace/BasicProgram/src/com/bridgelabz/"
		            + "objectOriented/companyShares.json"));
			JSONObject jsonObject = (JSONObject) object;
			JSONArray companyShares = (JSONArray) jsonObject.get("Company Shares");

			System.out.println("******Share Stock******" + "\n");
			Iterator<?> iterator = companyShares.iterator();
			while (iterator.hasNext()) {
				JSONObject jsonObject1 = (JSONObject) iterator.next();

				String Symbol = (String) jsonObject1.get("Symbol");
				System.out.println("Stock Symbol    :" + Symbol);
				int numberOfShares = Integer.parseInt(jsonObject1.get("ShareCount").toString());
				System.out.println("Number of Shares:" + numberOfShares);
				int price = Integer.parseInt(jsonObject1.get("Price").toString());
				System.out.println("Share Price     :" + price + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("Enter your choice:");
			System.out.println("1. Create user");
			System.out.println("2. Buy Share");
			System.out.println("3. Sale Share");
			System.out.println("4. Display Details");
			System.out.println("5. Exit");
			int choice = Utility.getInteger();
			switch (choice) {
			case 1:
				Utility.createUser();
				break;

			case 2:
				// Utility.buyShare();
				break;

			case 3:
				// Utility.saleShare();
				break;

			case 4:
				// Utility.display();
				break;
				
			case 5:
				break;

			default:
				return;
			}
		}
	}
	}