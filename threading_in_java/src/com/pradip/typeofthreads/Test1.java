package com.pradip.typeofthreads;

/**
 * @author Pradip
 *
 */
public class Test1 {

	public static void main(String[] args) {
		DaemonThread thread2=new DaemonThread();
		thread2.start();
	
		UserThread thread=new UserThread();
		thread.start();
		
		
	}
}
