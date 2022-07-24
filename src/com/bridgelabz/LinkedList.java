package com.bridgelabz;

public class LinkedList {
	Node head;
	Node tail;

	public void push(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
	}
	public void append(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		else 
		{
			this.tail.next = newNode;
			tail =newNode;
		}

	}
	public void print() {
		if (head == null)
		{
			System.out.println("Linked list is empty");

		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+ " ");
				temp = temp.next;
			}
		}
	}
}
