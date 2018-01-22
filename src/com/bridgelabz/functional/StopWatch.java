/***********************************************
 * Purpose :This program is for measuring the time that elapses between the start and end clicks
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/
package com.bridgelabz.functional;

public class StopWatch 
{
	private static long startTime=0,stopTime=0,elapsedTime=0;
	public static void main(String[] args) 
	{
		long l=ElapsedTime();
		System.out.println("Start Time is..."+StartTime());
		System.out.println("Stop Time is..."+StopTime());
		System.out.println("The Elapsed Time between stop and end..."+elapsedTime);
	}

	private static long StopTime()
	{
		startTime=System.currentTimeMillis();
		return startTime;
	}

	private static long ElapsedTime() 
	{
		elapsedTime=(stopTime)-(startTime);
		return elapsedTime;
	}

	private static long StartTime()
	{
		stopTime=System.currentTimeMillis();;
		return stopTime;
	}
}