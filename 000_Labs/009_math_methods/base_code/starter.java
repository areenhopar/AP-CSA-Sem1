/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
        double a = Math.max(13 - 6 * 11, 30 % 7 * (-2));
        double b = Math.sqrt(3 * 8 + 31 % 7);
        double c = Math.pow(37 / 3, 35 % 21);
        double d = Math.max(Math.pow(2, 14 % 3), Math.sqrt(2 * 6));
        
        System.out.println("Maximum = " + a);
        System.out.println("Square Root = " + b);
        System.out.println("Power = " + c);
        System.out.println("Max = " + d);
        
        System.out.print("\nEnter any number value (x): ");
        double x = sc.nextDouble();
        System.out.print("Enter another number value (y): ");
        double y = sc.nextDouble();
        System.out.println();
        
        double max = Math.max(x, y);
        double sqrt = Math.sqrt(y);
        double pow = Math.pow(x, y);
        
        System.out.println("Max of your 2 numbers: " + max);
        System.out.println("The square root of y: " + sqrt);
        System.out.println("x to the power of y: " + pow);
	}
}
