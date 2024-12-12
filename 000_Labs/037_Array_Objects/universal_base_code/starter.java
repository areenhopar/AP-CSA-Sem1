/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] wizards = new Wizard[100];
		Warrior[] warriors = new Warrior[100];
		
		for (int i = 0; i < wizards.length; i++) {
			wizards[i] = new Wizard();
			warriors[i] = new Warrior();
		}
		
		int wi = 0;
		int wa = 0;
		
		while (true) {
			if (wa >= 99 || wi >= 99) {
				break;
			}
			
			wizards[wi].attack(warriors[wa]);
			warriors[wa].attack(wizards[wi]);
			
			if (warriors[wa].isDead()) {
				System.out.println(wizards[wi].getName() + " defeats " + warriors[wa].getName() + " with " + wizards[wi].getHealth() + " health!");
				wa++;
			}
			if (wizards[wi].isDead()) {
				System.out.println(warriors[wa].getName() + " defeats " + wizards[wi].getName() + " with " + warriors[wa].getHealth() + " health!");
				wi++;	
			}
		}
		
		System.out.println();
		
		if (wa >= 99) {
			System.out.println("WIZARDS ARE VICTORIOUS!");
			System.out.println("The wizards won with " + (100 - wi) + " left.");
		} else if (wi >= 99) {
			System.out.println("WARRIORS ARE VICTORIOUS!");
			System.out.println("The warriors won with " + (100 - wa) + " left.");
		}
	}
}
