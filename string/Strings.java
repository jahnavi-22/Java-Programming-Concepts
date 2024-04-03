package string;


public class Strings {
	//immutable
	

	public Strings() {
			//  == 	   :  Checks whether 2 string objects are identical 
			String a = new String("a");
			String b = new String("a");
			System.out.println(a==b); //FALSE
			String c = a;
			System.out.println(a==c); //TRUE
			
			// .equals :  Compares two strings character by character to determine equality
			
			//compareTo : Compares the Unicodes (lexicographically)
			System.out.println(a.compareTo(b));
			System.out.println(a.compareTo(c));
			System.out.println(a.compareTo(a));
			System.out.println("\n"); 

			
			String str = new String("Solar System");
			System.out.println(str);

			//METHODS
			System.out.println(str.charAt(0));				//charAt()
			System.out.println(str.length());				//length()
			System.out.println(str.isEmpty());				//isEmpty()
			System.out.println(str.toLowerCase());			//toLowerCase()
			System.out.println(str.toUpperCase());			//toUpperCase()
			System.out.println(str.indexOf(str));			//indexOf()
			String newstr = new String("Our Universe");
			System.out.println(str.concat(" " + newstr));	//concat()
			System.out.println(str.replace("S", "Z"));		//replace()
			System.out.println(str.join("-", "Name", "Age", "Country", newstr));	//join()
		
	}

	public static void main(String[] args) {
		Strings obj = new Strings();
	}

}

