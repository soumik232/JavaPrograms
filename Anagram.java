class Anagram
{
	public String removeSpc(String s)
	{
		char[] c =s.toCharArray();
		String sh="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
				sh=sh+c[i];
		}
		return sh;
	}
	public String toLowerCase(String s)
	{
		char[] c =s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=65&&c[i]<=90)
				c[i]=(char)(c[i]+32);
		}
		return new String(c);
	}
	public String sort(String s)
	{
		char[] c =s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=0;j<c.length-1-i;j++)
			{
				if(c[j]>c[j+1])
				{
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		return new String(c);
	}		
}

