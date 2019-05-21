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

	static int size = 10 ; 	/*�������� ���������� �������� ��� �����*/

	
	public static void main (String [] args) {
	
		 List <Client> client = new ArrayList <Client>();
		 Clinic clinic = new Clinic ();
		

		client.add(new Client ("0","Ivanov","Dog"));	
		client.add(new Client ("1","Nov","Cat"));	
		client.add(new Client ("2","Hov","Dragon"));	
	
		client.add(new Client ("3","��uvanov","Bird"));	
		client.add(new Client ("4","Iov","Bool"));	
		client.add(new Client ("5","Hover","Bool"));	
		
		client.add(new Client ("6","Ponov","Puppy"));	
		client.add(new Client ("7","Cov","Dog"));	
		client.add(new Client ("8","Hover","Cat"));	

		client.add(new Client ("9","Over","Cat"));	
	

		
		clinic.printClinicClients(client);

		
		clinic.findPetsByClients ("Hover", client);			// ������� ���������� � ������� � ��������


		clinic.findClientsbyPets ("Cat" , client);			// ����� ���������� � �������� � ��������
		
		
		
		clinic.changeClientsname ("Over", "9",  "Ivanovsky" , client);	// �������� ������� (������� ��������� - ����� ID)
		clinic.printClinicClients(client);	

		
		clinic.deleteClient ("Ivanovsky", "10", client);		// �������� ������� ������� � �������� ID
		
		clinic.deleteClient ("Ivanovsky", "9", client);			// ������� ������� �� ����� � Id
		
		clinic.printClinicClients(client);	
		
	
	}
}	
