/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What day is it (0-6)? ");
		int day = sc.nextInt();
		
		if (day < 0 || day > 6) {
			System.out.println("You input something not valid!");
		} else if (day == 0 || day == 6) {
			System.out.println("It's the weekend! It's 10:00 AM.");
		} else {
			System.out.println("It's a week day! Wake up! It's 7:00 AM!");
		}
	}
}
