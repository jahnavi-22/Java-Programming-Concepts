package oop.abstraction.advanced;

//import oop.abstraction.Linkedin;

/*
 * Abstract Class: 
 * 	Field
 * 	Methods:
 * 		Simple Methods
 * 		Abstract Methods - Can only be created inside an abstract class
 */


public class Platform extends AbstractPlatforms{
	
	public Platform(String name) {
		super(name);
		//System.out.println("Social Media Platforms");
	}	
	
	
	public String getPlatformName() {
		return getName();
	}
	
	
	public void setPlatformUrl(String url) {
		setUrl(url);
	}
	
	public void setPlatformCountry(String country) {
		setCountry(country);
	}
	
	public void setPlatformFounder(String founder) {
		setFounder(founder);
	}
	
	public void setPlatformFoundedDate(String foundedDate) {
		setFoundedDate(foundedDate);
	}
	
	
	@Override
	public void getAllPlatformDetails() {
		System.out.println("\n\nAll Platforms Details: \n");
		
		System.out.println(getName());
		System.out.println(getUrl());
		System.out.println(getCountry());
		System.out.println(getFounder());
		System.out.println(getFoundedDate());
			
	}
}
