/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y) {
		int i = 0;
		int res = 1;
		
		while (i < y) {
			res *= x;
			i++;
		}
		
		return res;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer (x): ");
		int x = sc.nextInt();
		System.out.print("Enter an integer (y): ");
		int y = sc.nextInt();
		
		System.out.println(pow(x, y));
	}
}
