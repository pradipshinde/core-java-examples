package com.pradip.java.typesafeenum;

/**
 * @author Pradip Shinde
 *
 */
public class NewEnumTest {
	
	public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
        THURSDAY, FRIDAY, SATURDAY
    }

    void printAppointment(Day day) {
        System.out.println(" Please come on " + day);
    }

    public static void main(String[] args) 
    {
        new NewEnumTest().printAppointment(Day.TUESDAY);
    }
    
}
