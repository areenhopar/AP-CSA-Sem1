/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int rNum1 = (int)(Math.random() * 10);
		int rNum2 = (int)(Math.random() * 101) + 1;
		double rNum3 = Math.random() + 2.5;
		double rNum4 = Math.random() * 575 + 14;
		
		System.out.println("Random number between 0 and 9: " + rNum1);
		System.out.println("Random number between 1 and 100: " + rNum2);
		System.out.println("Random number between 2.5 and 3.5: " + rNum3);
		System.out.println("Random number between 14 and 589: " + rNum4);
	}
}
