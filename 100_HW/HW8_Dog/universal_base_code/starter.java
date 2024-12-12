/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your dog\'s name: ");
		
		Dog dog0 = new Dog(sc.nextLine());
		
		System.out.print("Enter your dog\'s age: ");
		dog0.setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.println("\n" + dog0.getName() + " is a " + dog0.getBreed() + " who is " + dog0.getAge() + " years old!");
		
		Dog dog1 = new Dog("Toby", "Jack Russel Terrier");
		
		System.out.println("\n" + dog1.getName() + " is a " + dog1.getBreed() + " who is " + dog1.getAge() + " years old!");
		
		System.out.println("\n-------------------------\n");
		
		boolean sleeping = dog0.isSleeping();
		if (sleeping) {
			System.out.println(dog0.getName() + " is sleeping! Don\'t wake " + dog0.getName() + " up!");
		} else {
			System.out.println(dog0.getName() + " is awake!");
			dog0.bark();
		}
		
		boolean sleeping2 = dog1.isSleeping();
		if (sleeping2) {
			if (!sleeping) {
				System.out.println(dog1.getName() + " wakes up from hearing " + dog0.getName() + "!");
				dog1.bark();
			} else {
				System.out.println(dog1.getName() + " is sleeping.");
			}
		} else {
			if (!sleeping) {
				System.out.println(dog1.getName() + " hears " + dog0.getName() + "!");
				dog1.bark();
			} else {
				System.out.println(dog1.getName() + " is awake!");
			}
		}
	}
}