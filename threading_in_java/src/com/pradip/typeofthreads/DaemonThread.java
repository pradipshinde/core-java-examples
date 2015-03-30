package com.pradip.typeofthreads;


/**
 * @author Pradip
 *
 */
public class DaemonThread extends Thread{

	public DaemonThread(){
		setDaemon(true);
	}
	
	
	@Override
	public void run() {
	for(int i=1;i<1000;i++)
		System.out.println(i);
	}
	
}
