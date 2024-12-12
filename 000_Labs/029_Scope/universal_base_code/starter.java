/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		
		String statement = new String(shrek.getName() + " is not ugly!");
		
		if(shrek.isUgly()){
			statement = new String(shrek.getName() + " IS UGLY!");
		}
		
		System.out.println(statement);
		
		donkey.interact(shrek);
		
		int last = 0;
		for (int i = 0; i < 5; i++){
			shrek.interact(donkey);
			last = i + 1;
		}
		System.out.println("That printed out " + last + " times");

	}
}
