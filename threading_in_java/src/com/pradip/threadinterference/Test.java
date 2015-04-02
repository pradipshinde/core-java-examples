package com.pradip.threadinterference;

/**
 * @author Pradip
 *
 */
public class Test {

	public static void main(String[] args) {
	final Shared shared=new Shared();
	//Counter c=new Counter();
	Thread thread1=new Thread()
	{
		
		@Override
		public void run()  {
			/*System.out.println("Thread 1:"+c.getCounter());
			c.increment();
			System.out.println("Thread 1:"+c.getCounter());*/
		shared.sharedMethod();
		}
		
	};
	
	Thread thread2=new Thread()
	{
		
		@Override
		public void run() {
			/*System.out.println("Thread 2:"+c.getCounter());
			c.decrement();
			System.out.println("Thread 2:"+c.getCounter());*/
		shared.sharedMethod();
		}
	};
	
	//System.out.println("Main Thread:"+c.getCounter());
	thread1.start();//Thread1 Starts

	thread2.start();//Thread2 Starts
	}
	
}
