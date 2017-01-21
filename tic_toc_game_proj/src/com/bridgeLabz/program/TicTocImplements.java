package com.bridgeLabz.program;

import com.bridgeLabz.util.UtilityTicToc;

public class TicTocImplements 
{
	public static void main(String[] args) 
	{
		UtilityTicToc  ut = new UtilityTicToc();
	    System.out.print("Enter player one's player name: ");
	    ut.setPlayer1(ut.getPrompt());
	    System.out.print("Enter player two's player name: ");
	    ut.setPlayer2(ut.getPrompt());
	    System.out.println("welcome : "+ut.getPlayer1()+" and "+ut.getPlayer2()+"\n");
	   
	    boolean markerOk = false;
        while (!markerOk) 
        {
            System.out.print("Select any letter as " + ut.getPlayer1() + "'s marker: ");
            String marker = ut.getPrompt();
            if (marker.length() == 1 &&
                    Character.isLetter(marker.toCharArray()[0])) 
            {
                markerOk = true;
                char[] c1=marker.toCharArray();
                ut.setMarker1(c1[0]);
            } else {
                System.out.println("Invalid marker, try again");
            }
        }
        markerOk= false;
        while (!markerOk) 
        {
            System.out.print("Select any letter as " + ut.getPlayer2() + "'s marker: ");
            String marker = ut.getPrompt();
            if (marker.length() == 1 &&
                    Character.isLetter(marker.toCharArray()[0])) 
            {
                markerOk = true;
                char[] c2=marker.toCharArray();
                ut.setMarker2(c2[0]);
            } else {
                System.out.println("Invalid marker, try again");
            }
        } 
        boolean continuePlaying = true;
        while(continuePlaying)
        {
        	  System.out.println("\n"+ut.getRules());
              ut.drawBoard();
              System.out.println("\n\r");
              
              String player=null;
              while (!ut.winner() && ut.getPlays() < 10)
              {
            	 player = ut.getCurrentPlayer() == 1 ? ut.getPlayer1() : ut.getPlayer2();
            	 boolean validPick = false;
            	 while(!validPick)
            	 {
            		 System.out.println("it is "+player+"'s turn please select a square");
            		 String value = ut.getPrompt();
            		 if(value.length()==1 && Character.isDigit(value.toCharArray()[0]))
            		 {
            			 int pick=0;
            			 try{
            				 pick= Integer.parseInt(value);
            			 }catch(NumberFormatException e){ }
            			 validPick = ut.placeMarker(pick);
            		 }
            		 if(!validPick)
            			 System.out.println("Square can not be selected. Retry");
            	 }
            	// System.out.println();
            	 ut.switchPlayer();
            	 System.out.println();
            	 ut.drawBoard();
            	 System.out.println();
              }
              if (ut.winner()) {
                  System.out.println("Game Over - " + player + " WINS!!!");
              } else {
                  System.out.println("Game Over - Draw");
              }
              System.out.println();
              System.out.print("Play again? (Y/N): ");
              String choice = ut.getPrompt();
              if (!choice.equalsIgnoreCase("Y")) {
                  continuePlaying = false;
              }
        }
	}

}
