package com.pradip.priority;

/**
 * @author Pradip
 *
 */
public class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			try {
				
			Thread.sleep(1000); //This thread sleep for 1 second remember It is always current thread that is going to sleep
			System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
