package com.practice.datastructure.linkedlist;

/**
 * @author Pradip
 *
 * @param <T>
 */
public class LinkedList<T extends Comparable<T>> implements List<T> {

	Node<T> head;
	private int size;

	/**
	 * This method will insert data into LinkedList at first position if list is
	 * empty
	 */
	@Override
	public void insert(T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
		} else {
			insertDataAtBegining(node);
		}
		size++;
	}

	/**
	 * This method will insert data into LinkedList at beginning if list is not
	 * empty
	 * 
	 * @param node
	 */
	private void insertDataAtBegining(Node<T> node) {
		node.setNextNode(head);
		head = node;
	}

	/**
	 * This method will insert data into LinkedList at last position if list is not
	 * empty
	 * 
	 * @param data
	 */
	public void insertDataAtEnd(T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
		} else {
			Node<T> temp = head;
			while (temp != null) {
				if( temp.getNextNode()==null) {
					temp.setNextNode(node);
				}
				temp = temp.getNextNode();
			}
		
		}

	}

	/**
	 * This method will display all nodes data from LinkedList
	 */
	@Override
	public void displayList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNextNode();
		}
		System.out.print("Null");
	}

	/**
	 * This method will return the number of elements present in the LinkedList
	 */
	@Override
	public int size() {
		return size;
	}

}
