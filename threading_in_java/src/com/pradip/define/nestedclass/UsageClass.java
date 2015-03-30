package com.pradip.define.nestedclass;

/**
 * @author Pradip
 *
 */
public class UsageClass {

	
	/**
	 *Thread class as a nested class or Static Inner Class of the usage class
	 */
	static class MyThread1 extends Thread
	{
		@Override
		public void run() {
     	System.out.println("Put some task here");
		}
	}
	
	/**
	 *Another thread class as a nested class or Static Inner Class of the usage class
	 */
	static class MyThread2 implements Runnable
	{
		
		@Override
		public void run() {
			System.out.println("put some task here");
		}
	}
	
	/**
	 * Thread class can be defined as a nested class or static inner class of the usage class.
	 * This method is useful when only one class uses the thread and it’s task more oftenly. 
	 */
	public static void main(String[] args) {
		//using the MyThread1 and its task 
		MyThread1 thread1=new MyThread1();
		thread1.start();
		
		//using the MyThread2 and its task 
		MyThread2 thread2=new MyThread2();
		Thread thread=new Thread(thread2);
		thread.start();
	}
	
}
