/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] arr) {
		System.out.println("-------------------------\nAll of the elements in the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n-------------------------");
	}
	
	public static int getArrayAverage(int[] arr) {
		int avg = 0;
		
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		
		avg /= arr.length;
		
		return avg;
	}
	
	public static int getArrayMax(int[] arr) {
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
		
	public static int getArrayMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static void main(String args[]) {
		int[] arr = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		
		toStringArray(arr);
		System.out.println("The average of the 100 numbers: " + getArrayAverage(arr));
		System.out.println("The maximum of the 100 numbers: " + getArrayMax(arr));
		System.out.println("The minimum of the 100 numbers: " + getArrayMin(arr));

	}
}
