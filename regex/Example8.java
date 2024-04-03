package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example8 {

	public Example8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern pattern = Pattern.compile("Flight No. : \\d{5}");  //  \\d{5,7}or  \\d{5} or \\d\\d\\d\\d\\d
		
		//Pattern pattern = Pattern.compile("^Flight No. : \\d{3,}$");    //start ^ and end ^\$
		
		//Pattern pattern = Pattern.compile("^.light No. : \\d{3,}$");
		
		//Pattern pattern = Pattern.compile("^[f|F]light [n|N]o. : \\d{3,}$"); //take any of 2 f,F
		
		//Pattern pattern = Pattern.compile("^[f|F|AF]light [n|N]o. : \\d{3,}$");
		
		Pattern pattern = Pattern.compile("^(f|F|AF)light [n|N]o. : \\d{3,}$");
		
		Matcher matcher = pattern.matcher("Flight No. : 1024");       //min^,^max   
		boolean matchFound = matcher.find();
		System.out.println(matchFound);
	}

}
