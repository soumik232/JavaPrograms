package com.satyendra.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadText 
{
	public static void main(String[] args) 
	{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		try {
			String name = br.readLine();
			System.out.println(name);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello"+"\n\r\t"+"world");
	}

}
