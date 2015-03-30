package com.pradip.define.localinnerclass;

/**
 * @author Pradip
 *
 */
public class UsageClass {

	/**
	 *The thread class can be defined as a local inner class of the method of the usage class.
	 *If declared so, only that method can use the functionality of that thread.
	 */
	public static void main(String[] args) {
		
		/* 
		 * Thread as Local inner class
		 */
		class MyThread1 extends Thread
		{
			@Override
			public void run() {
			System.out.println("Keep some task here");
			}
		}
		
		/* 
		 *Another Thread as Local inner class
		 */
		class MyThread2 implements Runnable
		{
			
			@Override
			public void run() {
				System.out.println("Keep some task here");
			}
		}
		
		//using MyThread1 and it's Task
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
		
		//using MyThread2 and it's Task
		MyThread2 thread2=new MyThread2();
		Thread thread=new Thread(thread2);
		thread.start();
	}
}
