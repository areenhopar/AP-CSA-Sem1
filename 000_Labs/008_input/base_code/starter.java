/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("What is your first name? ");
	    String name = sc.nextLine();
	    
	    System.out.println("How old are you? ");
	    int age = sc.nextInt();
	    
	    System.out.println("What month were you born? (1-12) ");
	    int bMonth = sc.nextInt();
	    
	    System.out.println("What day were you born? (1-31) ");
	    int bDay = sc.nextInt();
	    
	    System.out.println("What year were you born? ");
	    int bYear = sc.nextInt();
	    
	    System.out.println("How much is a dollar and 2 quaters? ");
	    double buckFifty = sc.nextDouble();
	    
	    System.out.println("Your name is " + name + " and you are " + age + " years old! You were born on " + bMonth + "/" + bDay + "/" + bYear + ". You have $" + buckFifty + " in your wallet.");
	}
}
