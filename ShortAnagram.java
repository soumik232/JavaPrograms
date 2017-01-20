import java.util.Arrays;
import java.util.Scanner;
class ShortAnagram
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two string");
		String first = sc.nextLine();
		String second=sc.nextLine();
		first=first.replaceAll("\\s","");;
		second=second.replaceAll("\\s","");
		first=first.toLowerCase();
                second=second.toLowerCase();
		char[] c1= first.toCharArray();
		char[] c2= second.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		first = new String(c1);
		second= new String(c2);
		System.out.println(first.equals(second));

		System.out.println(first);
		System.out.println(second);
	}
}

