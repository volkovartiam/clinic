package my_clinic;

/* 
 *  ����� CLient �������� ������ � ����� �������, id, ���� ���������
 *  � ������ �� �����������
 *  @ volkov_artiam
 *  @ 11.05.2019
 *   
 * 
 * */

public class Client {

	/*�������� id, ��� �������, ��� ��������� */
	private final int id;
	private String client;
	private String type_pets;

		
		/*����������� ��������� ����� ����������  id, ��� ������ � ��� ���������*/
	    Client (int id, String client, String type_pets){
	    	this.client = client;
	    	this.id = id;
	    	this.type_pets = type_pets;
	    }
	
	
	    /*������������� ��� �������*/
	    public String setClient (String client) {
	    	return this.client = client;
	    }
	
	
	    /* ������ ��� �������*/
	    public String getClient () {
	    	return client;
	    }
	

	    /*������ id*/ 
	    public int getId () {
	    	return id;
	    }

	
	
	    /*������������� ��� ���������*/ 
	    public String setType_pets (String type_pets) {
	    	return this.type_pets = type_pets;
	    }
	
	
	    /*������ ��� ���������*/ 
	    public String getType_pets () {
	    	return type_pets;
	    }
	
}

	
	

