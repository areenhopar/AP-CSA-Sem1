/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers to create a range for random number.");
		System.out.print("Enter the minimum value of your range: ");
		int min = sc.nextInt();
		System.out.print("Enter the maximum value of your range (must be higher): ");
		int max = sc.nextInt();
		
		int range = (max - min);
		
		int rNum1 = (int)(Math.random() * range) + min;
		int rNum2 = (int)(Math.random() * range) + min;
		int rNum3 = (int)(Math.random() * range) + min;
		int rNum4 = (int)(Math.random() * range) + min;
		int rNum5 = (int)(Math.random() * range) + min;
		
		System.out.println("\nYour range is " + min + "-" + max);
		System.out.println("5 random numbers in that range: ");
		System.out.println(rNum1 + "\n" + rNum2 + "\n" + rNum3 + "\n" + rNum4 + "\n" + rNum5);
	}
}
