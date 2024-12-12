package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	//GLOBAL VARIABLES\\
	
	String name;
	int age;
	String breed;
	
	//CONSTRUCTORS\\
	
	public Dog() {
		this.name = "Clifford";
		this.age = 1;
		this.breed = "Dog dog";
	}

	public Dog(String name) {
		this.name = name;
		this.age = 1;
		this.breed = "Dog dog";
	}

	public Dog(String name, String breed) {
		this.name = name;
		this.age = 1;
		this.breed = breed;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = "Dog dog";
	}
	
	//METHODS\\
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		int sleeping = (int)(Math.random() * 2);
		
		return sleeping == 1;
	}
	
	public void bark() {
		System.out.println(name + " barks!");
	}
}