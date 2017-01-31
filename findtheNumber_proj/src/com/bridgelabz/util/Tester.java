/**
 *Desc -> takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
*I/P -> the Number N and then recursively ask true/false if the number is between a high and low value
*Logic -> Use Binary Search to find the number
*O/P -> Print the intermediary number and the final answer
*/
package com.bridgelabz.util;
import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 //Steps means power of 2
		 System.out.println("enter steps");
		 int step = sc.nextInt();
		 int sum=1,num;
		 for (int i = 0; i < step; i++) 
		 {
			sum=sum*2;
		 }
		 num=sum;
		 int low = 1;
		 int high=num/2;
		 int a=2;
		 int b=4;
		 System.out.println("Think a number between 0"+" - "+(num-1));
		 boolean check;
		 for(int i=0;i<step;i++)
		 {
			 //Asking from user is your number 
			 System.out.println("Is your number present between these "+(low-1)+" - "+(high-1));
			 check=sc.nextBoolean();
			 if(check)
			 {
				 num = num/2;
				 high = high-((high-low+1)/2);
			 }
			 else
			 {
				 low =low+num/a;
				 high = high+num/b;
				 a = a*2;
				 b = b*2;
			 }
		 }
		 //checking last two number  
		 System.out.println("Is your ??"+(low-1)+"\ntrue or false");
		 check=sc.nextBoolean();
		 if(check)
			 System.out.println("your number is :"+ (low-1));
		 else
			 System.out.println("your number is :"+(high-1));
	}
}
