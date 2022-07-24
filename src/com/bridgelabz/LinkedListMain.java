package com.bridgelabz;
import java.util.Scanner;
public class LinkedListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 To add the data at the start");
		System.out.println("Enter 2 To add the data at the end"); 
		System.out.println("Enter 3 To add the data at in between ");
		System.out.println("Enter 4 To delete the first element "); 
		System.out.println("Enter 5 To delete the last element "); 
		switch (sc.nextInt()) {
		case 1:
			Operations.addDataAtStart();
			break;
		case 2:
			Operations.addDataAtEnd();
			break;
		case 3:
			Operations.insertInBetween();
			break;
		case 4 :
			Operations.deleteAtFirst();
			break;
		case 5 :
			Operations.deleteAtLast();
			break;
		}
	}
}
