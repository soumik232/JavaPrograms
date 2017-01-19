import java.util.Scanner;
class HarmonicNumber 
{
	public static void main(String [] args)
	{
		int i =1;
		double sum = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter series length");
		int len=sc.nextInt();
		while(i<=len)
		{
			System.out.print("1/"+i+" ");
			sum=sum+(double)1/i;
			i++;
		}
		System.out.println("\n\nThe sum of harmonic series is :"+sum); 
		
	}
}
