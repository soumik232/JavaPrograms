/**
 * @author bridgeit Satyendra singh 
 * Stack implementation based on LIFO
 * method push.pop,size and empty.
 */
package com.bridgeLabz.programs;
public class Stack 
{
	private int top; 
	private Object [] ele;
	
	public Stack(int size)
	{
		top=-1;
		ele = new Object[size];
	}
	public void pushItem(Object obj)
	{
		if(top == size()-1)
			System.out.println("Stack full....");
		
		else{
			ele[++top]=obj;
			System.out.println("pushed");
		}
	}
	public Object popItem()
	{
		if(top<0)
		{
			System.out.println("Stack under flow");
			return null;
		}else{
			System.out.println("poped");
			return ele[top--];
		}
	}
	public int size()
	{
		return top;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
}
