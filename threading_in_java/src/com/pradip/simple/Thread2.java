package com.pradip.simple;

/**
 * @author Pradip
 *
 */
public class Thread2 extends Thread {

	/* 
	 * The task of this thread is to print the numbers from 1001 to 2000 
	 */
	@Override
	public void run() {

		for(int i=1001; i<=2000;i++)
		{
			System.out.println(i);
		}
	}
}
