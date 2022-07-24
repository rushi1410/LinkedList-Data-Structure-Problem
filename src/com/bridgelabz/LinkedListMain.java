package com.bridgelabz;
import java.util.Scanner;
public class LinkedListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 To add the data at the start");
		System.out.println("Enter 2 To add the data at the end");
		switch (sc.nextInt()) {
		case 1:
			Operations.addDataAtStart();;
			break;
		case 2:
			Operations.addDataAtEnd();
			break;
		}
	}
}
