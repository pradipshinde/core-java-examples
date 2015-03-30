package com.pradip.create;

/**
 * @author Pradip
 *
 */
public class MainThread {

	/**
	 * There are two ways to create threads in java language.
	 * 1) By extending java.lang.Thread class.
	 * 2) By implementing java.lang.Runnable interface.
	 */
	public static void main(String[] args) {
		
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
		
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		thread.start();
	}
}
