/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		myCharacter chr = new myCharacter();
		System.out.println("Your role is " + chr.role);
		System.out.println("Your strength is: " + chr.str);
		System.out.println("Your dexterity is: " + chr.dex);
		System.out.println("Your intelligence is: " + chr.intel);
		System.out.println("Your charisma is: " + chr.cha);
		
		System.out.println("----------------------");
		
		System.out.print("Enter a role (Warrior, Wizard, Rogue): ");
		String role = sc.nextLine();
		
		myCharacter chr2 = new myCharacter(role);
		System.out.println("Your role is " + chr2.role);
		System.out.println("Your strength is: " + chr2.str);
		System.out.println("Your dexterity is: " + chr2.dex);
		System.out.println("Your intelligence is: " + chr2.intel);
		System.out.println("Your charisma is: " + chr2.cha);

	}
}
