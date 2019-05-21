package my_clinic;


import java.util.List;
import java.util.ArrayList;

/** 
 *  ����� CLient �������� ������ � ����� �������, id, ���� ���������
 *  � ������ �� �����������
 *  @ volkov_artiam
 *  @ 11.05.2019
 *   
 * 
 * */

public class Client {

	/**�������� id, ��� �������, ��� ��������� */
	private String id;
	public String  client;
	public String pets;

	
	
   	
		/**����������� ��������� ����� ����������  id, ��� ������ � ��� ���������*/
	    Client (String id, String client, String pets){
	    	this.client = client;
	    	
	    	this.id = id;
	    	
	    	this.pets = pets;
	    }
	
	    
	    
	    /**������������� ��� �������*/
	    public String setClient (String client) {
	    	return this.client = client;
	    }
	
	
	    /** ������ ��� �������*/
	    public String getClient () {
	    	return client;
	    }
	

	    /**������ id*/ 
	    public String getId () {
	    	return id;
	    }

	
	
	    /**������������� ��� ���������*/ 
	    public String setPets (String pets) {
	    	return this.pets = pets;
	    }
	
	
	    /**������ ��� ���������*/ 
	    public String getPets () {
	    	return pets;
	    }
	    
}
