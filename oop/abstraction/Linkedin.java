package oop.abstraction;

public abstract class Linkedin {
	
	private static final String COMPLETE_NAME = "LINKEDIN";
	
	private String name;
	private String url;
	private String country;
	private String founder;
	private String foundedDate;
	

	public Linkedin(String name) {
		System.out.println("Social Media Platform - Linkedin");
		this.name = name;
	}
	

	//Non Abstract Method
	public String getName() {
		return name;
	}
	
	//Abstract Method
	public abstract void getLinkedinDetails();

}
