/**
 * @author Satyendra Singh bridgeit
 * Desc -> Reads in integers prints them in sorted order using Bubble Sort
 *I/P -> read in the list ints and string
 *O/P -> Print the Sorted List 
 */
package com.bridgeLabz.programs;

import java.util.Arrays;
import com.bridgeLabz.util.Utility;

public class BubbleSort 
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
		u.bubbleSort(str);
		System.out.println(Arrays.toString(str));
		int [] arr = new int[5];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("enter integer :");
			arr[i]=u.inputInteger();
		}
		System.out.println(Arrays.toString(arr));
		//integer sorting using insertion sort
		u.bubbleSortInt(arr);		
		System.out.println(Arrays.toString(arr));
	}

}
