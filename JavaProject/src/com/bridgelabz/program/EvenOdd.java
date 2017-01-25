package com.bridgelabz.program;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = sc.nextLine();
		char [] c = s.toCharArray();
		int m = countNum(c);
		String str="";
		for (int i = 0; i < c.length; i++) 
		{
		
			if(c[i]!=' ')
				str+=c[i];
		}
		if(m%2==0){
			System.out.println(str+"is even : 2");
		}else{
			System.out.println(str+"is even : 2");
		}
	}

	private static int countNum(char[] c)
	{
		int count=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]!=' ')
				count++;
		}
		return count;
	}

}
