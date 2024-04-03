package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public Example2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Java");              //regex
		Matcher matcher = pattern.matcher("JavaKava Java");     //text
		//Java Java Java or JavaJavaJava - same  : 3
		//Java Kava Java   :     2
		
		int matches = 0;
		while(matcher.find()) {
			matches++;
		}
		System.out.println(matches);

	}

}
