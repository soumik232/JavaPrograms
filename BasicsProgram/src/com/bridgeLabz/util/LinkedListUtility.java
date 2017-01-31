package com.bridgeLabz.util;


public class LinkedListUtility {
	private Node start;
	private Node last;
	private int size;

	private class Node {
		Object ele;
		Node next;

		// constructor
		Node(Object ele) {
			this.ele = ele;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next2) {
			next = next2;
		}
	}

	public boolean remove(int index) {
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Node temp = start;
		if (start != null) {
			for (int i = 1; i < index; i++) {
				if (temp.getNext() == null)
					return false;

				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());

			// decrement the number of elements variable
			size--;
			return true;
		}
		return false;
	}
	// returning size linked list
	public int size() {
		return size;
	}
	// check is empty linked list
	public boolean isEmpty() {
		return start == null;
	}
	// Linked list add
	public void add(Object ele) {
		size++;
		if (start == null) {
			start = new Node(ele);
			last = start;
			return;
		}
		last.next = new Node(ele);
		last = last.next;
	}
	// get object of linkedlist type
	public Object getObject(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException();
		Node p = start;
		for (int i = 1; i <= index; i++) {
			p = p.next;
		}
		return p.ele;
	}
}
