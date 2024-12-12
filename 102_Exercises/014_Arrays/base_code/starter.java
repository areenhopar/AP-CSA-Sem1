/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] arr0 = new int[1001];
		 int[] arr1 = new int[1001];

		 for (int i = 0; i < arr0.length; i++) {
		 	arr0[i] = 3 + (3*i);
		 }
		 
		 for (int i = 0; i < arr1.length; i++) {
		 	arr1[i] = 1000 - i;
		 }
		 
		 for (int i = 0; i < arr0.length; i++) {
		 	System.out.println(arr0[i]);
		 }
		 
		 for (int i = 0; i < arr1.length; i++) {
		 	System.out.println(arr1[i]);
		 }
	}
}
