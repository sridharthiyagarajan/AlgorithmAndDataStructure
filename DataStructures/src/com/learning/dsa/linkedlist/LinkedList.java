package com.learning.dsa.linkedlist;

public class LinkedList {

	class Node {
		private int value;

		private Node next;

		Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	private Node head;

	private Node tail;

	private int length;

	public LinkedList(int value) {
		Node node = new Node(value, null);
		this.head = node;
		this.tail = node;
		this.length = 1;
	}

	public void printList() {
		Node temp = this.head;

		System.out.println("In printList()");
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void getHead() {
		System.out.println("Head value is : " + this.head.value);
	}

	public void getTail() {
		System.out.println("Tail value is : " + this.tail.value);
	}

	public void getLength() {
		System.out.println("Total length of linked list is : " + this.length);
	}

	public void append(int value) {

		Node newNode = new Node(value, null);

		if (length == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.length++;
	}

	public Node removeLast() {

		Node removedNode = null;

		if (length == 1) {

			this.head = null;
			this.tail = null;
			this.length = 0;

			return removedNode;

		} else if (this.length == 0) {
			return removedNode;
		} else {

			Node temp = this.head;
			Node nodeBeforeTail = this.head;

			while (temp.next != null) {
				nodeBeforeTail = temp;
				temp = temp.next;
			}
			nodeBeforeTail.next = null;
			this.tail = nodeBeforeTail;
			this.length--;

			return removedNode;
		}
	}

	public void prepend(int value) {

		if (this.length == 0) {
			append(value);
		} else {

			Node newNode = new Node(value, this.head);
			this.head = newNode;
			this.length++;
		}
	}

	public Node removeFirst() {

		if (this.length == 0) {
			return null;
		} else if (this.length == 1) {
			return removeLast();
		} else {
			Node head = this.head;
			Node nodeAfterHead = this.head.next;

			this.head = nodeAfterHead;
			head.next = null;

			this.length++;

			return head;
		}
	}

	public Node get(int index) {

		if (index < 0 || index >= this.length) {
			return null;
		}

		Node temp = this.head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void insert(int value, int index) {

		if (index < 0 || index >= this.length) {
			return;
		}

		if (index == 0) {
			Node newNode = new Node(value, this.head);
			this.head = newNode;
			this.tail = newNode;

			this.length++;

			return;
		} else if (index == this.length - 1) {
			append(value);
		} else {
			Node temp = this.head;
			Node nextNode = this.head.next;

			for (int i = 1; i < index; i++) {

				temp = temp.next;
				nextNode = temp.next;
			}

			Node newNode = new Node(value, nextNode);
			temp.next = newNode;

			this.length++;
		}
	}

	public void remove(int index) {

		if (index <= 0 || index >= this.length) {
			return;
		}

		if (index == this.length - 1) {
			removeLast();
		} else {

			Node prevNode = get(index - 1);
			Node temp = prevNode.next;

			prevNode.next = temp.next;
			temp.next = null;
			this.length--;
		}
	}

	public boolean set(int value, int index) {

		Node temp = get(index);

		if (temp != null) {
			temp.value = value;

			return true;
		} else {
			return false;
		}
	}

	public void reverse() {

		Node temp = this.head;
		System.out.println(temp.next.value);
		this.head = this.tail;
		this.tail = temp;

		Node before = null;
		Node after = temp.next;

		for (int i = 0; i < this.length; i++) {
			if (temp != null) {
				after = temp.next;
				temp.next = before;
				before = temp;
				temp = after;
			}
		}
	}
}
