package my_clinic;


import java.util.Scanner;


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
	
		
		final Clinic clinic = new Clinic (size);
		

		clinic.addClient(0, new Client (1,"Ivanov","Dog"));	
		clinic.addClient(1, new Client (2,"Nov","Cat"));	
		clinic.addClient(2, new Client (3,"Hov","Dragon"));	
		
		clinic.addClient(3, new Client (4,"��uvanov","Bird"));	
		clinic.addClient(4, new Client (5,"Iov","Bool"));	
		clinic.addClient(5, new Client (6,"Hover","Bool"));	
		
		clinic.addClient(6, new Client (7,"Ponov","Puppy"));	
		clinic.addClient(7, new Client (8,"Cov","Dog"));	
		clinic.addClient(8, new Client (9,"Hover","Cat"));	
	
		clinic.addClient(9, new Client (10,"Over","Cat"));	
	
		
		clinic.printClinicClients();				// ������� � ������� ������ ��������

		clinic.findPetsByClients ("Hover");			// ������� ���������� � ������� � ��������
		
		clinic.findClientsbyPets ("Bool");			// ����� ���������� � �������� � ��������
		
		clinic.changeClientsname ("Over", 10,  "Ivanovsky");	// �������� ������� (������� ��������� - ����� ID)

		clinic.printClinicClients();
		
		
		clinic.deleteClient ("Ivanovsky", 9);		// �������� ������� ������� � �������� ID
		
		clinic.deleteClient ("Ivanovsky", 10);		// ������� ������� �� ����� � Id
		
		clinic.printClinicClients();		
		
		
	
	}
}	
