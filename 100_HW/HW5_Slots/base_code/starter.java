/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static int playSlots(int wager) {
		int r1 = (int)(Math.random() * 9 + 1) + 1;
		int r2 = (int)(Math.random() * 9 + 1) + 1;
		int r3 = (int)(Math.random() * 9 + 1) + 1;
		
		System.out.println("\n Great! Let\'s play!!!");
		System.out.println("You rolled...");
		System.out.println("\n_______________");
		System.out.println("-| " + r1 + " | " + r2 + " | " + r3 + " |-");
		System.out.println("_______________");
		
		if (r1 == r2 && r2 == r3) {
			System.out.println("\nJACKPOT! Your wager has been tripled and you are now invincible for 4 minutes and 11 seconds.");
			return wager * 3;
		} else if (r1 == r2 || r1 == r3 || r2 == r3) {
			System.out.println("\nYou won! Your wager has been doubled!");
			return wager * 2;
		} else {
			System.out.println("\nDidn\'t win, better luck next time!");
			return 0;
		}
	}
	
	public static int getWager(int balance) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("You have $" + balance + ". How much would you like to wager? ");
		int wager = sc.nextInt();
		sc.nextLine();
		
		while (wager < 0 || wager > balance) {
			if (wager < 0) {
				System.out.println("Too low! Your wager can\'t be 0 or negative.");
			} else if (wager > balance) {
				System.out.println("Too high! Your wager can\'t be higher than your balance. No using non-existant money!");
			}
			
			System.out.print("Make another wager: ");
			wager = sc.nextInt();
			sc.nextLine();
		}
		
		return wager;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int balance = 100;
		
		//Initial print
		System.out.println("Welcome to the casino!");
		System.out.println("Slot Machine Rules: ");
		System.out.println(" 1. Each player starts with $100");
		System.out.println(" 2. Input a wager less than or equal to your total amout of money");
		System.out.println(" 3. The slot machine will roll 3 numbers from 1-10");
		System.out.println("   a. If two of the numbers match, your wager will double");
		System.out.println("   b. If all three numbers match, you get a jackpot! Your wager will triple");
		System.out.println("   c. If none match, you lose the wagered amount");
		
		
		
		while (true) {
			System.out.println("\n\n--------------------------------------------------\n\n");
			
			if (balance <= 0) {
				System.out.println("You\'ve run out of money! Thanks for coming! Come back soon.... (we know you will)");
				break;
			}
			
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) ");
			String choice = (sc.nextLine()).toLowerCase();
			
			if (choice.equals("n") || choice.equals("no")) {
				System.out.println("Sad to see you go! You still have $" + balance + " left. Come back soon!");
				break;
			} else if (!choice.equals("y") && !choice.equals("yes")) {
				System.out.println("That\'s not quite a yes. Try again.");
				continue;
			}
			
			int wager = getWager(balance);
			balance -= wager;
			
			int winnings = playSlots(wager);
			balance += winnings;
			
			System.out.println("You now have $" + balance + " in your account.");
		}
	}
}
