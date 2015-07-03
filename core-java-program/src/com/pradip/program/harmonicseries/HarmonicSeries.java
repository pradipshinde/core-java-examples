package com.pradip.program.harmonicseries;

/*
Input - 5
Output - 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.28 (Approximately) */

/**
 * @author Pradip
 *
 */
class HarmonicSeries{
    public static void main(String args[]){
            int num = 5;
            double result = 0.0;
            while(num > 0){
                    result = result + (double) 1 / num;
                    num--;
            }
            System.out.println("Output of Harmonic Series is "+result);
    }
}
