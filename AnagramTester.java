import java.util.Scanner;
class AnagramTester
{
	public static void main(String [] args)
	{
		boolean rs=isPanagram("mother in law", "hitler woman");
		if(rs)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		
		boolean isAnagram(String s1,String s2)
               {
                String st=s1.toLowerCase().replaceAll(" ","");
                String st1=s2.toLowerCase().replaceAll(" ","");
                 char[]c=st.toCharArray();
                 char[] c1=st1.toCharArray();
                 if(c.length!=c1.length)
                 return false;
                 for(int i=0;i<c.length;i++)
                 {
                  if(c[i]!=c1[i])
                  {
                   return false;
                  }
                 }
                 return true;
              }

