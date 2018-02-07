package com.bridgelabz.objectOriented;

import java.io.FileReader;
/*import java.util.Iterator;
import org.json.simple.JSONArray;*/
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**Purpose: This program is to read a single object from json 
 * file and outputs the inventory cost.
 * @author Sana shaikh
 * @since 15/01/2018
 */
public class Inventory {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(
					new FileReader("/home/bridgelabz/SANAworkspace/BasicProgram/src/com/bridgelabz/objectOriented/inventory.json"));

			JSONObject jsonObject = (JSONObject) obj;

				String name = (String) jsonObject.get("Name");
				System.out.println("Name: " + name);

				String weight = (String) jsonObject.get("Weight");
				double weight1 = Double.parseDouble(weight);
				System.out.println("Weight: " + weight1 + " " + "kg");

				String price = (String) jsonObject.get("Price");
				double price1 = Double.parseDouble(price);
				System.out.println("Price:" + price1 + " " + "Rs/kg");

				double totalAmount=0;
				double amount = weight1 * price1;
				totalAmount = amount + totalAmount;
				System.out.println("Total Inventary cost.." + totalAmount);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
