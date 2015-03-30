package com.pradip.simple;

/**
 * @author Pradip
 *
 */
public class Thread1 extends Thread{
	
	/* 
	 * The task of this thread is to print the numbers from 0 to 1000 times
	 */
	@Override
	public void run() {
	
		for(int i=0;i<=1000;i++)
			System.out.println(i);
	
	}

}
