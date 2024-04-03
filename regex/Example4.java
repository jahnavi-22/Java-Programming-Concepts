package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

	Scanner input = new Scanner(System.in);

	public boolean runTest(String regex, String text) {
		text = input.next();
		
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		
		return matcher.find();
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 obj = new Example4();
		String regex = "INFOSYS";
		String text = null;
		boolean matches = obj.runTest(regex, text);
		System.out.println(matches);

	}

}
