/*
*Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
*I/P -> $Stake, $Goal and Number of times
*Logic -> Play till the gambler is broke or has won
*O/P -> Print Number of Wins and Percentage of Win and Loss.
*/
package com.bridgeLabz.main;
import com.bridgeLabz.util.GamblerImpln;

public class GamblerDemo 
{
	public static void main(String[] args) 
	{
		GamblerImpln util = new GamblerImpln();
		util.playerInfo();
		util.playGame();
	}

}
