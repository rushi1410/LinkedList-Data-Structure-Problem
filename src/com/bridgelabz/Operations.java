package com.bridgelabz;

public class Operations {
	public static void addDataAtStart() {
		LinkedList linkedList = new LinkedList();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.print();
	}
	public static void addDataAtEnd() {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();

	}
	public static void insertInBetween() {
		LinkedList linkedList = new LinkedList();
		Node secondNode = linkedList.push(70);
		Node firstNode = linkedList.push(56);
		Node newNode= new Node(30);
		System.out.println("Before:");
		linkedList.print();
		linkedList.insertInBetween(firstNode, newNode);
		System.out.println();
		System.out.println("after:");
		linkedList.print();
	}
	public static void deleteAtFirst() {
		LinkedList linkedList = new LinkedList();		
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);		
		System.out.println("LinkedList:");
		linkedList.print();
		linkedList.popfirst();
		System.out.println("\nAfter Delete first Elememnt:");
		linkedList.print();
	}

	public static void deleteAtLast() {
		LinkedList linkedList = new LinkedList();		
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);		
		System.out.println("LinkedList:");
		linkedList.print();
		linkedList.poplast();
		System.out.println("\nAfter Delete last Elememnt:");
		linkedList.print();
	}
}