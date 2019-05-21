package my_clinic;

import java.util.List;
import java.util.ArrayList;

/** 
 *  ����� CLinic �������� ������
 *  ��������� ���������� ��������
 *  ���������� ��������
 *  ����� ������ ��������� ��������
 *  ������ ������� �� ���������
 *  ������ �������� �� ��������
 *  ��������� ����� �������
 *  �������� �������
 
 *  
 *  @ volkov_artiam
 *  @ 11.05.2019
 * 
 * */


public class Clinic {

	/*��� ������ ������ ����� ���������� ������ Client*/	
	public List <Client> clientsList = new ArrayList <Client>();

	

	
		/*����� ������ ������ ��������� �������� ��������*/
		public void printClinicClients(List <Client> clientsList) {
				
				String textForClients = "������� ��������� ������ ��������"; 
				System.out.println(textForClients);
				
				for (int i = 0; i < clientsList.size(); i++) {
					if (clientsList.get(i) == null) {
						System.out.println(clientsList.get(i));
						
					} else {
					System.out.println(    " " + clientsList.get(i).getId() 
										 + " " + clientsList.get(i).getClient() 
										 + " " + clientsList.get(i).getPets() );
					}
				}
			System.out.println();
		}

		
		
		/**��� �� �������� �� �������*/ 
		public void findPetsByClients (String clientName, List <Client> clientsList){
		
			String textForFindPets = "���������� � �������� �  ��������: "; 
			System.out.println(textForFindPets  +  clientName);

			for (int i = 0; i < clientsList.size(); i++) {
				// �������� �� ���� ������ ���� ��������������
				if( ( clientsList.get(i) != null )   &&  ( clientsList.get(i).getClient()  == clientName ) ) {
	 		
					System.out.println(       " " + clientsList.get(i).getId() 
											+ " " + clientsList.get(i).getClient() 
											+ " " + clientsList.get(i).getPets() );
				}
			}
		System.out.println();
		}
	
	 
		
		/**������ �� ���������*/ 
		public void findClientsbyPets (String Pets , List <Client> clientsList) {
		 
			String textfindClientsbyPets =  "���������� � �������� � ��������: ";
			System.out.println(textfindClientsbyPets + Pets ); 	
		
				for (int i=0; i < clientsList.size(); i++){
					// �������� �� ���� � �������� ���� �� ������ �������� � �������
					if ( (clientsList.get(i) != null)   &&  ( clientsList.get(i).getPets() == Pets) ) {
						System.out.println(    	  " " + clientsList.get(i).getId() 
												+ " " + clientsList.get(i).getClient() 
												+ " " + clientsList.get(i).getPets() );
				}
			}
		System.out.println();
		}
	 
	 
		/**��������� ����� ������� */ 
		public void changeClientsname (String name_before, 
											String Id,  
												String name_after,
													List <Client> clientsList) {
			
			String textchangeClientsname1 = "����� ����������� ������ �������  ";
			String textchangeClientsname2 = "  �� �������  ";
			
			System.out.println(textchangeClientsname1 +  name_before 
													  +  textchangeClientsname2  +  name_after + "\n");
		 
			for (int i = 0; i < clientsList.size(); i++) {
			 	
				if (  (clientsList.get(i).getClient() == name_before  ) && ( clientsList.get(i).getId() == Id )  ) {
					// ��������� � ��������������� ��� ������� ������ + �������� ��
					clientsList.get(i).setClient(name_after);
				}
			}
		}
	 
	 
			/**����� �������� �������*/
		public void deleteClient (String name, String Id, List <Client> clientsList ) {
		 
			String textdeleteClient1 = "�� ������ ������� ������� � � �������� " ; 
			String textdeleteClient2 = " � ID " ; 
			System.out.println(textdeleteClient1  +  name  
												  + textdeleteClient2 + Id);
	 
			boolean deleted = false;			// �� ��������� ������� �� �����
		 
				for (int i = 0; i < clientsList.size(); i++) {
					if ( (clientsList.get(i).getClient() == name )  && ( clientsList.get(i).getId() == Id ) ) {
			
						clientsList.remove(i);
						deleted = true;
					}
				}
	
				if (deleted){
					System.out.println("������ � ������� ������� �������  \n");
				} else {  
					System.out.println(" ID ��� ��� ������� ������� �� ��������� \n") ;
				} 
		 
		}
		
}
