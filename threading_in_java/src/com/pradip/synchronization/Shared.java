package com.pradip.synchronization;

/**
 * @author Pradip
 *
 */
public class Shared {

	int i;
	
		public synchronized void sharedMethod()
		{
			Thread t = Thread.currentThread();
			 
	        for(i = 0; i <= 1000; i++)
	        {
	            System.out.println(t.getName()+" : "+i);

			
	        }
		}
	
}
