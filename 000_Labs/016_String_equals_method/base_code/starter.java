/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue? ");
		String role = sc.nextLine();
		String lower = role.toLowerCase();
		
		if (lower.equals("wizard")) {
			System.out.println("You've chosen to be a Wizard! Excelsior!");
		} else if (lower.equals("warrior")) {
			System.out.println("You've chosen to be a Warrior! For honor!");
		} else if (lower.equals("rogue")) {
			System.out.println("You've chosen to be a Rogue! How cunning!");
		} else {
			System.out.println("You've chosen to not select a role. Rerun the program to select one!");
		}
	}
}
