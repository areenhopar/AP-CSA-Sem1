import java.util.*;
import java.io.*;

class starter {
    public static boolean containsSymbols(String t) {
        String[] symbols = {"!", "@", "#", "$", "%", "^", "&", "*"};
        
        for (int i = 0; i < symbols.length; i++) {
            if (t.contains(symbols[i])) return true;
        }
        
        return false;
    }
    
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        int l1Count = 0;
        int l2Count = 0;
        int l3Count = 0;
        
        for (i = 0; i < passwords.length; i++) {
            String pw = passwords[i];
            
            if (pw.length() >= 8 && containsSymbols(pw)) {
                l3Count++;
            } if (pw.length() >= 8) {
                l1Count++;
            } if (containsSymbols(pw)) {
                l2Count++;
            }
        }
		
		System.out.println("Level 1 passwords found: " + l1Count);
		System.out.println("Level 2 passwords found: " + l2Count);
		System.out.println("Level 3 passwords found: " + l3Count);
	}
}
