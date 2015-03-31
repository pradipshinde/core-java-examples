package com.pradip.joininthread;

/**
 * @author Pradip
 *
 */
public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		MyThread1 thread1=new MyThread1();
		thread1.start();
		try{
		thread1.join(5000); //Thread2 is waiting for thread1 to complete its task
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	for(int i=100;i<=200;i++)
		System.out.println(i);
	}

}
