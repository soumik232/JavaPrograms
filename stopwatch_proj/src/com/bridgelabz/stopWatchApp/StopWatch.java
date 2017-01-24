package com.bridgelabz.stopWatchApp;

import java.util.Scanner;

public class StopWatch 
{
	Scanner sc = new Scanner(System.in);
	private long start;
	private long stop;
	private boolean running;
	public StopWatch() 
	{
		while(true)
		{
			System.out.println("click to start...press y");
			String st=sc.next();
			if(st.equalsIgnoreCase("y"))
			{
				start= System.currentTimeMillis()/1000;
				running=false;
				break;
			}
			else
				System.out.println("MissMatch error...try again");
		}
	}
	//starting watch
	public void start() 
	{
	    this.start = System.currentTimeMillis();
	    this.running = true;
	}
	//ellapse time in miliseconds
	public long getElapseTime()
	{
		long elapsed;
		if(running)
			elapsed = System.currentTimeMillis()-start;
		else
			elapsed = stop-start;
		return elapsed;
	}
	//elapse time in seconds
	public long getElapseTimeSec()
	{
		long elapsed;
		if(running)
			elapsed=(System.currentTimeMillis()-start)/1000;
		else
			elapsed = (stop-start)/1000;
		return elapsed;
	}
	//stoping watch
	public void stop() {
		while(true)
		{
			
			System.out.println("click to stop...press E");
			String st=sc.next();
			if(st.equalsIgnoreCase("e"))
			{
				this.stop = System.currentTimeMillis();
				this.running = false;
				break;
			}else
				System.out.println("try again...missmatch");
		}
	}
	//provoiding delay time
	public void delay()
	{
		System.out.println("give delay time....in seconds");
		long time= sc.nextLong()*1000;
		try {Thread.sleep(time);} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
