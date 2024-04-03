package enums;

/* An enum type is a special non-primitive data type that enables for a variable to be a set of predefined constants.
 * Basically a collection of fixed constants.
 * The main objective of enum is to define our own data types.
 * All enums implicitly extend java.lang.Enum and therefore cannot extend anything else.
 * Can be declared inside or outside of a class.
 * As per Java Naming Convention, all constant names should be in all caps.
 * Can't be declared inside a method.
 **Inside an Enum, the constants must be placed in the very first line. Then come the variables, constructor and methods.
 * 
 */

enum Weekdays{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

enum Level{LOW, MEDIUM, HIGH}

public class EnumClass {

	public static void main(String[] args) {
		Weekdays _today = Weekdays.TUESDAY;
		System.out.println("Today : " + _today);
		System.out.println("Length : " + Weekdays.values().length);
		
		
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}
}
