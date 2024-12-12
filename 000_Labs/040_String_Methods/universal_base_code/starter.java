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
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		System.out.println("Your last name: " + name.substring(name.indexOf(" ") + 1));
	}
}
