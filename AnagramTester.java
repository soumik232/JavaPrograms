import java.util.Scanner;
class AnagramTester
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two String");
		String first = sc.nextLine();
		String second=sc.nextLine();
		Anagram a = new Anagram();
		//Step 1-removing spaces
		first= a.removeSpc(first);
		second=a.removeSpc(second);
		//step-2 cheaking length
		if(first.length()!=second.length())
		{
			System.out.println("These two String are not anagram");
			return;
		}
		//Step-3 Converting lower case.
		first= a.toLowerCase(first);
		second=a.toLowerCase(second);
		//step-4 Shorting character of String
		first = a.sort(first);
		second=a.sort(second);
		//Step-5 Comparing character one by one.
		char c1[]=first.toCharArray();
		char c2[]=second.toCharArray();
		for(int i =0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				System.out.println("These two string are not anagram.");
				return;
			}
		}
		System.out.println("yes both are anagram finally...");
	}
}
