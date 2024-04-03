package exceptionHandling;

import java.util.Scanner;

public class ThrowsExample {
	private String name;

	public ThrowsExample(String name) {
		this.name = name;
	}
	
	//throw
	public String getName() {
		/*
		 * 1. return name
		 * 2. try-catch-finally
		 * 3. throw an exception
		 * */
		if(name==null) {
			throw new NullPointerException("The name is null.");
		}else {
			return name;
		}
	}
	
	//throws - declare 
	public int getNameLength(String name) throws NullPointerException{
		return name.length();
	}
	
	public void sendUserDetails(){
		int size = 0;
		try {
			size = getNameLength(name);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(size+10);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "Tim";
		//String name = input.nextLine();
		//String name = null;
		
		ThrowsExample obj = new ThrowsExample(name);
		System.out.println(obj.getName());
		System.out.println(obj.getNameLength(name));
		
		obj.sendUserDetails();
		
		
		/*try {
			System.out.println(obj.getNameLength(name));
		}catch(NullPointerException e){
			//e.printStackTrace();
			System.out.println("OOPS! The name is null. Please check it again.");
		}finally {
			
		}*/
	}

}
