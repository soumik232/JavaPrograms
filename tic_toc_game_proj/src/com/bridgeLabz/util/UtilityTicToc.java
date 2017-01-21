package com.bridgeLabz.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UtilityTicToc 
{
	private char[][] board = new char[3][3];
	private String player1;
	private String player2;
	private int currentPlayer;
	private char marker1;
	private char marker2;
	private int plays;
	private BufferedReader reader =
							new BufferedReader(new InputStreamReader(System.in));
	//ctt
	public UtilityTicToc() 
	{
		System.out.println("Welcome! Tic Tac Toe is a two player game.");
	}
	
	Scanner sc = new Scanner(System.in);
	public String getRules() 
	{
	        StringBuilder builder = new StringBuilder();
	        builder.append("Players take turns marking a square. Only squares \n");
	        builder.append("not already marked can be picked. Once a player has \n");
	        builder.append("marked three squares in a row, the player wins! If all squares \n");
	        builder.append("are marked and no three squares are the same, a tie game is declared.\n");
	        builder.append("!.......Have Fun.......! \n\n");
	        return builder.toString();
	 }
	public String getPrompt()
	{
		  String prompt = "";
	        try {
	            prompt = reader.readLine();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        return prompt;
	}
	public void drawBoard()
	{
		int count =1;
		System.out.println("\n"+"DashBoard:");
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				board[i][j]=Character.forDigit(count++, 10);
				System.out.print("[" + board[i][j] + "]");
			}
			System.out.println();
			currentPlayer=1;
			plays=0;
		}
	}
	public boolean winner() 
	{
		char current = ' ';
		//Checking for row
		for (int i = 0; i < 3; i++) 
		{
			int j=0;
			for ( j = 0; j < 3; j++) 
			{
				if(!Character.isLetter(board[i][j]))
					break;
			}
			if(j==0)
				current=board[i][j];
			else if(current!=board[i][j])
					break;
			if(j==2){
				//found winner
				return true;
			}
		}
		//checking for column
		for (int i = 0; i < 3; i++) 
		{
			current=' ';
			int j=0;
			for ( j = 0; j < 3; j++) 
			{
				if(!Character.isLetter(board[j][i]))
					break;
			}
			if(j==0)
				current=board[j][i];
			else if(current!=board[j][i])
					break;
			if(j==2){
				//found winner
				return true;
			}
		}
		//checking for diagonal
		current = board[0][0];
	    if (Character.isLetter(current) && board[1][1] == current && board[2][2] == current)
	    	return true;
	    current = board[2][0];
	    if (Character.isLetter(current) && board[1][1] == current && board[0][2] == current)
	    	return true;
		return false;
	}
	public boolean placeMarker(int play) 
	{
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if (board[i][j] == Character.forDigit(play, 10)) 
				{
	               board[i][j] = (getCurrentPlayer() == 1) ? getMarker1() : getMarker2();
	               return true;
				}
			}
		}
		return false;
	}
	public void switchPlayer()
	{
		if(getCurrentPlayer()==1)
			setCurrentPlayer(2);
		else 
			setCurrentPlayer(1);
		setPlays(getPlays()+1);
	}
	//getter and setter
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	public int getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	public int getPlays() {
		return plays;
	}
	public void setPlays(int plays) {
		this.plays = plays;
	}
	public char getMarker1() {
		return marker1;
	}
	public void setMarker1(char marker1) {
		this.marker1 = marker1;
	}
	public char getMarker2() {
		return marker2;
	}
	public void setMarker2(char marker2) {
		this.marker2 = marker2;
	}
	
	
	
	
	
}
