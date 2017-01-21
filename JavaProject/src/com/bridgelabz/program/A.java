package com.bridgelabz.program;

public class A {

	public static void main(String[] args)
	{
		 int [][] b = new int [3][3];
		System.out.println("\n"+"DashBoard:");
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print("[" + b[i][j] + "]");
			}
			System.out.println();
		}
	}

}
