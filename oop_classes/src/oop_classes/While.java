package oop_classes;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type in your password:");
		String password = input.nextLine();
		
		while (!password.equals("ifpb")) {  // String.equalsIgnoreCase(String)
			System.out.println("Sorry, try again.");
			password = input.nextLine();
		}
		input.close();
		System.out.println("Ok, you got it right!");
	}
}
