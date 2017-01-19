import java.util.Scanner;
class CoinToss
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to toss");
		int n = sc.nextInt();
		int count=0;
		if(n>0)
		{
			for(int i=0;i<n;i++)
			{
				if(Math.random()<0.5)
					count++;
			}
			System.out.println("Head occurence "+(n-count)+" times");
			System.out.println("Tail occurence "+count+" times");
			System.out.println("Head win "+((n-count)*100)/n+"%");
			System.out.println("Tail win "+(count*100)/n+"%");			
		}
		else
		{
			System.out.println("invalid number");
		}
	}
}

