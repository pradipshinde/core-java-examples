package com.pradip.typeofthreads;

/**
 * @author Pradip
 *
 */
public class Test {

	public static void main(String[] args) {
	
		UserThread userThread=new UserThread();
		System.out.println(userThread.isDaemon()); //False
		userThread.setDaemon(true); //Changing the Thread as daemon
		userThread.start();
		System.out.println(userThread.isDaemon());
		// userThread.setDaemon(true); //This statement will throw IllegalThreadStateException
	
	   UserThread userThread2=new UserThread();
	   System.out.println(userThread2.isDaemon());
	   userThread2.start();
}

}