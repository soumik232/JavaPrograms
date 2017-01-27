/**
 * @author bridgeit Satyendra singh
 * Desc -> Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the performance of operations. Ensure parentheses must appear in a balanced fashion.
 * I/P -> read in Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) 
 * Logic -> Write a Stack Class to push open parenthesis “(“ and pop closed parenthesis “)”.
 * At the End of the Expression if the Stack is Empty then the
 * Arithmetic Expression is Balanced. Stack Class Methods are Stack(), push(), pop(), peak(), isEmpty(), size()
 * O/P -> True or False to Show Arithmetic Expression is balanced or not.
 */
package com.bridgeLabz.programs;
import com.bridgeLabz.util.Utility;

public class BalancedParentheses {

	public static void main(String[] args) 
	{
		Utility u = new Utility();
	
		System.out.println("Enter a string to be check ");
		String string=u.inputString();
		Stack stk = new Stack(string.length());
		for (int i = 0; i < string.length(); i++)
		{
			char c = string.charAt(i);
			if(c=='('||c=='{')
				stk.pushItem(c);
			else if(c==')'|| c=='}')
				stk.popItem();
		}
		if(stk.isEmpty())
			System.out.println("true");
		else
			System.out.println("false");
	}

}
