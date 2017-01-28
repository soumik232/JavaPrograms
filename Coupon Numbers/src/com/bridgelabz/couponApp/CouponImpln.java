package com.bridgelabz.couponApp;

import java.util.Random;
import java.util.Scanner;

public class CouponImpln 
{
	int [] ranCoup;
	static int count=1;
	public void generateCoupon() 
	{
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of coupon");
		int num = sc.nextInt();
		ranCoup = new int[num];
		
		int p=1;
		ranCoup[0]=ran.nextInt(250);
		while(p<ranCoup.length)
		{
			int n = ran.nextInt(25);
			if((p-1)!=n)
			{
				ranCoup[p]=n;
				p++;
			}
			count++;
		}
	}

	public void displayCoupon() 
	{
		int n=ranCoup.length;
		for (int i = 0; i < n; i++) 
		{
			System.out.print(ranCoup[i]+" ");
		}
		System.out.println("\n\r"+n+" coupon genrated by calling random funtion "+count+" times");
		
	}
	
}
