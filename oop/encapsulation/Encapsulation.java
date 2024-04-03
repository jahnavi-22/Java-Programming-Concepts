package oop.encapsulation;


/*
 * Encapsulation: To wrap up the fields and methods the together
 */


public class Encapsulation {
	
	int serialNo ;	//instance variables
	
	//No argument/Default constructor - not required
	/*
	public Encapsulation() {
		serialNo = 10;
		
		//System.out.println("Serial No. " + serialNo);	//10
		//System.out.println("Serial No. " + ++serialNo);	//11
		
		//System.out.println("Serial No. " + (1+serialNo));	 //12
		//System.out.println("Serial No. " + (serialNo + 1));  //12
	}
*/
	
	
	public void Method() {
		System.out.println("Serial No. - " + serialNo);	//11
	}
	
	
	//Setters and Getters
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	
	
	public static void main(String[] args) {
		
		int serialNo = 100;
		
		Encapsulation obj = new Encapsulation();
		
		obj.serialNo = 25;
		
		//An object is a real time entity to access everything from the class it belongs to
		//System.out.println(obj.serialNo);
		
		obj.Method();

	}



	
}
