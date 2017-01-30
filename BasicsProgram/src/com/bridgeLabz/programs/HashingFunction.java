
package com.bridgeLabz.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author bridgeit Satyendra Singh
 * Desc -> Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search 
 * a number from a given set of number
 * I/P -> read a set of numbers from a file and take user input to search a number
 * Logic -> Firstly store the numbers in the Slot.
   Since there are 10 Numbers divide each number by 11 and the reminder put in the appropriate slot.
   Create a Chain for each Slot to avoid Collision. If a number searched is found then pop it or else push it.
   Use Map of Slot Numbers and Ordered LinkedList to solve the problem. In the Figure Below, you can see 
   number 77/11 reminder is 0 hence sits in the 0 slot while 26/11 remainder is 4 hence sits in slot 4
 * O/P -> Save the numbers in a file
 */
public class HashingFunction {

	public static void main(String[] args) throws FileNotFoundException
	{
		LinkedList<Integer> list1;
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(new File("/home/bridgeit/Desktop/myfile.text"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (s.hasNext()) {
			list.add(s.nextInt());
		}
		System.out.println(list);

		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		for (Integer integer : list) {
			System.out.println(integer);
			
			int slotNo = integer%11;
			System.out.println("Slot: "+slotNo);
			
			list1 = map.get(slotNo);
			if( list1 == null )
			{
				//System.out.println("Value is null");
				list1 = new LinkedList<Integer>();
				map.put(slotNo, list1);
			}
			
			//System.out.println("Value is not null");
			list1.add(integer);
		}
		System.out.println(map);
			
		System.out.println("Enter Number you want to search ");
		int num = sc.nextInt();
		int SlotNumber= num%11;
		//map1.get(SlotNumber);
		
		list1 = map.get(SlotNumber);
		System.out.println(list);
		if(list.contains(num))
		{
			System.out.println("Number is present \nshould be delete");
			System.out.println(list1.pop()+" is poped");
		}
		else
		{
			System.out.println(num+" is not present \nshould be push");
			list1.add(num);
		}
		System.out.println(map);
	}
}
