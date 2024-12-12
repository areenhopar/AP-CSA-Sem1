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
		
		myCharacter char1 = new myCharacter();
		char1.myToString();
		
		System.out.print("\nEnter a role: ");
		String r = sc.nextLine();
		
		myCharacter char2 = new myCharacter(r);
		char2.myToString();
	}
}
