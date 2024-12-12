/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int num = (int)(Math.random() * 1000) + 1; //range is should be 999 since its 1-1000 and not 0-1000 but top value is excluded so 1 is added
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Make a guess, type any integer from 1-1000: ");
        int guess = sc.nextInt();

        if (guess == num) {
            System.out.println("You guessed the number correctly! Good job.");
        } else if (guess > num) {
        	System.out.println("The number you guessed was higher than the correct number. The number was: " + num + ".");
        } else {
        	System.out.println("The number you guessed was lower than the correct number. The number was: " + num + ".");
        }
	}
}
