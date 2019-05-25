package my_clinic;

import java.util.List;
import java.util.ArrayList;

/** 
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
		public List <Client> clientsList = new ArrayList <Client>();
		
		
		//////////////////////////////////////////////////////////////////
		/**/
		public List addClients (List <Client> clientsList) {
				return this.clientsList = clientsList;
		}

		//////////////////////////////////////////////////////////////////	
		/*метод выводит список имеющихся клиентов клиентов*/
		public void printClients() {
				
				String textForClients = "Выводим имеющийся список клиентов"; 
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
		/**найти клиента*/ 
		public void findClients (String clientName){
		
			String textForFindPets = "Информация о клиентах с  фамилией: "; 
			System.out.println(textForFindPets  +  clientName);

			for (Client x : clientsList ) {
				// Проверка на ноль должна быть первостепенной
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
		/**найти животное*/ 
		public void findPets (String Pets ) {
		 
			String textfindClientsbyPets =  "Информация о клиентах с животным: ";
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
				
				String textchangeClientsname1 = "Будет произведена замена фамилии  ";
				String textchangeClientsname2 = "  на фамилию  ";
				
				System.out.println(textchangeClientsname1 +  name_before 
														  +  textchangeClientsname2  +  name_after + "\n");
			 
				for (Client x : clientsList){
				 	
					if (  (x.getName() == name_before  ) && ( x.getId() == Id )  ) {
						// сообщении о несоответствиях для каждого метода + указание ид
						x.setName(name_after);
					}
				}
			}
		 
		//////////////////////////////////////////////////////////////////			

		
		//////////////////////////////////////////////////////////////////		
		/**метод удаления клиента*/
		public void deleteClient (String name, String Id ) {
	 
			String textdeleteClient1 = "Вы хотите удалить клиента с с фамилией " ; 
			String textdeleteClient2 = " и ID " ; 
			System.out.println(textdeleteClient1  +  name  
											  	  + textdeleteClient2 + Id);
 
			boolean deleted = false;			// по умолчанию удалять не нужно
			int index_to_remove = -1;
		
				for (Client x : clientsList){
			
					if ( (x.getName() == name )  && ( x.getId() == Id ) ) {
					index_to_remove = clientsList.indexOf(x);
					deleted = true;
					}
			}

			if (deleted){
				clientsList.remove(index_to_remove);
				System.out.println("Данные о клиенте успешно удалены  \n");
			
			} else {  
				System.out.println(" ID или имя клиента введены не правильно \n") ;
			} 
	 
	}		
		
		//////////////////////////////////////////////////////////////////		


}
