/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int str = 0;
	public int dex = 0;
	public int intel = 0;
	public int cha = 0;
	
	public myCharacter() {
		role = new String("No Role");
	}

	public myCharacter(String r) {
		String lower = r.toLowerCase();
		
		if (lower.equals("wizard")) {
			role = new String("Wizard");
			System.out.println("You've chosen to be a Wizard! Excelsior!");
		} else if (lower.equals("warrior")) {
			System.out.println("You've chosen to be a Warrior! For honor!");
			role = new String("Warrior");
		} else if (lower.equals("rogue")) {
			System.out.println("You've chosen to be a Rogue! How cunning!");
			role = new String("Rogue");
		} else {
			role = new String("No Role");
			System.out.println("You've chosen to not select a role. Rerun the program to select one!");
		}
	}
}

