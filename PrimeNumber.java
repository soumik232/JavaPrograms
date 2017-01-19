
public class PrimeNumber
{
	public static boolean isPrime(int n)
	{
		int i =2;
		while(i<n/2)
		{
			if(n%i==0)
				break;
			i++;
		}
		return i>=n/2;
	}
}
