package com.pradip.threadinterference;

/**
 * @author Pradip
 *
 */
public class Counter {

	private int counter;
	
	public void increment()
	{
		counter++;
	}
	
	public void decrement()
	{
		counter--;
	}
	
	public int getCounter()
	{
		return counter;
	}
}
