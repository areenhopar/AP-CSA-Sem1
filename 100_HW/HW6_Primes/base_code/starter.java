/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int num) {
		int i = num;
		while (i >= 2) {
			if (num % i == 0 && num != i) {
				return false;
			}
			
			i--;
		}
		
		return true;
	}
	
	public static void printPrimes(int num) {
		if (num <= 1) {
			return;	
		}
		
		int i = 2;
		while (i <= num) {
			if (checkPrime(i)) {
				System.out.println(i);
			}
			
			i++;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and every prime number until that number will be printed: ");
		int num = sc.nextInt();
		
		printPrimes(num);
	}
}
