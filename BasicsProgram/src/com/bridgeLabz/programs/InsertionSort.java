
/**
* @author Satyendra singh bridgeit
* Desc -> Reads in strings from standard input and prints them in sorted order.
*Uses insertion sort.
*I/P -> read in the list words and sort integer from particular array
*Logic -> Use Insertion Sort to sort the words in the String array
*O/P -> Print the Sorted List
*/
package com.bridgeLabz.programs;
import java.util.Arrays;
import com.bridgeLabz.util.Utility;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		String [] str = new String[5];
		//Initialize array elements
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print("enter  word :");
			str[i]=u.inputString();
		}
		System.out.println(Arrays.toString(str));
		//sorting String using insertion sort
		u.insertionSort(str);
		System.out.println(Arrays.toString(str));
		int [] arr = new int[5];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("enter integer :");
			arr[i]=u.inputInteger();
		}
		System.out.println(Arrays.toString(arr));
		//integer sorting using insertion sort
		u.insertionSortInt(arr);		
		System.out.println(Arrays.toString(arr));
	}

}
