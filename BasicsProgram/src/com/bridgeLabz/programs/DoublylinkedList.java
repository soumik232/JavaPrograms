/**
 * @author bridgeit Satyendra Singh 
 * Doubly Linked List 
 * method add first and last remove first and last, display forward and backward.
 * Checking empty and return size;
 */
package com.bridgeLabz.programs;

import java.util.NoSuchElementException;

public class DoublylinkedList 
{
	private Node head;
	private Node tail;
	private int size;
	public DoublylinkedList() {
		size=0;
	}
	private class Node
	{
		Node next;
		Node prev;
		Object ele;
		public Node(Node next, Node prev, Object ele) {
			super();
			this.next = next;
			this.prev = prev;
			this.ele = ele;
		}
	}
	public int size(){return size;}
	public boolean isEmpty(){return size==0;}
	public void addFront(Object ele)
	{
		Node temp = new Node (head,null,ele);
		if(head!=null)
			head.prev=temp;
		head = temp;
		if(tail==null)
			tail=temp;
		size++;
		//System.out.println("added from front :"+ele);
	}
	public void addRear(Object ele)
	{
		Node temp = new Node (null,tail,ele);
		if(tail!=null)
			tail.next=temp;
		tail = temp;
		if(head==null)
			head=temp;
		size++;
		//System.out.println("added from rear :"+ele);
	}
	public void iterateRear()
	{
		System.out.println("Iterating backward");
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.ele);
			temp=temp.next;
		}
	}
	public void iterateFront()
	{
		System.out.println("Iterating forward");
		Node temp = tail;
		while(temp!=null)
		{
			System.out.println(temp.ele);
			temp=temp.prev;
		}
	}
	public Object removeLast()
	{
		
		if(size==0)throw new NoSuchElementException();
		Node temp= head;
		if(head.next==null)
			tail=null;
		else
			head.next.prev=null;
		head=head.next;
		return temp.ele;
			
	}
	public Object removeFirst()
	{
		if(size==0)throw new NoSuchElementException();
		Node temp = tail;
		if(tail.prev==null)
			head = null;
		else
			tail.prev.next=null;
		tail=tail.prev;
		return temp.ele;
	}
}
