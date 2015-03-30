package com.pradip.create;

/**
 * @author Pradip
 *
 */
public class MyThread1 extends Thread {

	
	/* 
	 * keep the task to be performed here
	 */
	@Override
	public void run() {
		System.out.println("Create a thread by extending a thread class");
	}
}
