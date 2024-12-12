/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int num = (int)(Math.random() * 1000) + 1;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Make a guess, type any integer from 1-1000: ");
        int guess = sc.nextInt();

		while (true){
			if (guess == num) {
			    System.out.println("You guessed the number correctly! Good job.");
			    break;
			} else if (guess > num) {
				System.out.println("The number you guessed was higher than the correct number.");
			} else {
				System.out.println("The number you guessed was lower than the correct number.");
			}
	        
	        System.out.print("Make another guess from 1-1000: ");
        	guess = sc.nextInt();
		}
	}
}
