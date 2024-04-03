package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example5 {

	public Example5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("University",Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("University Chitkara University");  //same as CHITKARA UNIVERSITY 
		
		/*// For print all the match Indexes 
		 * while(matcher.find()) { System.out.println("Match found from "+
		 * matcher.start() +" and ends at " +(matcher.end()-1) + "." ); }
		 */
		
		//For the first word that matches
		boolean matchFound = matcher.find();
				
		if(matchFound) {
			System.out.println("Match found from "+ matcher.start() +" and ends at " +(matcher.end()-1) + "." );
			}
		else {
			System.out.println("Match Not Found");
		}

	}

}
