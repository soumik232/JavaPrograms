/**
 * Desc -> Create Utility Class having following methods
 *     1.binarySearch method for integer
 *	   2.binarySearch method for String
 *	   3.insertionSort method for integer
 *     4.insertionSort method for String
 *     5.bubbleSort method for integer
 *     6.bubbleSort method for String
 *I/P -> Write main function to call the utility function
 *Logic -> Check using Stopwatch the Elapsed Time for every method call
 *O/P -> Output the Search and Sorted List. More importantly print elapsed time performance in descending order
 */
package com.bridgeLabz.programs;

import com.bridgeLabz.util.Utility;

public class PerformSort_Search 
{

	public static void main(String[] args) 
	{
		Utility u = new Utility();
		int [] a = {1,2,3,4,5,6};
		u.startTime();
		int in= u.binarySearchInt(a);
		u.stopTime();
		System.out.println(u.getElapseTimeSec()+" seconds time to take found number");
		String [] str = {"a","b","c","d","e","f"};
		u.startTime();
		int index= u.binarySearch(str);
		u.stopTime();
		System.out.println(u.getElapseTimeSec()+" seconds time to take found String");
	}

}
