package my_clinic;


import java.util.Scanner;


/*  В программе создается n-ое количество экземпляров класса климент 
 *  и реализуются методы из класса клиник
 *  
 *  
 *		    
 *  @ volkov_artiam
 *  @ 11.05.2019
 *   version 1.4
 * */

public class Clinic_runner {

	static int size = 10 ; 	/*задается количество клиентов для фирмы*/

	
	public static void main (String [] args) {
	
		
		final Clinic clinic = new Clinic (size);
		

		clinic.addClient(0, new Client (1,"Ivanov","Dog"));	
		clinic.addClient(1, new Client (2,"Nov","Cat"));	
		clinic.addClient(2, new Client (3,"Hov","Dragon"));	
		
		clinic.addClient(3, new Client (4,"Тгuvanov","Bird"));	
		clinic.addClient(4, new Client (5,"Iov","Bool"));	
		clinic.addClient(5, new Client (6,"Hover","Bool"));	
		
		clinic.addClient(6, new Client (7,"Ponov","Puppy"));	
		clinic.addClient(7, new Client (8,"Cov","Dog"));	
		clinic.addClient(8, new Client (9,"Hover","Cat"));	
	
		clinic.addClient(9, new Client (10,"Over","Cat"));	
	
		
		clinic.printClinicClients();				// Выводим в консоль список клиентов

		clinic.findPetsByClients ("Hover");			// Выводим информацию о клиенте с фамилией
		
		clinic.findClientsbyPets ("Bool");			// Вывод информации о клиентах с животным
		
		clinic.changeClientsname ("Over", 10,  "Ivanovsky");	// изменяем фамилию (имеется уточнение - номер ID)

		clinic.printClinicClients();
		
		
		clinic.deleteClient ("Ivanovsky", 9);		// пытаемся удалить клиента с неверным ID
		
		clinic.deleteClient ("Ivanovsky", 10);		// удаляем клиента по имени и Id
		
		clinic.printClinicClients();		
		
		
	
	}
}	
