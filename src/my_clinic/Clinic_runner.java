package my_clinic;


import java.util.Scanner;


/*
*    
*  @ volkov_artiam
*  @ 11.05.2019
* 
* */

public class Clinic_runner {

/*	public static int [] id = {1,0,1,1,4,4,5,5,8,9};
	static String [] name_of_clients = new String [10];
*/	
	
//	for (i=0;i<10;i++) {
//		name_of_client
//	}
	
	public static void main (String [] args) {
	
		final Clinic clinic = new Clinic (10);

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
/*
		name_of_clients[0] = clinic.client[0].getClient();			�� �������� ������ ������, ��� ����� ������ 
		System.out.println(name_of_clients[0]);						�� ��������������� ��������
*/		
		
		
		clinic.printClinicClients();				// ������� � ������� ������ ��������

		clinic.findPetsByClients ("Hover");			// ������� ���������� � ������� � ��������
		
		clinic.findClientsbyPets ("Bool");			// ����� ���������� � �������� � ��������
		
		clinic.changeClientsname ("Over", 10,  "Ivanovsky");	// �������� ������� (������� ��������� - ����� ID)

		clinic.printClinicClients();
		
		
		clinic.deleteClient ("Ivanovsky", 9);		// �������� ������� ������� � �������� ID
		
		clinic.deleteClient ("Ivanovsky", 10);		// ������� ������� �� ����� � Id
		
		clinic.printClinicClients();		
		
		

	
	/* 1  ��� ������� ���, ����� id �� ��� ����������� ? �������������
	 * 2  ������� ����� �������, ��� ����� ������ ���������� �������� ? � �����������
	 * 3 ����� ������� �� ������� � �������� ? ����� ���� ��������� ����������
	 * 4 ������������� ��� �������
	 * 5 ������� �������
	 * 19-01 �� ����� 
	 * 
	 * ����� �������� ����� ��������� ����� ���������
	 * �������� ������ ������� �������� ����� ��������� 
	 * 
	 * 
	 * ��� ������ � ����������� ��������� ���������� � ������� (������������ �������, ����� � ��) � ��� 
	 * �� ��������������
	 *  � ��������������� �� ����������� (� ����������� �������������)
	 *  
	 *  public - 
	 *  protected - 
	 *  default -
	 *  private -
	 *  
	 *  ������������ - ��� 
	 *  ������������ - ���
	 *  ���������� - ���
	 *  ����������� - 
	 *  ��������� - 
	 *  @override - ��������� ���� �� ����� ������� ����� ����������
	 *  
	 *  
	 *  1
	 *  
	 *  
	 * */
	
	
	}
}	
