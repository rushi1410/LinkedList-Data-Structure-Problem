package com.bridgelabz;

public class LinkedListMain {
	public static void main(String[] args) {
		System.out.println("Created A Simple LinkedList: ");
		Node firstNode = new Node (56);
		Node secondNode = new Node (30);
		Node thirdNode = new Node (70);

		Node Head= firstNode;
		firstNode.next=secondNode;
		secondNode.next=thirdNode;

		Node temp =Head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
