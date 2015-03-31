package com.pradip.joininthread;

/**
 * @author Pradip
 *
 */
public class MyThread3 extends Thread {

	@Override
	public void run() {
		MyThread2 thread2=new MyThread2();
		thread2.start();
		try{
			thread2.join(5000); //Thread3 is waiting for thread2 to complete its task
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		for(int i=200;i<=300;i++)
		{
			System.out.println(i);
		}
	}
}
