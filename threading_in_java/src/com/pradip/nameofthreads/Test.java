package com.pradip.nameofthreads;

/**
 * @author Pradip
 *
 */
public class Test {

	public static void main(String[] args) {
		
	Thread thread1=Thread.currentThread();
	System.out.println(thread1.getName()); //get a name of main Thread or primary Thread
	thread1.setName("mainThread"); //change the name of main thread
	System.out.println(thread1.getName()); //get the modified name
	
		UserThread thread=new UserThread();
		thread.setName("firstThread");
		thread.start();
		String name=thread.getName();
		System.out.println(name);
		thread.setName("firstThread1");
		System.out.println(thread.getName());
		try {
		
			UserThread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.setName("UserThread");
		System.out.println(thread.getName());
		
	}
}
