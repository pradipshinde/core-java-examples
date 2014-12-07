package com.pradip.java.staticimport;
import static java.lang.Integer.*;
import static java.lang.String.*;

/**
 * @author Pradip Shinde
 *
 */
public class StaticImportTest {
	
public static void main(String[] args) {
	 int num = parseInt("526");	// => Integer.parseInt()
     Integer num2 = valueOf("123");	// => Integer.valueOf()
     // => String.format()
     System.out.println(format("Numbers: %d, %d, %c", num, num2, 65));
     // => Integer.MAX_VALUE
     System.out.println(" Integer MAX value = " + MAX_VALUE);
}

}
