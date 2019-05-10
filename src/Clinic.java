public class Clinic {

	private final Client[] clients;


	public Clinic (final int size){					// конструктор задает сколько экземпл€ров класса Client будет задано
		this.clients = new Client[size];
	
	}

	// метод дл€ установки первоначальных значений 
	public void addClient (final int position, final Client client){
		
		this.clients[position]=client;	
	}

	// выводит список клиентов
	public void printClinicClients() {
		System.out.println("¬ыводим имеющийс€ список клиентов");
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				System.out.println(clients[i]);
			} else {
				System.out.println(i + " " + clients[i].getClient() + " " + clients[i].getId() + " " + clients[i].getType_pets());
			}
		}
		System.out.println();
	}



	// что за животное по клиенту
	 public void findPetsByClients (String s){
	 	System.out.print("»нформаци€ о клиентах с  фамилией: ");
	 	System.out.println(s);

	 	for (int i = 0; i < clients.length; i++) {
	 		// ѕроверка на ноль должна быть первостепенной
	 		if(  clients[i] != null  &&  clients[i].getClient()  == s  ) {
	 		
	 		System.out.println(i + " " + clients[i].getClient() + " " + clients[i].getId() + " " + clients[i].getType_pets()); 
	 		}
	 	}
		System.out.println();
	}
	
	 
	 // клиент по животному
	 public void findClientsbyPets (String s) {
		System.out.print("»нформаци€ о клиентах с животным: ");
		System.out.println(s); 	
			for (int i=0; i < clients.length; i++){
				// ѕроверка на ноль и проверка есть ли данное животное в списках
				if (clients[i] != null && clients[i].getType_pets() == s ) {
					System.out.println(i + " " + clients[i].getClient() + " " + clients[i].getId() + " " + clients[i].getType_pets()); 
				}
			}
		System.out.println();

	 }
	 
	 
	 // изменение имени клиента 
	 public void changeClientsname (String name_before, int Id,  String name_after) {
		 System.out.print("Ѕудет произведена замена фамилии  "); 
		 System.out.print(name_before);
		 System.out.print("  на фамилию  ");
		 System.out.println(name_after);
		 
		 for (int i = 0; i < clients.length; i++) {
			 	
			 if (clients[i].getClient() == name_before   &&  clients[i].getId() == Id ) {
			
				 clients[i].setClient(name_after);
			 }
		 }
	 }
	 
	 
	 // метод удалени€ клиента
	 public void deleteClient (String name, int Id) {
		 
		 System.out.print("¬ы хотите удалить клиента с с фамилией "); 
		 System.out.print(name);
		 System.out.print(" и ID ");
		 System.out.println(Id);		 

		 boolean deleted = false;			// по умолчанию удал€ть не нужно
		 
		 for (int i = 0; i < clients.length; i++) {
			 if (clients[i].getClient() == name   &&  clients[i].getId() == Id ) {
			
				 clients[i] = null;
 		 		 deleted = true;
			}
		 
		 }
		 
		 // 
		 if (deleted){
		 	System.out.println("ƒанные о клиенте успешно удалены удалено\n");
		 }
		  
		 else {  
			 System.out.println(" ID или им€ клиента введены не правильно \n") ;
		 } 
		 
	 }
}