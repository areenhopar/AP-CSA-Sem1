/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter another integer: ");
		int num2 = sc.nextInt();
		
		if (num1 != num2) {
			System.out.println("Numbers are different");
		} else {
			System.out.println("Numbers are the same");
		}
	}
}
