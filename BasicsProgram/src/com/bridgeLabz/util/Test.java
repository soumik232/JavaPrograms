package com.bridgeLabz.util;

import java.util.Map;

public class Test{
	
	static Map<String,String> map = null;
	
	public static String getValue(String k) 
	{
		return map.get(k);
	}
	
	public static String getValue(String k,String d) 
	{
		String str = map.get(k);
		if( str == null)
		{
			return d;
		}
		return str;
	}
	
	public static void main(String[] args) 
	{
		getValue("abc");
		getValue("abc", "10");
	}

}
