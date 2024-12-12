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
		
		System.out.println("Enter any text: ");
		String t = sc.nextLine();
		
		System.out.println("Before: " + t);
		
		String result = "";
		while (true) {
			if (t.indexOf(" ") == -1) {
				result = t + result;
				break;
			}
			
			int space = t.indexOf(" ");
			String word = t.substring(0, space);
			
			result = " " + word + result;
			
			t = t.substring(space + 1);
		}
		
		System.out.println("After: " + result);
	}
}
