package my_clinic;


import java.util.Scanner;


/*
*    
*  @ volkov_artiam
*  @ 11.05.2019
* 
* */

public class Clinic_runner {

/*	public static int [] id = {1,0,1,1,4,4,5,5,8,9};
	static String [] name_of_clients = new String [10];
*/	
	
//	for (i=0;i<10;i++) {
//		name_of_client
//	}
	
	public static void main (String [] args) {
	
		final Clinic clinic = new Clinic (10);

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
/*
		name_of_clients[0] = clinic.client[0].getClient();			Не работает видимо потому, что класс клиент 
		System.out.println(name_of_clients[0]);						не инициализирован напрямую
*/		
		
		
		clinic.printClinicClients();				// Выводим в консоль список клиентов

		clinic.findPetsByClients ("Hover");			// Выводим информацию о клиенте с фамилией
		
		clinic.findClientsbyPets ("Bool");			// Вывод информации о клиентах с животным
		
		clinic.changeClientsname ("Over", 10,  "Ivanovsky");	// изменяем фамилию (имеется уточнение - номер ID)

		clinic.printClinicClients();
		
		
		clinic.deleteClient ("Ivanovsky", 9);		// пытаемся удалить клиента с неверным ID
		
		clinic.deleteClient ("Ivanovsky", 10);		// удаляем клиента по имени и Id
		
		clinic.printClinicClients();		
		
		

	
	/* 1  Как сделать так, чтобы id не мог повторяться ? Второстепенно
	 * 2  Создать класс клиника, где будет задано количество клиентов ? к размышлению
	 * 3 Поиск клиента по питомцу и наоборот ? Вывод всей доступной информации
	 * 4 Редактировать имя клиента
	 * 5 Удалять клиента
	 * 19-01 на видео 
	 * 
	 * Можно добавить метод изменения имени животного
	 * Удаления только фамилии клиентаб имени животного 
	 * 
	 * 
	 * При работе с программами требуется определять её функции (использовать блокнот, доску и тп) и как 
	 * их протестировать
	 *  и последовательно их реализовать (с последующем тестированиес)
	 *  
	 *  public - 
	 *  protected - 
	 *  default -
	 *  private -
	 *  
	 *  Инкапсуляция - это 
	 *  Наследование - это
	 *  Композиция - это
	 *  Полиморфизм - 
	 *  интерфейс - 
	 *  @override - указывает есть ли метод который будет перегружен
	 *  
	 *  
	 *  1
	 *  
	 *  
	 * */
	
	
	}
}	
