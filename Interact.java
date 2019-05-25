package my_clinic;

import java.util.Scanner;

public class Interact {

   // private final Clinic clinic;
   // private final Client client;
    
    
    public void consoleInputName () {	
    	Scanner in = new Scanner(System.in);
    	System.out.println("Input name: ");
    	String name = in.next();
    
    	System.out.println(name);
    
    	if (  name.equals("1")  ) {
    		System.out.println(name);

		// clients.add(new Client (Id,name ,pets));	
    	}
    	else {
    		System.out.println("Ваши введенные данные не будут сохранены ");
    	} 
    	in.close();
    }
	
	
}
