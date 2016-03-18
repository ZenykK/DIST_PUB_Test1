package cons_interp;

import java.io.IOException;
import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class interp_main_class {

	public static void main(String[] args) throws IOException {
		// defining variables
		
		System.out.print("Hello there!");
		Console console = null;
		String input = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("\nType something here:");
	    
	    try {
	    	console = System.console();
	        input = reader.readLine();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    	System.out.print("\nInvalid input!");
	    }
	    
	    System.out.println("You entered : " + input);
	}

}
