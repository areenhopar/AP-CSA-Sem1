/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static String toSpongeCase(String word) {
		String res = "";
		
		for (int i = 0; i < word.length(); i++) {
			String letter = word.toLowerCase().substring(i, i+1);
			
			if (i % 2 != 0) letter = letter.toUpperCase();
			res += letter;
		}
		
		return res;
	} //returns: result string
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any text: ");
		String t = sc.nextLine();
		
		System.out.println("Your text as sPoNgE cAsE: ");
		
		while (true) {
            if (t.indexOf(" ") == -1) {
                System.out.println(toSpongeCase(t));
                break;
            } //sponge case last word and break
            
            int space = t.indexOf(" ");
		    String word = t.substring(0, space);
		    
		    System.out.print(toSpongeCase(word) + " ");
		    
		    t = t.substring(space + 1);
        }
	}
}
