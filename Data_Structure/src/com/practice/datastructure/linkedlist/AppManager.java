package com.practice.datastructure.linkedlist;

/**
 * @author Pradip
 *
 */
public class AppManager {

	public static void main(String[] args) {

		List<String> linkedList = new LinkedList<>();

		linkedList.insert("Pradip1");
		linkedList.insert("Pradip2");
		linkedList.insert("Pradip3");
		linkedList.insertDataAtEnd("Pradip4");
		linkedList.insertDataAtEnd("Pradip5");
		linkedList.displayList();
		
		System.out.println();
		System.out.println("Size :"+linkedList.size());

	}
}
