package oop.abstraction;

public abstract class Twitter {
	
	
	private static final String COMPLETE_NAME = "TWITTER";
	
	
	private String name;
	private String url;
	private String country;
	private String founder;
	private String foundedDate;
	

	public Twitter(String name) {
		System.out.println("Social Media Platform - Twitter");
		this.name = name;
	}
	

	//Non Abstract Method
	public String getName() {
		return name;
	}
	
	//Abstract Method
	public abstract void getLinkedinDetails();

}
