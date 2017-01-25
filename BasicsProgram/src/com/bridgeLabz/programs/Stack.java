package com.bridgeLabz.programs;

import com.bridgeLabz.util.Utility;

public class Stack 
{
	Utility u = new Utility();
	private int top;
	private Object [] ele;
	Stack(int size)
	{
		top=-1;
		ele = new Object[size];
	}
	public void pushItem(Object obj)
	{
		u.push(obj,ele);
	}
	public Object popItem()
	{
		return u.pop(ele);
	}
}
