package my_clinic;



import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


/*  � ��������� ��������� n-�� ���������� ����������� ������ ������� 
 *  � ����������� ������ �� ������ ������
 *  
 *  
 *		    
 *  @ volkov_artiam
 *  @ 11.05.2019
 *   version 1.4
 * */

public class Clinic_runner {

	
	public static void main (String [] args) {
	
		 List <Client> clients = new ArrayList <Client>();
		 Clinic clinic = new Clinic ();
		 Interact interact1 = new Interact ();
		

		 clients.add(new Client ("0","Ivanov","Dog"));	
		 clients.add(new Client ("1","Nov","Cat"));	
		 clients.add(new Client ("2","Hov","Dragon"));	
		 clinic.addClients( clients);

		 interact1.consoleInputName();
/*		 
	     Scanner in = new Scanner(System.in);
	     System.out.println("Input name: ");
	     String name = in.next();
	     
//	     String Id = "00";
//	     String pets = "100";
	     
	     System.out.println("Input Id: ");
	     String Id = in.next();

	     // �������� �� �������������� ID
	     
	     System.out.println("Input pets: ");
	     String pets = in.next();

	     System.out.println("���� ������ �������� ������� ������� 1 ");
	     String answer = in.next();
	     
	     System.out.println(answer);
	     
	     if (  answer.equals("1")  ) {
			 clients.add(new Client (Id,name ,pets));	
	     }
	     else {
	    	 System.out.println("���� ��������� ������ �� ����� ��������� ");
	     } 

*/	     
	     
		 clinic.printClients();
	//       in.close();
	     


/*	
		 clinic.addClients( clients);
		 clinic.printClients();
		 
		 clients.add(new Client ("3","Hover","Dog"));
		 clinic.printClients();		 
		 

		clinic.findClients("Hov")	;	
		clinic.findPets ("Dog");			// ����� ���������� � �������� � ��������
		
		clinic.changeName ("Hov", "3",  "Kotov" )	;	
		clinic.printClients();
		 
		clinic.deleteClient ("Hov", "2" );	
		clinic.printClients();
*/		

	}
}	
