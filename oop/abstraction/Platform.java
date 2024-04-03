package oop.abstraction;

/*
 * Abstract Class: 
 * 	Field
 * 	Methods:
 * 		Simple Methods
 * 		Abstract Methods - Can only be created inside an abstract class
 */


public class Platform extends Linkedin{
	
	//private String name;

	public Platform(String name) {
		super(name);	//should be the first line in a constructor
		System.out.println("Social Media Platforms");
		//this.name = name;
	}

	//Non Abstract Method
	public String getPlatformName() {
		String name = getName();
		return name;
	}
	
	@Override
	public void getLinkedinDetails(){
		System.out.println("getLinkedinDetails()");
	}

}
