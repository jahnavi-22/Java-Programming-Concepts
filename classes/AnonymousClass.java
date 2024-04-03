package classes;

public class AnonymousClass {
	interface HelloWorld{
		public void greetings(String greet);
	}
	
	public void sayHello() {
		
		//Simple Inner Local Class
		class EnglishGreeting implements HelloWorld{
			public void greetings(String eGreet) {
				System.out.println("English : " + eGreet);
			}
		}
		
		HelloWorld englishGreeting = new EnglishGreeting();
		
		
		//Anonymous Class
		HelloWorld frenchGreeting = new HelloWorld() {
		public void greetings(String fGreet) {
			System.out.println("French : " + fGreet);
			}
		};
		
		HelloWorld spanishGreeting = new HelloWorld() {
			public void greetings(String sGreet) {
				System.out.println("Spanish : " + sGreet);
				}
			};
		
		HelloWorld germanGreeting = new HelloWorld() {
			public void greetings(String gGreet) {
				System.out.println("German : " + gGreet);
				}
			};
		
		HelloWorld hindiGreeting = new HelloWorld() {
			public void greetings(String hGreet) {
				System.out.println("Hindi : " + hGreet);
				}
			};
		
		englishGreeting.greetings("Hello");				//object.method(value)
		frenchGreeting.greetings("Bonjour");
		spanishGreeting.greetings("Hola");
		germanGreeting.greetings("Hallo");
		hindiGreeting.greetings("Namaste");

	}

	

	public static void main(String[] args) {
		AnonymousClass obj =new AnonymousClass();
		obj.sayHello();
	}
}



			
			
			
		
			
			
		