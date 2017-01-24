package com.bridgelabz.stockApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StockPortFolio 
{
	String name;
	int no,n;
	double price;
	ArrayList<Stock> al = new ArrayList<Stock>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	public void insrtStkDetail() throws IOException 
	{
		
		System.out.println("enter no of company..");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) 
		{
			System.out.println("enter stock name, no of share, and set value of share");
			name = br.readLine();
			
			no = sc.nextInt();
			price = sc.nextDouble();
			
			al.add(new Stock(name,no,price));
		}
	}
	public void getStkInfo() throws IOException
	{
		System.out.println("enter company name..");
		String nam = br.readLine();
		while(true)
		{
			for(Stock x:al)
			{
				if(!x.getName().equalsIgnoreCase(nam))
				{
					System.out.println("Company name does not exist Please try again....");
					break;
				}
				else
				{
					System.out.println("Value of perticular share of "+nam+" "+x.getPrice());
					System.out.println("Total value of share for "+nam+ " "+(x.getNoOfShare()*x.getPrice()));
					return;
				}
			}
		}
	}
	public void getDetail() 
	{
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
	}
}
