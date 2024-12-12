/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.*;

class starter {
	public static boolean containsVowel(String text) {
		String[] vowels = {"a", "e", "i", "o", "u"};
		
		for (int i = 0; i < vowels.length; i++) {
			if (text.contains(vowels[i])) return true;
		}
		
		return false;
	}
	
	public static String toPigLatin(String text) {
		if (containsVowel(text.substring(0, 1))) {
			return text + "-way";
		} else if (!containsVowel(text.substring(0, 1)) && !containsVowel(text.substring(1, 2))) {
			return text.substring(2) + "-" + text.substring(0, 1) + text.substring(1, 2) + "ay";
		} else {
			return text.substring(1) + "-" + text.substring(0, 1) + "ay";
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any text: ");
		String t = sc.nextLine();
		
		while (true) {
            if (t.indexOf(" ") == -1) {
                System.out.print(toPigLatin(t));
                break;
            }
            
            int space = t.indexOf(" ");
		    String word = t.substring(0, space);
		    
		    System.out.print(toPigLatin(word) + " ");
		    
		    t = t.substring(space + 1);
        }
	}
}
