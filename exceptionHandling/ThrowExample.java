package exceptionHandling;

public class ThrowExample {

	public void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access Denied");
		}else {
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		ThrowExample obj = new ThrowExample();
		obj.checkAge(15);
	}
}


/*public class ThrowExample{
	
	public void checkAge(int age) {
			if(age<18) {
				throw new ArithmeticException("Access Denied");
			}else {
				System.out.println("Access Granted");
		}
	}
	
	public static void main(String[] args) {
		ThrowExample obj = new ThrowExample();
		obj.checkAge(0);
	}
}*/