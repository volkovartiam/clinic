import java.util.Scanner;


public class Client {

	
	private final int id;
	private String client;
	private String type_pets;

		
	// ����������� ��������� ����� ����������  id, ��� ������ � ��� ���������
	Client (int id, String client, String type_pets){
		this.client = client;
		this.id = id;
		this.type_pets = type_pets;
	}
	
	
	// ������������� ��� �������
	public String setClient (String client) {
		return this.client = client;
	}
	
	
	// ������ ��� �������
	public String getClient () {
		return client;
	}
	

	// ������ ID
	public int getId () {
		return id;
	}

	
	
	// ������������� ��� ���������
	public String setType_pets (String type_pets) {
		return this.type_pets = type_pets;
	}
	
	
	// ������ ��� ���������
	public String getType_pets () {
		return type_pets;
	}
	
	
	
}

	
	

