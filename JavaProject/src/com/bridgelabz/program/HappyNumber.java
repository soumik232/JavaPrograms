package com.bridgelabz.program;

import java.util.Scanner;
public class HappyNumber 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		boolean b  = isHappy(n);
		if (b) 
			System.out.println("Yes");
		 else 
			 System.out.println("no");
	}
	private static boolean isHappy(int n) 
	{
		while(n>9)
		{
			n=sumOfSquare(n);
		}
		return n==7||n==1;
	}
	private static int sumOfSquare(int n) 
	{
		int sum = 0;
		while(n>0)
		{
			int r = n%10;
			sum+=r*r;
			n/=10;
		}
		return sum;
	}
}
