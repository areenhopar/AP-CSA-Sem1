/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void findDuplicates(int[] arr, int num) {
		System.out.println("The random number to look for is " + num + ":");
		
		int totalDup = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("Duplicate found at index " + i + ".");
				totalDup++;
			}
		}
		
		System.out.println("The total number of duplicates for " + num + " was " + totalDup + ".");
	}
	
	public static void findConsecutive(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && arr[i] == arr[i-1]) {
				System.out.println("Two in a row found at indexes " + (i-1) + " and " + i + ". The number is " + arr[i] + ".");
			}
		}
	}
	
	public static void main(String args[]) {
		int[] arr = new int[20];
		
		System.out.println("--------------------");
		System.out.println("The 20 random numbers: ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n--------------------");
		
		findDuplicates(arr, (int)(Math.random() * 10) + 1);
		
		System.out.println("--------------------");
		System.out.println("Looking for two in a row:");
		
		findConsecutive(arr);
		
		System.out.println("--------------------");
	}
}