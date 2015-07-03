package com.pradip.program.alphabetcounter;
 
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Input  String:EEEEAABBBDDAAFZZ
 * Output String:E4A4B3D2F1Z2
 *
 */
/**
 * @author Pradip
 *
 */
public class AlphabetCounter {
private static String myString="EEEEAABBBDDAAFZZ";
private static int counter=0;
private static StringBuffer resultString=new StringBuffer();
	
public static void main(String[] args) {
Set<String> myStringSet=new LinkedHashSet<String>();
//add single character as a String in Set
for(int i=0;i<myString.length();i++)
{
	myStringSet.add(((Character)myString.charAt(i)).toString());
}

for(String string:myStringSet)
{
for(int i=0;i<myString.length();i++)
{
if(string.equals(((Character)myString.charAt(i)).toString()))
{
counter++;
}
}
resultString.append(string+""+counter);
counter=0;
}
System.out.println("Final Result: "+resultString);
}

}
