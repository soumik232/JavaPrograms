/**
 * Desc -> Read in a list of words from File. Then prompt the user to enter a word to search the list.
 *  The program reports if the search word is found in the list.
 *I/P -> read in the list words comma separated from a File and then enter the word to be searched
 *Logic -> Use Arrays to sort the word list and then do the binary search
 *O/P -> Print the result if the word is found or no.
 *and search integer number using binarySearch.
 */
package com.bridgeLabz.programs;

import java.util.Arrays;

import com.bridgeLabz.util.Utility;

public class BinarySearch 
{

	public static void main(String[] args) throws Exception
	{
		Utility u = new Utility();
		
		String file= u.readFile();
		System.out.println(file);
		//split file through comma
		String [] str =file.split(",");
		//sorting string words
		Arrays.sort(str);
		//user search a word using binarysearch
		int in=u.binarySearch(str);
		if(in==-1)
			System.out.println("word not found....");
		else
			System.out.println("word found at index "+in);
		int [] arr = new int[5];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("enter integer :");
			arr[i]=u.inputInteger();
		}
		System.out.println(Arrays.toString(arr));
		//Search integer using binarySearch
		int index=u.binarySearchInt(arr);
		if(index!=-1)		
			System.out.println("Number avilable at index no :"+index);
		else
			System.out.println("Number is not avialable in this array");
	}

}
