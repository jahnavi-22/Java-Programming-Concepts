package classes;

public class OuterClass {

	//simple nested inner class
		class InnerClass{
			public void show() {
				System.out.println("Nested Class Methods");
			}
		}
	

	public static void main(String[] args) {
		
		OuterClass.InnerClass obj = new OuterClass().new InnerClass();
		obj.show();
	}

}
