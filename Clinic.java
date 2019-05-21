package my_clinic;

import java.util.List;
import java.util.ArrayList;

/** 
 *   ласс CLinic содержит методы
 *  установки количества клиентов
 *  добавлени€ клиентов
 *  вывод списка имеющихс€ клиентов
 *  поиска клиента по животному
 *  поиска животных по клиентам
 *  изменени€ имени клиента
 *  удаление клиента
 
 *  
 *  @ volkov_artiam
 *  @ 11.05.2019
 * 
 * */


public class Clinic {

	/*ƒл€ работы класса нужны экземпл€ры класса Client*/	
	public List <Client> clientsList = new ArrayList <Client>();

	

	
		/*метод выводи список имеющихс€ клиентов клиентов*/
		public void printClinicClients(List <Client> clientsList) {
				
				String textForClients = "¬ыводим имеющийс€ список клиентов"; 
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

		
		
		/**что за животное по клиенту*/ 
		public void findPetsByClients (String clientName, List <Client> clientsList){
		
			String textForFindPets = "»нформаци€ о клиентах с  фамилией: "; 
			System.out.println(textForFindPets  +  clientName);

			for (int i = 0; i < clientsList.size(); i++) {
				// ѕроверка на ноль должна быть первостепенной
				if( ( clientsList.get(i) != null )   &&  ( clientsList.get(i).getClient()  == clientName ) ) {
	 		
					System.out.println(       " " + clientsList.get(i).getId() 
											+ " " + clientsList.get(i).getClient() 
											+ " " + clientsList.get(i).getPets() );
				}
			}
		System.out.println();
		}
	
	 
		
		/**клиент по животному*/ 
		public void findClientsbyPets (String Pets , List <Client> clientsList) {
		 
			String textfindClientsbyPets =  "»нформаци€ о клиентах с животным: ";
			System.out.println(textfindClientsbyPets + Pets ); 	
		
				for (int i=0; i < clientsList.size(); i++){
					// ѕроверка на ноль и проверка есть ли данное животное в списках
					if ( (clientsList.get(i) != null)   &&  ( clientsList.get(i).getPets() == Pets) ) {
						System.out.println(    	  " " + clientsList.get(i).getId() 
												+ " " + clientsList.get(i).getClient() 
												+ " " + clientsList.get(i).getPets() );
				}
			}
		System.out.println();
		}
	 
	 
		/**изменение имени клиента */ 
		public void changeClientsname (String name_before, 
											String Id,  
												String name_after,
													List <Client> clientsList) {
			
			String textchangeClientsname1 = "Ѕудет произведена замена фамилии  ";
			String textchangeClientsname2 = "  на фамилию  ";
			
			System.out.println(textchangeClientsname1 +  name_before 
													  +  textchangeClientsname2  +  name_after + "\n");
		 
			for (int i = 0; i < clientsList.size(); i++) {
			 	
				if (  (clientsList.get(i).getClient() == name_before  ) && ( clientsList.get(i).getId() == Id )  ) {
					// сообщении о несоответстви€х дл€ каждого метода + указание ид
					clientsList.get(i).setClient(name_after);
				}
			}
		}
	 
	 
			/**метод удалени€ клиента*/
		public void deleteClient (String name, String Id, List <Client> clientsList ) {
		 
			String textdeleteClient1 = "¬ы хотите удалить клиента с с фамилией " ; 
			String textdeleteClient2 = " и ID " ; 
			System.out.println(textdeleteClient1  +  name  
												  + textdeleteClient2 + Id);
	 
			boolean deleted = false;			// по умолчанию удал€ть не нужно
		 
				for (int i = 0; i < clientsList.size(); i++) {
					if ( (clientsList.get(i).getClient() == name )  && ( clientsList.get(i).getId() == Id ) ) {
			
						clientsList.remove(i);
						deleted = true;
					}
				}
	
				if (deleted){
					System.out.println("ƒанные о клиенте успешно удалены  \n");
				} else {  
					System.out.println(" ID или им€ клиента введены не правильно \n") ;
				} 
		 
		}
		
}
