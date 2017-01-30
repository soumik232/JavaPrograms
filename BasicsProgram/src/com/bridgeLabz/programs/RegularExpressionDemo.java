package com.bridgeLabz.programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgeLabz.util.Utility;

/**
 * Description -> Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system.
   your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification 
   Thank you BridgeLabz 01/01/2016. 
   Use Regex to replace name, full name, Mobile#, and Date with proper value.
 * I/P -> read in the Message
 * Logic -> Use Regex to do the following
 * Replace <<name>> by first name of the user ( assume you are the user)
 * replace <<full name>> by user full name.
 * replace any occurrence of mobile number that should be in format 91-xxxxxxxxxx by your contact number.
 * replace any date in the format XX/XX/XXXX by current date.
 */
public class RegularExpressionDemo 
{
	public static void main(String[] args) 
	{
		String fname="";
		Scanner sc = new Scanner(System.in);
		String input = null;
		Utility u = new Utility();
		try {
			input = u.readFile();
			System.out.println(input);
		} catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Check path of file and try again..");
		}
		String str [] = input.split(" ");
		Date dateobj = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		String date=df.format(dateobj);
		System.out.println("Dude Please enter your fullname ");
		String fullName = sc.nextLine();
		boolean b = Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*", fullName);
		if(b)
		{
			System.out.println("Text matched");
			String [] name = fullName.split(" ");
			fname = name[0];
		}
		else{
			System.out.println("Invalid text...Try again dude");
			System.exit(0);
		}
		System.out.println("Dude Please enter your contact number ");
		String cNum= sc.next();
		boolean c = Pattern.matches("[7-9]{1}[0-9]*", cNum);
		if (c) 
		{
			System.out.println("Number matched dude..");
		} else 
		{
			System.out.println("number to sahi dal...");
			System.exit(0);
		}
		
		System.out.println("Dude Please enter your email address ");
		String email= sc.next();
		boolean i = Pattern.matches("(.+)@(.+)$", email);
		if (i) 
		{
			System.out.println("Email matched dude..");
		} else 
		{
			System.out.println("email to yad nai tmhe ...");
			System.exit(0);
		}
		input = input.replaceAll("<<name>>", fname);
		input = input.replaceAll("<<full name>>", fullName);
		input = input.replaceAll("xxxxxxxxxx", cNum);
		input = input.replaceAll("01/01/2016", date);
		input = input.replace("<<mail>>", email);
		System.out.println(input);
	}

}
