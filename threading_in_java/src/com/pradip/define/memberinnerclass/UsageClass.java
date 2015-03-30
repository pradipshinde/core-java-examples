package com.pradip.define.memberinnerclass;

/**
 * @author Pradip
 *
 */
public class UsageClass {
	
	/**
	 * Thread class as a member inner class or Non-static Inner Class of the usage class
	 *
	 */
	class MyThread1 extends Thread
	{
		@Override
		public void run() {
		System.out.println("Keep some task here");
		}
	}
	
	/**
	 * Another thread class as a member inner class or Non-Static Inner Class of the usage class 
	 *
	 */
	class MyThread2 implements Runnable
	{
		
		@Override
		public void run() {
			System.out.println("Keep some task here");
		}
	}

	/**
	 * This method is also useful when one class uses thread and it’s task more excessively.
	 */
	public static void main(String[] args) {
		//Using MyThread1 and it's task
		MyThread1 thread1=new UsageClass().new MyThread1();
		thread1.start();
		
		/*
		 * UsageClass class1=new UsageClass();
		MyThread1 myThread1=class1.new MyThread1();
		myThread1.start();

		UsageClass.MyThread1 myThread12=new UsageClass().new MyThread1();
		myThread12.start();
		*/
		
		//Using MyThread2 and it's task
		
		MyThread2 thread2=new UsageClass().new MyThread2();
		Thread thread=new Thread(thread2);
		thread.start();
	}
}
