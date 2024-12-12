/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter c = new myCharacter();
		c.myToString();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n--------------------");
		System.out.print("Choose a role (Warrior, Wizard, Rogue): ");
		String role = sc.nextLine();
		
		myCharacter c1 = new myCharacter();
		c.setAll(role, 0, 0, 0, 0);
		c.myToString();
	}
}
