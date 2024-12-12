/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		
		System.out.print("How many times do you want this name repeated? ");
		int max = sc.nextInt();
		
		int i = 0;
		while (i < max) {
			System.out.println(name);
			i++;
		}
	}
}
