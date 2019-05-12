package my_clinic;

/* 
 *  Класс CLient содержит данные о имени клиента, id, типе животного
 *  и методы их определения
 *  @ volkov_artiam
 *  @ 11.05.2019
 *   
 * 
 * */

public class Client {

	/*Задаются id, имя клиента, тип животного */
	private final int id;
	private String client;
	private String type_pets;

		
		/*Конструктор позволяет сразу установить  id, имя клиета и тип животного*/
	    Client (int id, String client, String type_pets){
	    	this.client = client;
	    	this.id = id;
	    	this.type_pets = type_pets;
	    }
	
	
	    /*Устанавливает имя клиента*/
	    public String setClient (String client) {
	    	return this.client = client;
	    }
	
	
	    /* Выдает имя клиента*/
	    public String getClient () {
	    	return client;
	    }
	

	    /*Выдает id*/ 
	    public int getId () {
	    	return id;
	    }

	
	
	    /*Устанавливает тип животного*/ 
	    public String setType_pets (String type_pets) {
	    	return this.type_pets = type_pets;
	    }
	
	
	    /*Выдает тип животного*/ 
	    public String getType_pets () {
	    	return type_pets;
	    }
	
}

	
	

