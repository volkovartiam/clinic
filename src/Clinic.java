public class Clinic {

	private final Client[] clients;


	public Clinic (final int size){					// ����������� ������ ������� ����������� ������ Client ����� ������
		this.clients = new Client[size];
	
	}

	// ����� ��� ��������� �������������� �������� 
	public void addClient (final int position, final Client client){
		
		this.clients[position]=client;	
	}

	// ������� ������ ��������
	public void printClinicClients() {
		System.out.println("������� ��������� ������ ��������");
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				System.out.println(clients[i]);
			} else {
				System.out.println(i + " " + clients[i].getClient() + " " + clients[i].getId() + " " + clients[i].getType_pets());
			}
		}
		System.out.println();
	}



	// ��� �� �������� �� �������
	 public void findPetsByClients (String s){
	 	System.out.print("���������� � �������� �  ��������: ");
	 	System.out.println(s);

	 	for (int i = 0; i < clients.length; i++) {
	 		// �������� �� ���� ������ ���� ��������������
	 		if(  clients[i] != null  &&  clients[i].getClient()  == s  ) {
	 		
	 		System.out.println(i + " " + clients[i].getClient() + " " + clients[i].getId() + " " + clients[i].getType_pets()); 
	 		}
	 	}
		System.out.println();
	}
	
	 
	 // ������ �� ���������
	 public void findClientsbyPets (String s) {
		System.out.print("���������� � �������� � ��������: ");
		System.out.println(s); 	
			for (int i=0; i < clients.length; i++){
				// �������� �� ���� � �������� ���� �� ������ �������� � �������
				if (clients[i] != null && clients[i].getType_pets() == s ) {
					System.out.println(i + " " + clients[i].getClient() + " " + clients[i].getId() + " " + clients[i].getType_pets()); 
				}
			}
		System.out.println();

	 }
	 
	 
	 // ��������� ����� ������� 
	 public void changeClientsname (String name_before, int Id,  String name_after) {
		 System.out.print("����� ����������� ������ �������  "); 
		 System.out.print(name_before);
		 System.out.print("  �� �������  ");
		 System.out.println(name_after);
		 
		 for (int i = 0; i < clients.length; i++) {
			 	
			 if (clients[i].getClient() == name_before   &&  clients[i].getId() == Id ) {
			
				 clients[i].setClient(name_after);
			 }
		 }
	 }
	 
	 
	 // ����� �������� �������
	 public void deleteClient (String name, int Id) {
		 
		 System.out.print("�� ������ ������� ������� � � �������� "); 
		 System.out.print(name);
		 System.out.print(" � ID ");
		 System.out.println(Id);		 

		 boolean deleted = false;			// �� ��������� ������� �� �����
		 
		 for (int i = 0; i < clients.length; i++) {
			 if (clients[i].getClient() == name   &&  clients[i].getId() == Id ) {
			
				 clients[i] = null;
 		 		 deleted = true;
			}
		 
		 }
		 
		 // 
		 if (deleted){
		 	System.out.println("������ � ������� ������� ������� �������\n");
		 }
		  
		 else {  
			 System.out.println(" ID ��� ��� ������� ������� �� ��������� \n") ;
		 } 
		 
	 }
}