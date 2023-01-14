package com.upskill.java_4;

public class Encapsulation {
	
	private String name = "upskill";
	private int ssn = 123455;
	private String username = "ummey";
	
	//Setter method - name   //set the data
	
	public void setName(String value){
		name = value;
		
	}
			
//Getter Method - name
	public String getname(){
		return name;
	}
	
	public void setSSN(int value){
		ssn = value;
	}
	
	public String getUserName(){
		return username;
	}
	
	public static void main(String[]args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setName("upskill2");
		System.out.println(obj.getname());
		
		obj.setSSN(12345667);
		System.out.println(obj.getUserName());
		
	}
}
 