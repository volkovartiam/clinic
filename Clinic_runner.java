package my_clinic;



import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


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
	
		 List <Client> client = new ArrayList <Client>();
		 Clinic clinic = new Clinic ();
		

		client.add(new Client ("0","Ivanov","Dog"));	
		client.add(new Client ("1","Nov","Cat"));	
		client.add(new Client ("2","Hov","Dragon"));	
	
		client.add(new Client ("3","Тгuvanov","Bird"));	
		client.add(new Client ("4","Iov","Bool"));	
		client.add(new Client ("5","Hover","Bool"));	
		
		client.add(new Client ("6","Ponov","Puppy"));	
		client.add(new Client ("7","Cov","Dog"));	
		client.add(new Client ("8","Hover","Cat"));	

		client.add(new Client ("9","Over","Cat"));	
	

		
		clinic.printClinicClients(client);

		
		clinic.findPetsByClients ("Hover", client);			// Выводим информацию о клиенте с фамилией


		clinic.findClientsbyPets ("Cat" , client);			// Вывод информации о клиентах с животным
		
		
		
		clinic.changeClientsname ("Over", "9",  "Ivanovsky" , client);	// изменяем фамилию (имеется уточнение - номер ID)
		clinic.printClinicClients(client);	

		
		clinic.deleteClient ("Ivanovsky", "10", client);		// пытаемся удалить клиента с неверным ID
		
		clinic.deleteClient ("Ivanovsky", "9", client);			// удаляем клиента по имени и Id
		
		clinic.printClinicClients(client);	
		
	
	}
}	
