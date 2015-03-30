package com.pradip.core.abstraction.usinginterface;


/**
 * @author Pradip
 *Interfaces in java are very much similar to abstract classes 
 *but interfaces contain only abstract methods (you can refer to them as only ideas).
 *Abstract classes may contain both abstract methods as well as concrete methods. 
 *But interfaces must contain only abstract methods. 
 *Concrete methods are not allowed in interfaces.
 *Therefore, Interfaces show 100% abstractness
 */
public interface InterFaceClass {

	int a=10; //by default public static final
	
	void abstractMethod(); //by default public abstract
}
