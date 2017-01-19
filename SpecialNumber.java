import java.util.Scanner;
class SpecialNumber
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a two digit number to be cheak");
		int num = sc.nextInt();
		if(isSpecial(num))
			System.out.println("Hai Special khussss!!");
		else
			System.err.println("Hello ye wala nai h Special");
	}
	static boolean isSpecial(int n)
	{
		int sum =0,temp=n;
		int a=temp%10;
		int b=temp/10;
		sum=sum+(a*b)+a+b;
		return sum==n;
	}
}
