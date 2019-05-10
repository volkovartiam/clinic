import java.util.Scanner;


public class Client {

	
	private final int id;
	private String client;
	private String type_pets;

		
	// Конструктор позволяет сразу установить  id, имя клиета и тип животного
	Client (int id, String client, String type_pets){
		this.client = client;
		this.id = id;
		this.type_pets = type_pets;
	}
	
	
	// Устанавливает имя клиента
	public String setClient (String client) {
		return this.client = client;
	}
	
	
	// Выдает имя клиента
	public String getClient () {
		return client;
	}
	

	// Выдает ID
	public int getId () {
		return id;
	}

	
	
	// Устанавливает тип животного
	public String setType_pets (String type_pets) {
		return this.type_pets = type_pets;
	}
	
	
	// Выдает тип животного
	public String getType_pets () {
		return type_pets;
	}
	
	
	
}

	
	

