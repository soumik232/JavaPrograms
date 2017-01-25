package com.bridgeLabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utility 
{

	Scanner sc = new Scanner(System.in);
	String temp="";
	private long startTime;
	private long stopTime;
	private boolean running;
	private Node start;
	private Node last;
	public int size;
	private int top=-1;
	//Read file
	public String readFile() 
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
	    this.startTime = System.currentTimeMillis();
	    this.running = true;
	}
	//Elapse time in milliseconds
	public long getElapseTime()
	{
		long elapsed;
		if(running)
			elapsed = System.currentTimeMillis()-startTime;
		else
			elapsed = stopTime-startTime;
		return elapsed;
	}
	//elapse time in seconds
	public long getElapseTimeSec()
	{
		long elapsed;
		if(running)
			elapsed=(System.currentTimeMillis()-startTime)/1000;
		else
			elapsed = (stopTime-startTime)/1000;
		return elapsed;
	}
	//Stopping watch
	public void stopTime() 
	{
		this.stopTime = System.currentTimeMillis();
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
	public String[] split(String f, String s) 
	{
		char [] c = f.toCharArray();
		//count spaces
		int space=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ')
				space++;
		}
		//creating String array
		String [] str = new String[space+1];
		int j=0;
		str[j]="";
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]!=' ')
				str[j]+=c[i];
			else{
				j++;
				str[j]="";
			}
		}
		return str;
	}
	//returning size
	public int size()
	{
		return size;
	}
	//check is empty
	public boolean isEmpty()
	{
		return start==null;
	}
	//Linked list add
	public void add(Object ele)
	{
		size++;
		if(start==null)
		{
			start = new Node(ele);
			last = start;
			return;
		}
		last.next=new Node(ele);
		last=last.next;
	}
	//get object of linkedlist type
	public Object getObject(int index)
	{
		if(index>=size)
			throw new IndexOutOfBoundsException();
		Node p = start;
		for (int i = 1; i <=index; i++) {
			p=p.next;
		}
		return p.ele;
	}
	//remove object from linked list
	public void removeObj(int i)
	{
		
		if(i<0 && i>=size())
			throw new IndexOutOfBoundsException("remove not posible");
		Node d  = start;
	
		for(int j =1;j<i;j++)
		{
			d=d.next;
		}
		Node temp=d.next;
		if(d.next!=null) 
		{
			d.next=null;
			d=temp;
		}else{
			last=d.next;
			d.next=null;
		}
	}
	//display for linked list
	public void display()
	{
		for (int i = 0; i < size; i++) 
		{
			System.out.println(getObject(i));
		}
	}
	//Inner class for Linked Node Type
	private class Node
	{
		Object ele;
		Node next;
		//constructor
		Node(Object ele)
		{
			this.ele=ele;
		}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next2) 
	{
		next=next2;
	} 
		
	}
	public boolean remove(int index) {	 
	// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;
 
		Node temp = start;
		if (start != null) {
			for (int i = 1; i < index; i++) {
				if (temp.getNext() == null)
					return false;
 
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
 
			// decrement the number of elements variable
			size--;
			return true;
		}
		return false;
	}
	//Data inserting return to text file
	public void writefile(String s)
	{
		BufferedWriter writer = null;
		try
		{
		    writer = new BufferedWriter( new FileWriter("/home/bridgeit/Desktop/myfile.text"));
		    writer.write(s);
		}
		catch ( IOException e){}
		finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)   {}
		}
	}
	//Push an Object Stack type
	public void push(Object obj,Object [] ele) 
	{
		if(top == ele.length-1)
			System.out.println("Stack full....");
		else{
			ele[++top]=obj;
			System.out.println("Pushed Item :"+ele[top]);
		}
	}
	//Return Object Stack type
	public Object pop(Object[] ele) 
	{
		if(top<0)
		{
			System.out.println("Stack under flow");
			return null;
		}else{
			System.out.println("pop item :"+ele[top]);
			return ele[top--];
		}
	}
	//Checking Stack is Empty
	public boolean stackIsEmpty()
	{
		return top==-1;
	}
	//return size of stack
	public int stackSize()
	{
		return top;
	}
}
