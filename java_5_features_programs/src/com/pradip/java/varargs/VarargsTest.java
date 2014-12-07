package com.pradip.java.varargs;

/**
 * @author Pradip Shinde
 *
 */
public class VarargsTest {
	
    public static void main(String[] args) 
    {
        System.out.println(" Sum = " + sum(41, 22, 58));
    }

    static int sum(int... numbers) {	// varargs
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    
}
