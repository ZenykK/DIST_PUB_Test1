package cons_interp;

import java.io.IOException;
import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class interp_main_class {

	static void ping (Socket socket) throws IOException, UnknownHostException{
		
		System.out.print("Ping successfull");
	}
	
	static void echo (Socket socket, String[] args) throws IOException{
		
		System.out.print("Reply:" + echo_message);
		
		catch (IOException e) {
	    	e.printStackTrace();
	    	System.out.print("\nInvalid input!");
	    }
	}
	
	static void list (Socket socket) throws IOException, UnknownHostException{
		
		System.out.print("Ping successfull");
	}
	
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket ("0.0.0.0", 151);		
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
