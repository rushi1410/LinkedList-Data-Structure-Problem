package com.bridgelabz;
import java.util.Scanner;
public class LinkedListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 To add the data at the start");
		System.out.println("Enter 2 To add the data at the end"); 
		System.out.println("Enter 3 To add the data at in between "); 
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
		}
	}
}
