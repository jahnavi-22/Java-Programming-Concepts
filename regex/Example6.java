package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example6 {

	public Example6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Ja+");
		Matcher matcher = pattern.matcher("Java is a Japan J Technology and a platform. - JavaTrainer");
		while(matcher.find()) {
			System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end()-1)+ ".");
		}
		
	}

}
