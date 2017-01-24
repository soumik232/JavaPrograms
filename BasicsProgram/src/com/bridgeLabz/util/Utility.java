package com.bridgeLabz.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utility 
{
	Scanner sc = new Scanner(System.in);
	String temp="";
	private long start;
	private long stop;
	private boolean running;
	//Read file
	public String readFile() throws Exception 
	{
		String file="";
		System.out.println("enter path where your file present..");
		String path =inputString();
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader
		    								(new FileInputStream(path)));
		    while ((temp = br.readLine()) != null)
		    {
		    	file+=temp;
		    }
		    br.close();
		} catch (IOException e) {
		    System.out.println("ERROR: unable to read file " + path);
		    e.printStackTrace();   
		}
		return file;
	}
	//binarySearch for String
	public int binarySearch(String [] a) 
	{
		 System.out.println("enter a word to be search");
		 String search=inputString();
		 int first = 0;
		 int last  = a.length;
		 while (first < last) 
		 {
			 int mid = (first + last) / 2;
		     if (search.compareTo(a[mid]) < 0) 
		         last = mid;
		     else if (search.compareTo(a[mid]) > 0) 
		    	 first = mid + 1;
		     else 
		         return mid;
		 }
		    return -1;
	}
	//binarySearch for integer
	public int binarySearchInt(int [] a)
	{
		System.out.println("Enter number to be search..");
		int find=inputInteger();
		int first = 0;
		int last = a.length;
		while(first<last)
		{
			int mid = (first+last)/2;
			if(find==mid)
				return mid;
			else if(find>a[mid])
				first=mid+1;
			else if(find<a[mid])
				last = mid;
		}
		return -1;
	}
	//Invoking String
	public String inputString()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String read="";
		try {
			 String s = br.readLine();
			 read=s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return read;
	}
	//Insertion sort for String
	public void insertionSort(String[] str) 
	{
		for (int i = 1; i < str.length; i++) 
		{
			String temp = str[i];
			int j = i-1;
			while(j>-1 && str[j].compareToIgnoreCase(temp)>0)
			{
				str[j+1]=str[j];
				j--;
			}
			str[j+1]=temp;
		}
	}
	//Insertion sort for integer
	public void insertionSortInt(int [] a)
	{
		for (int i = 1; i < a.length; i++) 
		{
			int key =a[i];
			int j = i-1;
			while(j>-1 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	public int inputInteger() 
	{
		int temp = sc.nextInt();
		return temp ;
	}
	//Bubble sort for String
	public void bubbleSort(String[] str) 
	{
		for (int i = 0; i < str.length-1; i++) 
		{
			for (int j = 0; j < str.length-1-i; j++) 
			{
				if(str[j].compareToIgnoreCase(str[j+1])>0)
				{
					String temp = str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
	}
	//Bubble sort for integer
	public void bubbleSortInt(int[] arr) 
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr.length-1-i; j++) 
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	//starting watch
	public void startTime() 
	{
	    this.start = System.currentTimeMillis();
	    this.running = true;
	}
	//Elapse time in milliseconds
	public long getElapseTime()
	{
		long elapsed;
		if(running)
			elapsed = System.currentTimeMillis()-start;
		else
			elapsed = stop-start;
		return elapsed;
	}
	//elapse time in seconds
	public long getElapseTimeSec()
	{
		long elapsed;
		if(running)
			elapsed=(System.currentTimeMillis()-start)/1000;
		else
			elapsed = (stop-start)/1000;
		return elapsed;
	}
	//Stopping watch
	public void stopTime() 
	{
		this.stop = System.currentTimeMillis();
		this.running = false;
		
	}
	//providing delay time for StopWatch
	public void delay()
	{
		System.out.println("give delay time....in seconds");
		long time= sc.nextLong()*1000;
		try {Thread.sleep(time);} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
