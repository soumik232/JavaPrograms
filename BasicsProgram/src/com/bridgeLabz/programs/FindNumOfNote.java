package com.bridgeLabz.programs;
import com.bridgeLabz.util.Utility;
public class FindNumOfNote
{
	public static void main(String[] args) 
	{	
		Utility u = new Utility();
		int [] note ={1000,500,100,50,20,10,5,2,1};
		System.out.println("enter Change in Rs to be returned by the Vending Machine");
		int change = u.inputInteger();
		int minNote= u.countNote(note,change);
		System.out.println("Total note to be return :"+minNote);
	}

}

