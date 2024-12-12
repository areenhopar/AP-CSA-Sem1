/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String s) {
		System.out.println(s);
	}
	
	public static void toStringCombined(String s0, String s1) {
		System.out.println(s0 + " " + s1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a phrase: ");
		String in0 = sc.nextLine();
		
		System.out.print("Enter another phrase: ");
		String in1 = sc.nextLine();
		
		System.out.println("\nUsing methods: ");
		toString(in0);
		toStringCombined(in0, in1);
	}
}
