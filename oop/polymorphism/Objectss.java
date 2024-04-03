package oop.polymorphism;


/*
 * Class: basic static structure - fields & methods (variables & functions)
 * Object: real time entity
 * 
 * A class can be named object because the java-made class(java.lang.object) and our class resides in different packages.
 * java.lang.object is the root of the class hierarchy.
 * Every class has 'object' as its superclass.
 * All objects, including arrays, implement the methods of this class.
 * 
 * We cannot create an object of an abstract class.
 * 
 * No memory is allocated at the time of declaration of class.
 * Sufficient memory is allocated for all the variables of the class at the time of declaration of object.
 */

/*
 * METHODS
 * 
 * clone() : to create a copy from an existing object. obj.clone(). implements the Cloneable interface.
 * equals(Object obj) : uses the identity operator (==) to determine whether two objects are equal. 
 * 						For primitive data types, this gives the correct result. For objects, it tests whether 
 * 						the object references are equal — i.e., if the objects compared are the exact same object.
 * hashCode() : generates a unique ID for an object
 * getClass(): 
 * wait() :
 * wait(long timeout) :
 * notify() :
 * notifyAll() : 
 * toString() : converts to string
 * finalize() : can't be used by us, only by JVM, frees up resources.
 */

/*
 * HOW TO INSTANTIATE A CLASS IN JAVA/CREATE AN OBJECT:
 * a. Using new keyword
 * b. Using Class.forName()   //Class1 obj = (Class1)Class.forName("object creation").newInstance();
 * c. Using Clone methods	  //Class1 obj2 = (Class1)obj1.clone();	 Clones will have different hash code IDs.
 * d. De-serialization 
 */

/*
 * COMPARING OBJECTS:
 * == and != : 
 * equals() :
 * static equals() : 
 * notEqual() : 
 * compare() : 
 * Comparable Interface : 
 * Comparator Interface : 
 * */

/*
 * COPY AN OBJECT:
 * Class1 obj_1 = new Class1("hi");
 * Class1 obj_2 = new Class1(obj_1);	OR 		Class1 obj_2 = new Class1((Class1) obj_1);
 * */

/*
 * SHALLOW COPY : 
 * 			Fields of primitive data type copied, object references not copied.
 * 			Changes in the original object brings about a change in the copied object.
 * DEEP COPY : 
 * 			Fields of primitive data type + object references copied.
 * 			Changes in the original object DOES NOT bring about a change in the copied object.
 * 			Done using 		(i) the copy constructor 	(ii) clone() method
 * LAZY COPY : Combination of both
 * */


public class Objectss {
	String name;

	public Objectss() {
		// no argument constructor 
	}
	
	public Objectss(String myName) {
		name = myName;
		//this.name = name if (String name)
	}
	
	public Objectss(Objectss obj) {			//here, in Objectss obj, Objectss is the name of the class
		// copy constructor 
		this.name = obj.name;
		System.out.println("Copy Constructor");
		System.out.println(name);
	}

	public static void main(String[] args) {
		Objectss obj = new Objectss("Jahnavi");
		Objectss obj_1 = new Objectss(obj);
		System.out.println(obj_1.name);
	}

}
