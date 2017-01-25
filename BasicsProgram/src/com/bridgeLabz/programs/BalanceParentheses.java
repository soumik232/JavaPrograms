package com.bridgeLabz.programs;

import com.bridgeLabz.util.Utility;

public class BalanceParentheses {

	public static void main(String[] args)
	{
		Utility u = new Utility();
		String s = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3";
		int len = s.length();
		Stack stk = new Stack(len);
		for (int i = 0; i < len; i++) 
		{
			char c = s.charAt(i);
			if(c=='(')
				stk.pushItem(c);
			else
				if(c==')')
					stk.popItem();
		}
		if(u.isEmpty())
			System.out.println("given string is balance");
		else
			System.out.println("given string is not balance");
		
	}

}
