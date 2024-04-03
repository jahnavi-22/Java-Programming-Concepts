package wrapperClasses;


/*
 *WRAPPER CLASSES : Objects encapsulating primitive Java data types
 *Each java primitive has a corresponding wrapper as:
 *	boolean, byte, short, char, int, long, float, double
 *	Boolean, Byte, Short, Char, Integer, Long, Float, Double
 *
 *We do not need to import them to use them.
 *
 *Generic classes only use objects and don't support primitive data types.
 *
 *We can either use a constructor or a static factory method to convert a primitive value to an object of a wrapper class.
 *Box primitives like Integer or Long have been deprecated.
 *
 *AUTOBOXING AND UNBOXING
*/



public class WrapperClasses {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println("Sum : " + i + j);
		System.out.print("\n");
		
		int ii = 10;
		int jj = 20;
		System.out.println("Sum : " + (ii + jj));
		System.out.print("\n");
		
		Integer my_i = 10;
		Integer my_j = 20;
		System.out.println("Sum : " + my_i + my_j);
		System.out.print("\n");
		
		System.out.println("Sum : " + i + my_i);
		System.out.print("\n");


		Integer myIntObj01 = new Integer(100);
		Integer myIntObj02 = new Integer(10);
		System.out.println("myIntObj01 :  " + myIntObj01);
		System.out.println("myIntObj02 :  " + myIntObj02);
		System.out.println("Sum : " + (myIntObj01 + myIntObj02));
		System.out.print("\n");
		
		Integer i_Obj = new Integer(100);		//constructor
		Integer i_Obj2 = Integer.valueOf(100);	//factory method
		
		
		//PRIMITIVE VALUE TO WRAPPER OBJECT = AUTOBOXING
		int x = 25;
		Integer obj_01 = Integer.valueOf(x);
		
		
		//WRAPPER OBJECT TO PRIMITIVE VALUE = UNBOXING
		Integer obj_02 = 50;
		int y = obj_02.intValue();
		
		//Java will automatically convert the primitive value to the wrapper.
		Integer value = 25;
		
		//internally
		Integer val  = Integer.valueOf(25);
		
		//If we write a method that accepts a primitive value or wrapper object, we can still pass both values to it.
	}

}
