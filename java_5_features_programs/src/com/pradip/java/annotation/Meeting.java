package com.pradip.java.annotation;

/**
 * @author Pradip Shinde
 * custom annotaion
 *
 */
public @interface Meeting {
	String what() default "Project meeting";
    String when();
    String location();

}
