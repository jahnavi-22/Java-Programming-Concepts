package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

	public Example7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String sentence = "Python Regular Expression - In Python";
	
		String replacement = "Java";
		
		System.out.println("Before replacing : " + sentence);
		
		Pattern pattern = Pattern.compile("Python");
		Matcher matcher = pattern.matcher(sentence);
		//sentence = matcher.replaceAll(replace);
		
		sentence = matcher.replaceFirst(replacement);
		System.out.println("After Replacing : " +sentence);
		
	}

}
