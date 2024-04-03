package exceptionHandling;

/*
 * Allows us to handle runtime errors caused by exceptions.
 
 * Difference between an error and an exception:
 * ERROR : Indicates that something severe enough has gone wrong. The app crashes instead of handling the error.
 * EXCEPTION : An unwanted event that interrupts the flow of the program. Can be handled.
 * 
 * NullPointerException : When a reference points to null.
 * ArithmeticException: Dividing by 0
 * ArrayIndexOutOfBoundsException: Calling an a[i] where i>a.length.
 * NumberFormatException: TEN instead of 10
 * 
 * TYPES OF EXCEPTIONS:
 * i.   Checked Exceptions- Checked at compile time. Are external to the application. 
 * 		Cannot be anticipated or recovered from. Subject to Catch or Specify Requirement.
 * ii.  Error
 * iii. Unchecked/Runtime Exceptions- Checked at run time. Are internal to the application.
 * 		Not subject to Catch or Specify Requirement.
 * 
 * Errors and exceptions are subclasses of the Throwable class.
 * Only instances of Throwable or its subclasses are handled by JVM.
 * 
 * EXCEPTION HANDLING COMPONENTS : try, catch, finally.
 * assgn - cheque - words to numbers, flight booking
 * 
 * 5 keywords for exception handling:
 * TRY : used to try the code which might have some error/exception
 * CATCH : catch the exception if you know what kind it is
 * FINALLY ; works regardless of if you've caught it or not
 * THROW : used to explicitly throw an exception. mainly used to throw custom exception.
 * 		   throw either checked or unchecked exception in java.
 * THROWS : used to declare an exception. gives info to the programmer that there may occur an exception
 * */

public class exceptionHandling {

	public exceptionHandling() {
		// TODO Auto-generated constructor stub
	}

}
