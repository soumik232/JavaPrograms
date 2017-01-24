package com.bridgelabz.findApp;

import java.util.Scanner;

public class FindNumber 
{
	static Scanner sc = new Scanner(System.in);
	public int findNumber(int low, int high)
	{
		int temp1 = low;
		int temp2 = high;
		int mid=(low+high)/2 ;
		if(low>high){
			return mid;
		}
		
		
	
		//System.out.println("is your number present between these \n"+mid+" - "+high);
		//System.out.println("if yes then enter true otherwise false");
		/*boolean res = sc.nextBoolean();
		
		if(res)
		{		
			high=mid;
			findNumber(low, high);
		}
		else{
			low=mid+1;
			high=temp;
			findNumber(low, high);
		}
		*/
		System.out.println("enter 1 if ur number present :"+low+" - "+mid);
		System.out.println("enter 2 if ur number present :"+(mid+1)+" - "+high);
		int n = sc.nextInt();
		switch(n){
		case 1:
			high=mid;
			findNumber(low, high);
			break;
		case 2:
			low =mid;
			findNumber(low, high);
			
		
		}
		return 0;
	}
}
