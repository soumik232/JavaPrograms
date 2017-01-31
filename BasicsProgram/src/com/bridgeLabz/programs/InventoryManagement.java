package com.bridgeLabz.programs;

import java.io.IOException;

import com.bridgeLabz.util.JsonUtility;
import com.bridgeLabz.util.Utility;

/**
 * @author bridgeit Satyendra Singh
 * Desc -> Create a JSON file having Inventory Details for Rice, 
   Pulses and Wheat with properties name, weight, price per kg. 
 * Use Library : Java JSON Library, For IOS JSON Library use NSJSONSerialization for parsing the JSON.
 * I/P -> read in JSON File
 * Logic -> Get JSON Object in Java or NSDictionary in iOS. Create Inventory Object from JSON. Calculate the value for every Inventory. 
 * O/P -> Create the JSON from Inventory Object and output the JSON String
 */
public class InventoryManagement 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		JsonUtility ju = new JsonUtility();

		try {
			ju.writeObject();
			System.out.println("File Write");

			ju.readJsonFile();
			System.out.println("File Read");

		} catch( Exception e)
		{
			e.printStackTrace();
		}
	}

}
