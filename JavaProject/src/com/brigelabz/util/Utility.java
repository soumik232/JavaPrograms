package com.brigelabz.util;

import java.util.Random;
import java.util.Scanner;

public class Utility 
{
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	public Utility() 
	{
		System.out.println("Wetcome...");
	}
	int times;
	int money;
	int bet;
	int goal;
	String player;
	public void playerInfo() 
	{
		System.out.println("Please enter your name");
		player = sc.next();
		System.out.println("welcome "+player+" to pal Gow poker game");
		System.out.println("Enter how many times you wants play this game.");
		times = sc.nextInt();
		System.out.println("Enter how much doller do you have...?");
		money=sc.nextInt();
		System.out.println("Enter maximum doller that you want to bet in each iteration:");
		bet = sc.nextInt();
		System.out.println("Enter maximum doller that you want win in this game:");
		goal = sc.nextInt();
		System.out.println("Now lets Start....!"+player);
		
	}
	public void playGame() 
	{
		System.out.println("enter your bet number"+"\n"+"Number Should be between 0 to 10");
		int betNum= sc.nextInt();
		int win=0,lose=0;
		int round=1;
		int temp=money;
		while(money>0 && money<=goal &&times>=round)
		{
			int num = ran.nextInt(10);
			if(num==betNum){
				win++;
				money+=bet;
				System.out.println(round+" times: its "+num +" you win");
			}
			else{
				money-=bet;
				System.out.println(round+" times: its "+num +" you loose");
			}
			round++;
			if(money==0)
			{
					System.out.println(player+"...... Get lost!!!! You dont have money to continue in this game..");
					break;
			}
		}
		System.out.println(win+" times win");
		System.out.println((times-win)+"times lose");
		double winPerc= (win*100)/times;
		System.out.println("Win percentage:"+winPerc);
		System.out.println("loose percentage: "+(100-winPerc));
		if(winPerc>50)
			System.out.println("you won :"+(money-temp)+"$");
		else
			System.out.println("you loose :"+(temp-money)+"$");
	}
}















