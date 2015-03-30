package com.pradip.define.usageitselfthreadclass;

/**
 * @author Pradip
 *
 */
public class AnotherClass {

	public void method()
	{
      //another class can also perform the task of UsageClass		
		UsageClass class1=new UsageClass();
		class1.start();
	}
}
