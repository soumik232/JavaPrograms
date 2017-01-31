package com.bridgeLabz.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author bridgeit Satyendra singh
 * This class is use to read , write or fetch data from json file
 * Provide Utility functionality for json file. 
 */
public class JsonUtility 
{
	Utility u = new Utility();
	String name;
	String weight;
	Double price;
	/**
	 * This method basically write Json Object into given filepath location
	 * If this method unable to write object into file then its throws Exception.
	 * Exception- IOException and Custom Message.
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public void writeObject() throws Exception
	{
		JSONObject product = new JSONObject();
		JSONArray item = new JSONArray();
		//JSONObject food = new JSONObject();
		
		System.out.println("enter number of product");
		int num = u.inputInteger();
		
		for (int i = 0; i < num; i++) 
		{
			JSONObject fodData = new JSONObject();
			JSONArray foodDetails = new JSONArray();
			System.out.println("enter a name of grains");
			String grain = u.inputString();
			
			System.out.println("Enter type of "+ grain +":");
			int no = u.inputInteger();
			
			for (int j = 0; j < no; j++) 
			{
				JSONObject data = new JSONObject();
				
				System.out.println("Enter product name : ");
				String pName = u.inputString();
				data.put("Name:", pName );
				
				System.out.println("Enter product weight : ");
				double weight = u.inputDouble();
				data.put("weight:", weight );
				
				System.out.println("Enter product price per kg : ");
				double price = u.inputDouble();
				data.put("price per kg:", price );
				
				foodDetails.add(data);
			}
			fodData.put(grain,foodDetails);
			item.add(fodData);
		}
		
		product.put("Data",item);
		
		try { 
			System.out.println("Writting JSON into file ..."); 
			FileWriter jsonFileWriter = new FileWriter("/home/bridgeit/Desktop/my.json");
				jsonFileWriter.write(product.toJSONString());
				jsonFileWriter.flush();
				jsonFileWriter.close(); 
				System.out.println("Data Added:"+product);
		} 
			catch (IOException e) 
		{
			e.printStackTrace(); 
			Exception ex = new Exception("Something is wrong pleasxe try again..");
			throw ex;
		}
	}
	/**
	 * Basically this method read json file with respect to specific path.
	 * If this method unable to read file then its throws Exception 
	 * Exception - IO Exception | FileNotFoundException | ParseException.
	 * @throws Exception 
	 */
	public void readJsonFile() throws  Exception
	{
		System.out.println("Enter file path");
		String path = u.inputString();
		JSONParser parser = new JSONParser();
		try
		{
			Object object = parser.parse(new FileReader(path));
			JSONObject item = (JSONObject) object;
			JSONArray objName = (JSONArray) item.get("data");
			  
			String [] str = {"rice","pulse"};
			  
			for (int i = 0; i < objName.size(); i++) 
			{
				JSONObject food = (JSONObject) objName.get(i);
				JSONArray foodData =(JSONArray) food.get(str[i]);
				System.out.println(str[i]);
				for (int j = 0; j < foodData.size(); j++) 
				{
					JSONObject data = (JSONObject) foodData.get(j);
					name = (String) data.get("Name");
					System.out.println(name);
					weight = (String) data.get("weight");
					System.out.println(weight);
					price = (Double) data.get("price per kg");
					System.out.println(price);
				}
			}
		}
		catch(IOException | ParseException e)
		{
			e.printStackTrace();
			Exception ex  = new Exception("Unable to read file"); 
			throw ex;
		}
	}
}
