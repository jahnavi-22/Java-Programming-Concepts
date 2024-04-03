package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

	public Example1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("Java");
		Matcher matcher = pattern.matcher("java");
		
		System.out.println(matcher.find());
	}

}
