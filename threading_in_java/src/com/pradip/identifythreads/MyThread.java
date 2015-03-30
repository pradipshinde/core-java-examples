package com.pradip.identifythreads;

/**
 * @author Pradip
 *
 */
public class MyThread extends Thread{

	@Override
	public void run()
	{
		
		System.out.println("Keep some task here");
		System.out.println("Thread Id :"+getId());
		
	}
}
