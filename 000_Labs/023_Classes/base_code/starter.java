/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class myCharacter {
	String role = new String("Warrior");
	int str = 10;
	int dex = 0;
	int intel = 0;
	int cha = 10;
}

class starter {
	public static void main(String args[]) {
		myCharacter chr = new myCharacter();
		System.out.println("You are a " + chr.role);
		System.out.println("Your strength is: " + chr.str);
		System.out.println("Your dexterity is: " + chr.dex);
		System.out.println("Your intelligence is: " + chr.intel);
		System.out.println("Your charisma is: " + chr.cha);
	}
}
