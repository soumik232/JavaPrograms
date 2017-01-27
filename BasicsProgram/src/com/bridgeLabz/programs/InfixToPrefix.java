/**
 * @author bridgeit satyendra singh 
 * using stack converting infix to prefix
 * i/p- infix string from user
 * o/p- display prefix string 
 */
package com.bridgeLabz.programs;
import com.bridgeLabz.util.Utility;
public class InfixToPrefix {
	public static void main(String[] args)
	{
		String s = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8/(4+3)";
		Utility u = new Utility(s);
		System.out.println(u.doTrans(s));
	}
}
