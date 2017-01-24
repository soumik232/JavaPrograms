/**
 *Desc -> Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.
 *I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of Share, and Share Price
 *Logic -> Calculate the value of each stock and the total value
 *O/P -> Print the Stock Report.
 *Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read from the input file. Have functions in the Class to calculate the value of each stock and the value of total stocks
 */
package com.bridgelabz.util;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.stockApp.StockPortFolio;

public class StockMain 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		StockPortFolio sp=new StockPortFolio();
		sp.insrtStkDetail();
		System.out.println("following companies.....");
		sp.getDetail();
		boolean b = false;
		do
		{
			System.out.println("if u want to get detail any company"
					+"\n Then enter yes otherwise no");
			String opt = sc.next();
			if(opt.equalsIgnoreCase("yes")){
				sp.getStkInfo();
				System.out.println("Do you want to continue.."
						+ "enter continue otherwise exit");
				String con=sc.next();
				if(!con.equalsIgnoreCase("continue"))
					break;
			}
			else{
				System.out.println("Thankyou bhai time dene le liye..");
				b=true;
			}
		}while(!b);
	}
}
