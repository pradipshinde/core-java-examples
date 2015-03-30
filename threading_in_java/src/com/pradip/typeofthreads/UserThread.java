package com.pradip.typeofthreads;

/**
 * @author Pradip
 *
 */
public class UserThread extends Thread {
	
	@Override
	public void run() {
	
		Thread t=new Thread(); //creating a child Thread
		System.out.println(t.isDaemon()); //checking thread is daemon
		System.out.println("Keep Some task Here");
	}

}
