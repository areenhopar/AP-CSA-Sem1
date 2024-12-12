/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer p1 = new Performer();
		Performer p2 = new Performer("Kanye West", 40);
		
		Musician m1 = new Musician();
		Musician m2 = new Musician("Trumpet");
		
		System.out.println("Performer 1 is " + p1.getName());
		p1.practice();
		System.out.println();
		
		System.out.println("Performer 2 is " + p2.getName());
		p2.perform();
		System.out.println();
		
		System.out.println("Musician 1 is " + m1.getName());
		m1.perform();
		m1.playInstrument();
		System.out.println();
		
		System.out.println("Musician 2 is " + m2.getName());
		System.out.println("Musician 2 plays the " + m2.getInstrument());
	}
}
