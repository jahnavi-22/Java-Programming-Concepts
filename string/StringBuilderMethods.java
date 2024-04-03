package string;

public class StringBuilderMethods {

		//faster than strings and stringbuffer
		//since 1.5, faster, not synchronized, not thread safe
		//mutable
		//string concat + operator internally uses buffer and builder class
		//used for non multi-threaded environment

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Solar System");
		System.out.println(str + "\n");

		
		//default capacity is 16
		System.out.println(str.capacity()); 	//16 + capacity
		System.out.println(str.length());
		System.out.println(str+ "\n");

		
		str.insert(0, "Living ");
		System.out.println(str.capacity()); 	//16 + capacity
		System.out.println(str.length());
		System.out.println(str+ "\n");
		
		str.insert(0, "Our Universe : The ");
		System.out.println(str.capacity()); 	//16 + capacity
		System.out.println(str.length());
		System.out.println(str+ "\n");
		
		
		//INSERT
		str.insert(1, "wewewe");
		System.out.println(str);

		
		//DELETE
		str.delete(3, 9);
		System.out.println(str);
		
		//APPEND
		str.append("X");
		System.out.println(str);
		
		//REVERSE
		str.reverse();
		System.out.println(str);

		//String str = StringBuilder 	//ERROR
		
		//String str = _stringBuilder(toString());
		
	}

}
