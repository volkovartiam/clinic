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
	public String  name;
	public String pets;


	
	
	
	
   	
		/**����������� ��������� ����� ����������  id, ��� ������ � ��� ���������*/
	    Client (String id, String name, String pets){
	    	this.name = name;
	    	
	    	this.id = id;
	    	
	    	this.pets = pets;
	    }
	
	    
	    
	    /**������������� ��� �������*/
	    public String setName (String name) {
	    	return this.name = name;
	    }
	
	
	    /** ������ ��� �������*/
	    public String getName () {
	    	return name;
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
	    
	    
		/*����� ������ ������ ��������� �������� ��������*/
		public void printClinicClients() {
				
					System.out.println(    " " + getId() 
										 + " " + getName() 
										 + " " + getPets() );
					
		//	System.out.println();
		}
	    
	    
	    
	    
	    
	    
}
