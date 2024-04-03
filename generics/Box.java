package generics;

/*
 * JDK 5.0 introduced Java Generics with the aim of reducing bugs and adding an extra layer of abstraction.
 * Allows us to create a single class, interface and method that can be used with different types of data (objects),
 * Helps us to reuse our code.
 * 
 * Generics does not work with primitive data types. 
 * Only works with non-primitive like Collections, Wrapper classes and user defined data types.
 * 
 * ArrayList<Integer> list = new ArrayList<Integer>();
 * 		Here, ArrayList = Base type and <Integer> = Parameter Type.
 * 
 * Core idea: If programmers could express their intention to use specific types and 
 * the compiler ensured the correctness of such types.
 * 
 * Generic Class (Template Method)
 * Generic Method
 * 
 * Type Parameter Naming Convention:
 * -Single, uppercase letters eg. <T>
 * 
 * Type variable can be any non-primitive type.
 * 
 * */

public class Box {

	private Object obj;
	
	public Box() {
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}



	public static void main(String[] args) {
		Box obj = new Box();
		
		obj.setObj(new String("Candy"));
		System.out.println(obj.getObj());
		
		obj.setObj(new Double(100.0));
		System.out.println(obj.getObj());

	}

}
