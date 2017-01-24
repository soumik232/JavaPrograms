/**
*Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
*I/P -> Start the Stopwatch and End the Stopwatch
*Logic -> Measure the elapsed time between start and end
*O/P -> Print the elapsed time.
*/
package com.bridgelabz.util;

import java.time.ZonedDateTime;

import com.bridgelabz.stopWatchApp.StopWatch;

public class Tester {

	public static void main(String[] args)
	{
		StopWatch sw=new StopWatch();
		sw.start();
		sw.delay();
		sw.stop();
		System.out.println("elapsed time in miliseconds : "+sw.getElapseTime());
		System.out.println("elapsed time in seconds : "+sw.getElapseTimeSec());
		
	}

}
