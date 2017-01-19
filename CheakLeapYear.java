import java.util.Scanner;
class CheakLeapYear
 {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to be cheak");
		int year = sc.nextInt();
		if(isDigit(year)==4)
		{
			if((year%4==0 && year%400==0) && (year%100!=0))
				System.out.println("Yes this "+year+" is leap year");
			else
				System.out.println("no this "+year+" not a leap year");
		}		
		else
			System.out.println("Enter valid year try again");
			
	}
	static int isDigit(int y)
	{
		int count =0;
		while(y>0)
		{
			//int b= y%10;
			y = y/10;
			count++;
		}
		return count;
	}
}
