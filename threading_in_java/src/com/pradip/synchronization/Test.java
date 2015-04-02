package com.pradip.synchronization;

/**
 * @author Pradip
 *
 */
public class Test {

	public static void main(String[] args) {
	final Shared shared=new Shared();

	Thread thread1=new Thread()
	{
		
		@Override
		public void run()  {
			shared.sharedMethod();
		}
		
	};
	
	Thread thread2=new Thread()
	{
		
		@Override
		public void run() {
			shared.sharedMethod();
		}
	};
	
	
	thread1.start();//Thread1 Starts

	thread2.start();//Thread2 Starts
	}
	
}
