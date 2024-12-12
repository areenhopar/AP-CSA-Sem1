/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter chr = new myCharacter();
		System.out.println("You are a " + chr.role);
		System.out.println("Your strength is: " + chr.str);
		System.out.println("Your dexterity is: " + chr.dex);
		System.out.println("Your intelligence is: " + chr.intel);
		System.out.println("Your charisma is: " + chr.cha);
	}
}
