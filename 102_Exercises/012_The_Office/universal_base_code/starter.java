/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee[] employees = new Employee[5];
		employees[0] = new Employee();
		employees[0].employeeToString();
		employees[1] = new Employee(1987, "Dwight", "Schrute", 4416.66);
		employees[2] = new Employee(2474, "Jim", "Halpert", 4416.66);
		employees[3] = new Employee(2011, "Pam", "Beesly", 2250);
		employees[4] = new Employee(1213, "Bill", "Gates", 20000.43);
		
		employees[0].raiseSalary(2);
		employees[1].raiseSalary(10);
		employees[2].raiseSalary(5);
		employees[3].raiseSalary(3);
		employees[4].raiseSalary(100);
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println("\n--------------------");
			System.out.println("Employee " + employees[i].getID() + ": " + employees[i].getFirstName() + " " + employees[i].getLastName());
			System.out.println("Monthly salary: " + employees[i].getSalary());
			System.out.println("Annual salary: "+ employees[i].getAnnualSalary());
			System.out.println("--------------------");
		}
	}
}
