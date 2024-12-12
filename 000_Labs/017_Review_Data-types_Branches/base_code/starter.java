/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//ask for name
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		
		//ask for title
		System.out.print("What is your title (ex: Elden Lord)? ");
		String title = sc.nextLine();
		
		//ask for role
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue? ");
		String role = sc.nextLine();
		String lower = role.toLowerCase();
		
		if (lower.equals("wizard")) {
			System.out.println("You've chosen to be a Wizard! Excelsior!");
		} else if (lower.equals("warrior")) {
			System.out.println("You've chosen to be a Warrior! For honor!");
		} else if (lower.equals("rogue")) {
			System.out.println("You've chosen to be a Rogue! How cunning!");
		} else {
			System.out.println("You've chosen to not select a role. Rerun the program to select one!");
		}
		
		//Stat points!
		int leftoverPoints = 20;
		
		System.out.println("\nYou have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely!");
		
		//Strength
		System.out.print("Strength (0-10): ");
		int str = sc.nextInt();
		
		while (true) {
			if (str <= 10 && leftoverPoints - str >= 0 && str >= 0) {
				leftoverPoints -= str;
				break;
			} else {
				System.out.println("You have entered an invalid amount of points. It is either above 10, below 0, or higher than the amount of points you have left. Please try again");
				System.out.print("Strength (0-10): ");
				str = sc.nextInt();
			}
		}
		
		System.out.println("You have " + leftoverPoints + " points left.");
		
		System.out.print("Dexterity (0-10): ");
		int dex = sc.nextInt();
		
		while (true) {
			if (dex <= 10 && leftoverPoints - dex >= 0 && dex >= 0) {
				leftoverPoints -= dex;
				break;
			} else {
				System.out.println("You have entered an invalid amount of points. It is either above 10, below 0, or higher than the amount of points you have left. Please try again");
				System.out.print("Dexterity (0-10): ");
				dex = sc.nextInt();
			}
		}
		
		System.out.println("You have " + leftoverPoints + " points left.");
		
		System.out.print("Intelligence (0-10): ");
		int intel = sc.nextInt();

		while (true) {
			if (intel <= 10 && leftoverPoints - intel >= 0 && intel >= 0) {
				leftoverPoints -= intel;
				break;
			} else {
				System.out.println("You have entered an invalid amount of points. It is either above 10, below 0, or higher than the amount of points you have left. Please try again");
				System.out.print("Intelligence (0-10): ");
				intel = sc.nextInt();
			}
		}
		
		System.out.println("You have " + leftoverPoints + " points left.");

		System.out.print("Charisma (0-10): ");
		int cha = sc.nextInt();
		
		while (true) {
			if (cha <= 10 && leftoverPoints - cha >= 0 && cha >= 0) {
				leftoverPoints -= cha;
				break;
			} else {
				System.out.println("You have entered an invalid amount of points. It is either above 10, below 0, or higher than the amount of points you have left. Please try again");
				System.out.print("Charisma (0-10): ");
				cha = sc.nextInt();
			}
		}
		
		if (leftoverPoints > 0) {
			System.out.println("You have " + leftoverPoints + " points left.");
		}

		System.out.println("\nYou have " + leftoverPoints + " points to spend for next time.");
		System.out.println("\n--------------------");
		System.out.println("\nYou are " + name + ", the " + title + " of CVHS!");
		System.out.println("You're a " + role + " with the following stats: ");
		System.out.println("Stength: " + str);
		System.out.println("Dexterity: " + dex);
		System.out.println("Intelligence: " + intel);
		System.out.println("Charisma: " + cha);
	}
}