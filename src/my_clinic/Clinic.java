package my_clinic;

/* 
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
	private final Client[] clients;

	
		/*� ������ ������������� �������� ������ ����������� ������ Client ����� ������� */
		public Clinic (final int size){					
			this.clients = new Client[size];
		}

		
		/*����� ��� ��������� �������������� �������� */
		public void addClient (final int position, final Client client){

			this.clients[position]=client;	
		}

		
		/*����� ������ ������ ��������� �������� ��������*/
			public void printClinicClients() {
				
				String textForClients = "������� ��������� ������ ��������"; 
				System.out.println(textForClients);
				
				for (int i = 0; i < clients.length; i++) {
					if (clients[i] == null) {
						System.out.println(clients[i]);
						
					} else {
					System.out.println(i + " " + clients[i].getClient() 
										 + " " + clients[i].getId() 
										 + " " + clients[i].getType_pets() );
					}
				}
			System.out.println();
			}


		/*��� �� �������� �� �������*/ 
		public void findPetsByClients (String clientName){
		
			String textForFindPets = "���������� � �������� �  ��������: "; 
			System.out.println(textForFindPets  +  clientName);

			for (int i = 0; i < clients.length; i++) {
				// �������� �� ���� ������ ���� ��������������
				if( ( clients[i] != null )   &&  ( clients[i].getClient()  == clientName ) ) {
	 		
					System.out.println(i + " " + clients[i].getClient() 
										 + " " + clients[i].getId() 
										 + " " + clients[i].getType_pets() ); 
				}
			}
		System.out.println();
		}
	
	 
		/*������ �� ���������*/ 
		public void findClientsbyPets (String Pets) {
		 
			String textfindClientsbyPets =  "���������� � �������� � ��������: ";
			System.out.println(textfindClientsbyPets + Pets ); 	
		
				for (int i=0; i < clients.length; i++){
					// �������� �� ���� � �������� ���� �� ������ �������� � �������
					if ( (clients[i] != null)   &&  ( clients[i].getType_pets() == Pets) ) {
						System.out.println(i + " " + clients[i].getClient() 
							             	 + " " + clients[i].getId() 
							             	 + " " + clients[i].getType_pets()); 
				}
			}
		System.out.println();
		}
	 
	 
		/*��������� ����� ������� */ 
		public void changeClientsname (String name_before, 
											int Id,  
												String name_after) {
			
			String textchangeClientsname1 = "����� ����������� ������ �������  ";
			String textchangeClientsname2 = "  �� �������  ";
			System.out.println(textchangeClientsname1 +  name_before 
													  +  textchangeClientsname2  +  name_after + "\n");
		 
			for (int i = 0; i < clients.length; i++) {
			 	
				if (  (clients[i].getClient() == name_before  ) && ( clients[i].getId() == Id )  ) {
				 clients[i].setClient(name_after);
				}
			}
		}
	 
	 
		/*����� �������� �������*/
		public void deleteClient (String name, int Id) {
		 
			String textdeleteClient1 = "�� ������ ������� ������� � � �������� " ; 
			String textdeleteClient2 = " � ID " ; 
			System.out.println(textdeleteClient1  +  name  
												  + textdeleteClient2 + Id);
	 
			boolean deleted = false;			// �� ��������� ������� �� �����
		 
				for (int i = 0; i < clients.length; i++) {
					if ( (clients[i].getClient() == name )  && ( clients[i].getId() == Id ) ) {
			
						clients[i] = null;
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