
public class HelloWorld {
	
	public HelloWorld() {
		
	}
	
	
	//static-block - comes first, runs before any static method
	static {
		System.out.println("Static Block");
	}
	
	static void staticMethod() {
		System.out.println("Static Method");
	}

	/*
	 * OBJECT
	 */
	
	//static-main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Hello World";
		System.out.println("message");
		
		System.out.println("TUESDAY");
		int i;
		
		HelloWorld obj;
		obj= new HelloWorld();		//reference of a class by constructor
		System.out.println("Object: " + obj);
		
		HelloWorld.staticMethod(); 	//write the name of the class instead of the object
	}
	
	
}
