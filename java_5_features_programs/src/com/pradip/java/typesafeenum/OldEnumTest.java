package com.pradip.java.typesafeenum;

/**
 * @author Pradip Shinde
 *
 */
public class OldEnumTest {

	 public static final int SUNDAY = 0;
     public static final int MONDAY = 1;
     public static final int TUESDAY = 2;
     public static final int WEDNESDAY = 3;
     public static final int THURSDAY = 4;
     public static final int FRIDAY = 5;
     public static final int SATURDAY = 6;
     
     void printAppointment(int day) {
         System.out.println(" Please come on " + day);
     }

     public static void main(String[] args) 
     {
         new OldEnumTest().printAppointment(WEDNESDAY);
     }
	
}
