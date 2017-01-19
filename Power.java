class Power
{
	public static void main (String[] args)
	{
		System.out.println("enter a number");
		int a = Integer.parseInt(System.console().readLine());
		if(a>0&&a<32)
		{
			for(int i = 0;i<a;i++)
			{
				int res=isPower(2,i);
				System.out.println("2^"+i+" ="+res);
			}
		}
		else
			System.out.println("Range out of bound");
	}
	static int isPower(int b,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*b;
			p--;
		}
		return pw;
	}
}
