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
		
		
		//////////////////////////////////////////////////////////////////
		/**/
		public List addClients (List <Client> clientsList) {
				return this.clientsList = clientsList;
		}

		//////////////////////////////////////////////////////////////////	
		/*����� ������� ������ ��������� �������� ��������*/
		public void printClients() {
				
				String textForClients = "������� ��������� ������ ��������"; 
				System.out.println(textForClients);
				
				for (Client x : clientsList) {
					
					System.out.println(    " " + x.getId() 
									     + " " + x.getName() 
										 + " " + x.getPets() );
				}
						
				System.out.println();
		}
		//////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////
		/**����� �������*/ 
		public void findClients (String clientName){
		
			String textForFindPets = "���������� � �������� �  ��������: "; 
			System.out.println(textForFindPets  +  clientName);

			for (Client x : clientsList ) {
				// �������� �� ���� ������ ���� ��������������
				if(  x.getName()  == clientName  ) {
	 		
					System.out.println(       " " + x.getId() 
											+ " " + x.getName() 
											+ " " + x.getPets()   );
				}
			}
		System.out.println();
		}
	
		//////////////////////////////////////////////////////////////////

		
		//////////////////////////////////////////////////////////////////
		/**����� ��������*/ 
		public void findPets (String Pets ) {
		 
			String textfindClientsbyPets =  "���������� � �������� � ��������: ";
			System.out.println(textfindClientsbyPets + Pets ); 	
		
				for (Client x : clientsList){

					if (   x.getPets() == Pets)  {
						System.out.println(    	  " " + x.getId() 
												+ " " + x.getName() 
												+ " " + x.getPets() );
				}
			}
		System.out.println();
		}
		
		//////////////////////////////////////////////////////////////////
		
		
		
		//////////////////////////////////////////////////////////////////		
		public void changeName (String name_before, 
												String Id,  
													String name_after) {
				
				String textchangeClientsname1 = "����� ����������� ������ �������  ";
				String textchangeClientsname2 = "  �� �������  ";
				
				System.out.println(textchangeClientsname1 +  name_before 
														  +  textchangeClientsname2  +  name_after + "\n");
			 
				for (Client x : clientsList){
				 	
					if (  (x.getName() == name_before  ) && ( x.getId() == Id )  ) {
						// ��������� � ��������������� ��� ������� ������ + �������� ��
						x.setName(name_after);
					}
				}
			}
		 
		//////////////////////////////////////////////////////////////////			

		
		//////////////////////////////////////////////////////////////////		
		/**����� �������� �������*/
		public void deleteClient (String name, String Id ) {
	 
			String textdeleteClient1 = "�� ������ ������� ������� � � �������� " ; 
			String textdeleteClient2 = " � ID " ; 
			System.out.println(textdeleteClient1  +  name  
											  	  + textdeleteClient2 + Id);
 
			boolean deleted = false;			// �� ��������� ������� �� �����
			int index_to_remove = -1;
		
				for (Client x : clientsList){
			
					if ( (x.getName() == name )  && ( x.getId() == Id ) ) {
					index_to_remove = clientsList.indexOf(x);
					deleted = true;
					}
			}

			if (deleted){
				clientsList.remove(index_to_remove);
				System.out.println("������ � ������� ������� �������  \n");
			
			} else {  
				System.out.println(" ID ��� ��� ������� ������� �� ��������� \n") ;
			} 
	 
	}		
		
		//////////////////////////////////////////////////////////////////		


}
