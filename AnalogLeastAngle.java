import java.util.Scanner;
class AnalogLeastAngle
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour and minute");
		int hr =sc.nextInt();
		int min = sc.nextInt();
		double hangle = hr*30+min*.5;
		double mangle = min*6;
		double angle =0.0;
		if(hangle>mangle)
			angle=hangle-mangle;
		else 
			angle=mangle-hangle;
		if(angle>180)
			angle=360-angle;
		System.out.println("least angle is :"+angle);
	}
}
