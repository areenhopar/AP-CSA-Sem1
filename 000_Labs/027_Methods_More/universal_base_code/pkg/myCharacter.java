/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int str;
	public int dex;
	public int intel;
	public int cha;
	
	public myCharacter() {
		role = new String("No Role");
		str = 0;
		dex = 0;
		intel = 0;
		cha = 0;
	}
	
	public String setRole(String r) {
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
		
		return role;
	}
	
	public int setStrength(int s) {
		if (s < 0) {
			str = 0;
		} else {
			str = s;
		}
		
		return str;
	}
	
	public int setDexterity(int d) {
		if (d < 0) {
			dex = 0;
		} else {
			dex = d;
		}
		
		return dex;
	}
	
	public int setIntelligence(int i) {
		if (i < 0) {
			intel = 0;
		} else {
			intel = i;
		}
		
		return intel;
	}
	
	public int setCharisma(int c) {
		if (c < 0) {
			cha = 0;
		} else {
			cha = c;
		}
		
		return cha;
	}
	
	public boolean setAll(String r, int s, int d, int i, int c) {
		setRole(r);
		setStrength(s);
		setDexterity(d);
		setIntelligence(i);
		setCharisma(c);
		
		return true;
	}
	
	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength is: " + str);
		System.out.println("Your dexterity is: " + dex);
		System.out.println("Your intelligence is: " + intel);
		System.out.println("Your charisma is: " + cha);
	}
}