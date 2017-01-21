package com.satyendra.program;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray 
{
	public int[][] readMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row and column");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][] mat=new int[row][col];
		System.out.println("enter a "+row*col+" elments");
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();
			}
			
		}
		return mat;
	}
		public void display(int [][]a)
		{
			PrintWriter pw = new PrintWriter(System.out, true);
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[i].length; j++) 
				{
					pw.println(a[i][j]);
				}
			}
		}
	
}
