package com.pradip.identifythreads;



/**
 * @author Pradip
 *
 */
public class Test {

	public static void main(String[] args) {
	
		Thread thread=Thread.currentThread();
		System.out.println("Thread Id of main Method :"+thread.getId());
		
		MyThread myThread=new MyThread();
		myThread.start();
		System.out.println("Name Of Thread :"+myThread.getName());
		System.out.println("Id :"+myThread.getId());
		myThread.setName("threadXX"); //Thread name changed
		System.out.println("After changing thread name Thread Id :"+myThread.getId()); //Thread Id remains same, It can not be changed
		
		MyThread2 thread2=new  MyThread2();
		thread2.start();
		System.out.println("Overrided Id :"+thread2.getId());
}
	
}
