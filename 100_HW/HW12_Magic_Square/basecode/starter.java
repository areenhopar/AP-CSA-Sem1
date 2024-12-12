import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many magic squares would you like to see? ");
		CVMath.specialSquare(sc.nextInt());
	}
}
