package com.pradip.threadpriority;

/**
 * @author Pradip
 *
 */
public class MyThread {

	public static void main(String[] args) {
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		Thread thread=Thread.currentThread();
		System.out.println("Priority of main thread :"+thread.getPriority());
		
		thread.setPriority(8); //set new priority 
		System.out.println(thread.getPriority()); //get the new priority
		
		Thread t=new Thread();
		System.out.println(t.getPriority()); // The default priority of a thread is same as that of it’s parent.
		// thread.setPriority(15);  //if priority is not in the range of MIN_PRIORITY and MAX_PRIORITY then it will throw java.lang.IllegalArgumentException 
	}
	
}
