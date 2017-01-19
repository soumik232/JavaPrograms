
import java.util.Scanner;
class Factor
{
	public static void main(String [] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		for(int i=2;i*i<=num;i++)
		{	
			if(num%i==0)
			{
				if(PrimeNumber.isPrime(i))
					System.out.print(i+" ");
			}
		}	
	}
}
