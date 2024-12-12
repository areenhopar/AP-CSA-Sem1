/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	static void printKey(String msg, int key) {
		System.out.println(Cipher.keyedEncode(msg, key));
	}
	
	static void unknownKey(String msg) {
		int key = 0;
		while (key <= 36) {
			System.out.print("Key: " + key + " Msg: ");
			printKey(msg, key);
			key++;
		} 
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Would you like to cipher or decipher a message (1/2): ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		if (choice == 1) {
			System.out.print("Enter the message you would like to encode: ");
			String msg = sc.nextLine();
			
			System.out.print("Enter your key (0 for none): ");
			int key = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\nYour encoded message: ");
			System.out.println(Cipher.keyedEncode(msg, key));
		} else if (choice == 2) {
			System.out.print("Enter the message you would like to decipher: ");
			String msg = sc.nextLine();
	
			System.out.print("Is the key known? (y/n): ");
			String choice2 = sc.nextLine();
			
			if (choice2.equals("y")) {
				System.out.print("Enter a key (0 for none): ");
				printKey(msg, sc.nextInt());
			} else if (choice2.equals("n")) {
				unknownKey(msg);
			} else {
				System.out.println("Invalid choice");
			}
		} else {
			System.out.println("Invalid choice");
		}
	}
}
