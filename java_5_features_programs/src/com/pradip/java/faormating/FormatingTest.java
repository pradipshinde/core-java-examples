package com.pradip.java.faormating;

/**
 * @author Pradip Shinde
 *
 */
public class FormatingTest {

	public static void main(String[] args) {
		
		int m1 = 78, m2 = 93, m3= 85;
	    int total = m1 + m2 + m3;
	    double avg = total / 3.0;
	    String result = String.format("Marks: %d, %d, %d. Total: %d, Avg: %.2f", 
	                                    m1, m2, m3, total, avg);
	    System.out.println(result);
		
	}
}
