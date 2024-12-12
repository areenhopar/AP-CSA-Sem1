/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int len = (int)(Math.random() * 150) + 51;
		int[] arr = new int[100];
		
		int min = Integer.MAX_VALUE;
		int max = 0;
		int avg = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
			
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		avg /= len;
		
		System.out.println("Number of elements: " + len + "\nAverage of array values: " + avg + "\nMinimum Value: " + min + "\nMaximum value: " + max);
	}
}
