package com.bridgelabz.objectOriented;

import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Purpose: This program is to create Inventory Object using JSON,read file and
 * read JSON output the JSON String
 * 
 * @author Sana Shaikh
 * @since 15/1/2018
 */
public class InventoryDataManagement1 {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();

		try {
			Object object = parser.parse(new FileReader(
					"/home/bridgelabz/SANAworkspace/BasicProgram"
					+ "/src/com/bridgelabz/objectOriented/inventory1.json"));

			JSONObject jsonObject = (JSONObject) object;
			// System.out.println(jsonObject);

			double amount = 0, totalAmount = 0;

			JSONArray Itemlist = (JSONArray) jsonObject.get("Itemlist");

			Iterator<?> iterator = Itemlist.iterator();

			while (iterator.hasNext()) {
				JSONObject jsonObject1 = (JSONObject) iterator.next();

				double weight = Double.parseDouble(jsonObject1.get("weight").toString());
				System.out.println("InventoryDetails : " + jsonObject1.get("item_Name") + " " + weight + " " + "kg"
						+ " " + "40Rs/kg");

				double price = Double.parseDouble(jsonObject1.get("price").toString());

				amount = weight * price;
				totalAmount = amount + totalAmount;
				// System.out.println("Total Inventary cost.." + totalAmount+
				// "\n");
			}
			System.out.println("\n" + "Total Inventary cost.." + totalAmount);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}