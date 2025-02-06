package com.learning.dsa.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList(1);
		
		linkedList.getHead();
		linkedList.getTail();
		linkedList.getLength();
		
		linkedList.printList();
		
		linkedList.append(2);
		linkedList.printList();
		
		linkedList.append(3);
		linkedList.printList();
		
		linkedList.removeLast();
		linkedList.printList();
		
		linkedList.prepend(4);
		linkedList.printList();
		
		linkedList.removeFirst();
		linkedList.printList();
	}

}
