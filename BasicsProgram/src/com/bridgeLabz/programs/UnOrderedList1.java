/**
 * @author Satyendra singh bridgeit
 * Desc -> Read the Text from a file, split it into words and arrange it as Linked List. 
 * Take a user input to search a Word in the List. 
 * If the Word is not found then add it to the list, 
 * and if it found then remove the word from the List. In the end save the list into a file
`*I/P -> Read from file the list of Words and take user input to search a Text
`*Logic -> Create a Unordered Linked List. The Basic Building Block is the Node Object. 
`*Each node object must hold at least two pieces of information. 
`One ref to the data field and  second the ref to the next node object.
`*O/P -> The List of Words to a File.
`*/
package com.bridgeLabz.programs;
import java.util.Arrays;
import com.bridgeLabz.util.Utility;

public class UnOrderedList1 {
	public static void main(String[] args) //throws IOException 
	{
		Utility u = new Utility();
		//reading text file 
		String file = u.readFile();
		String [] str = u.split(file," ");
		String sw="";
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) 
		{
			u.add(str[i]);
		}
		System.out.println("added sucessfully");
		System.out.println("enter a word to be check");
		String sam = u.inputString();
		int flag=0;
		for (int i = 0; i < u.size; i++) 
		{
			String temp=(String)u.getObject(i);
			if(temp.equalsIgnoreCase(sam))
			{
				System.out.println("word  found...");
				flag=1;
				System.out.println("removed sucessfully..."+u.remove(i));
			}
			sw+=u.getObject(i)+" ";
		}
		System.out.println(sw);
		u.writefile(sw);
		if(flag==0){
			System.out.println("word not found..please add this word to file");
			u.add(sam);
			sw+=" "+sam;
			System.out.println("word added");
			u.writefile(sw);
			System.out.println(sw);
			System.out.println("Data saved..");
			return;
		}
	}
}
