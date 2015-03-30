package com.pradip.simple;

/**
 * @author Pradip
 *
 */
public class MainThread {

	/**
	 * in the below program, main thread creates two threads. 
	 * The task of first thread is to print the numbers from 0 to 1000.
	 * The task of second thread is to print the numbers from 1001 to 2000. 
	 * These two threads perform their task simultaneously not one after the other 
	 */
	
	public static void main(String[] args) {
	
		System.out.println("Execution of main thread starts");
		
		//creating first thread
		Thread1 thread1=new Thread1();
		thread1.start();
		
		//thread1.start(); java.lang.IllegalThreadStateException because thread1 is already started 
		
		//creating second thread
		Thread2 thread2=new Thread2();
		thread2.start();
		
		
		System.out.println("Extecution of main threads stops");
		
		
	}
	
}
