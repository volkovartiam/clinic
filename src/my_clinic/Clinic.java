package my_clinic;

/* 
 *  Класс CLinic содержит методы
 *  установки количества клиентов
 *  добавления клиентов
 *  вывод списка имеющихся клиентов
 *  поиска клиента по животному
 *  поиска животных по клиентам
 *  изменения имени клиента
 *  удаление клиента
 
 *  
 *  @ volkov_artiam
 *  @ 11.05.2019
 * 
 * */


public class Clinic {

	/*Для работы класса нужны экземпляры класса Client*/	
	private final Client[] clients;

	
		/*в данном конструктроре задается колько экземпляров класса Client будет создано */
		public Clinic (final int size){					
			this.clients = new Client[size];
		}

		
		/*метод для установки первоначальных значений */
		public void addClient (final int position, final Client client){

			this.clients[position]=client;	
		}

		
		/*метод выводи список имеющихся клиентов клиентов*/
			public void printClinicClients() {
				
				String textForClients = "Выводим имеющийся список клиентов"; 
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


		/*что за животное по клиенту*/ 
		public void findPetsByClients (String clientName){
		
			String textForFindPets = "Информация о клиентах с  фамилией: "; 
			System.out.println(textForFindPets  +  clientName);

			for (int i = 0; i < clients.length; i++) {
				// Проверка на ноль должна быть первостепенной
				if( ( clients[i] != null )   &&  ( clients[i].getClient()  == clientName ) ) {
	 		
					System.out.println(i + " " + clients[i].getClient() 
										 + " " + clients[i].getId() 
										 + " " + clients[i].getType_pets() ); 
				}
			}
		System.out.println();
		}
	
	 
		/*клиент по животному*/ 
		public void findClientsbyPets (String Pets) {
		 
			String textfindClientsbyPets =  "Информация о клиентах с животным: ";
			System.out.println(textfindClientsbyPets + Pets ); 	
		
				for (int i=0; i < clients.length; i++){
					// Проверка на ноль и проверка есть ли данное животное в списках
					if ( (clients[i] != null)   &&  ( clients[i].getType_pets() == Pets) ) {
						System.out.println(i + " " + clients[i].getClient() 
							             	 + " " + clients[i].getId() 
							             	 + " " + clients[i].getType_pets()); 
				}
			}
		System.out.println();
		}
	 
	 
		/*изменение имени клиента */ 
		public void changeClientsname (String name_before, 
											int Id,  
												String name_after) {
			
			String textchangeClientsname1 = "Будет произведена замена фамилии  ";
			String textchangeClientsname2 = "  на фамилию  ";
			System.out.println(textchangeClientsname1 +  name_before 
													  +  textchangeClientsname2  +  name_after + "\n");
		 
			for (int i = 0; i < clients.length; i++) {
			 	
				if (  (clients[i].getClient() == name_before  ) && ( clients[i].getId() == Id )  ) {
				 clients[i].setClient(name_after);
				}
			}
		}
	 
	 
		/*метод удаления клиента*/
		public void deleteClient (String name, int Id) {
		 
			String textdeleteClient1 = "Вы хотите удалить клиента с с фамилией " ; 
			String textdeleteClient2 = " и ID " ; 
			System.out.println(textdeleteClient1  +  name  
												  + textdeleteClient2 + Id);
	 
			boolean deleted = false;			// по умолчанию удалять не нужно
		 
				for (int i = 0; i < clients.length; i++) {
					if ( (clients[i].getClient() == name )  && ( clients[i].getId() == Id ) ) {
			
						clients[i] = null;
						deleted = true;
					}
				}
	
				if (deleted){
					System.out.println("Данные о клиенте успешно удалены  \n");
				} else {  
					System.out.println(" ID или имя клиента введены не правильно \n") ;
				} 
		 
		}
		
		
}