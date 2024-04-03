package generics;

/* Generic Class(Template Method)
 * 
 * When we use T instead of a wrapper class like "String", it allows us to use any and all of the wrapper classes.*/

public class NewBox<T> {
	
	private T obj;

	public NewBox() {
	}

	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		
		NewBox<String> obj = new NewBox<>();
		
		obj.set(new String("Candy"));
		System.out.println(obj.get());
		
		obj.set(new String("Pizza"));
		System.out.println(obj.get());
		
		//obj.set(new Double(100.0));			//compile time error
		//System.out.println(obj.get());

		NewBox<Double> d_obj = new NewBox<>();
		d_obj.set(new Double(100.00));
		System.out.println(d_obj.get());
	}
}
