package com.bridgelabz;

public class LinkedList {
	Node head;
	Node tail;

	public Node push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
		return newNode;
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
	public void insertInBetween(Node previousNode ,Node newNode){
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;

	}
	public Node popfirst(){
		Node tempNode = this.head;
		this.head = head.next;
		return tempNode;
	}
	public Node poplast(){		
		if(head == null) {
			System.out.println("List is empty");
		}		
		Node lastNode = head;
		Node previousNode = null;
		while(lastNode.next != null) {
			previousNode = lastNode;
			lastNode = lastNode.next;
		}
		previousNode.next = null;
		return lastNode;
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
