import java.util.Scanner;
class PrimeTester
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		if(PrimeNumber.isPrime(sc.nextInt()))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
