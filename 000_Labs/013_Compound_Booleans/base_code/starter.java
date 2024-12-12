/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter your first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a third integer: ");
        int num3 = sc.nextInt();
        
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("The first number you entered, " + num1 + ", is the biggest of your 3 numbers.");
        } 
        if ((num2 > num1) && (num2 > num3)) {
            System.out.println("The second number you entered, " + num2 + ", is the biggest of your 3 numbers.");
        } 
        if ((num3 > num1) && (num3 > num2))  {
            System.out.println("The third number you entered, " + num3 + ", is the biggest of your 3 numbers.");
        }
        
        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("The first number you entered, " + num1 + ", is the smallest of your 3 numbers.");
        }  
        if ((num2 < num1) && (num2 < num3)) {
            System.out.println("The second number you entered, " + num2 + ", is the smallest of your 3 numbers.");
        } 
        if ((num3 < num1) && (num3 < num2)){
            System.out.println("The third number you entered, " + num3 + ", is the smallest of your 3 numbers.");
        }
	}
}
