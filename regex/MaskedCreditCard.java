package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskedCreditCard {

	public MaskedCreditCard() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String CardNumber = "1234-2222-5555-0453";
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(CardNumber);
		
		String maskedCardNumber = matcher.replaceAll("XXXX-XXXX-XXXX-");
		System.out.println(maskedCardNumber);
		
	}

}
