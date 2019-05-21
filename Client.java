package my_clinic;


import java.util.List;
import java.util.ArrayList;

/** 
 *  Класс CLient содержит данные о имени клиента, id, типе животного
 *  и методы их определения
 *  @ volkov_artiam
 *  @ 11.05.2019
 *   
 * 
 * */

public class Client {

	/**Задаются id, имя клиента, тип животного */
	private String id;
	public String  client;
	public String pets;

	
	
   	
		/**Конструктор позволяет сразу установить  id, имя клиета и тип животного*/
	    Client (String id, String client, String pets){
	    	this.client = client;
	    	
	    	this.id = id;
	    	
	    	this.pets = pets;
	    }
	
	    
	    
	    /**Устанавливает имя клиента*/
	    public String setClient (String client) {
	    	return this.client = client;
	    }
	
	
	    /** Выдает имя клиента*/
	    public String getClient () {
	    	return client;
	    }
	

	    /**Выдает id*/ 
	    public String getId () {
	    	return id;
	    }

	
	
	    /**Устанавливает тип животного*/ 
	    public String setPets (String pets) {
	    	return this.pets = pets;
	    }
	
	
	    /**Выдает тип животного*/ 
	    public String getPets () {
	    	return pets;
	    }
	    
}
