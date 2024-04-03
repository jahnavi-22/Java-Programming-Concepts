package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {

	public Example3() {
		// TODO Auto-generated constructor stub
	}
	public int runTest(String regex,String text) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		int matches=0;
		while(matcher.find()) {
			matches++;
		}
		return matches;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Example3 obj = new Example3();
		 int matches = obj.runTest("e","B.Tech");
		 System.out.println(matches);

	}

}
