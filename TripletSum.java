import java.util.Random;
public class TripletSum
{
	static int [] num;
		public static void main (String []args)
		{
			int flag=0;
			num = new int[10];
			Random ran = new Random();
		 	for(int i =0;i<num.length;i++)
               	 	{
                       		 num[i]=ran.nextInt(5);
               		}
			display(num);
			for(int i =0;i<num.length-2;i++){
			  	for(int j =i+1;j<num.length-1;j++){
				  	for(int k =j+1;k<num.length;k++){
						if(num[i]+num[j]+num[k]==10)
						{
							System.out.println("triplet number is :"+num[i]+" "+num[j]+" "+num[k]);
							flag=1;
						}
					}
				}
			}
			if(flag==0)
				System.out.println("No Such Triplets whose sum is 0");

		}
		public static void display(int [] a)
		{
			for(int i =0;i<num.length;i++)
                	{
                        	System.out.print(num[i]+" ");   
                	}
                	System.out.println();
		}
}
