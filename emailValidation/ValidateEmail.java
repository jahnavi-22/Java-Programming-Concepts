package emailValidation;

import java.util.Scanner;

public class ValidateEmail {


	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter email: ");
		String email = obj.nextLine();
		System.out.println(email);
		
		/*
		 Email Validation: An email has an id, @ sign and domain with a period.
		 */
		
		//1--> Check not null
		if(email!=null) {
			
			//2--> Check the presence of @
			for(int i=0; i<email.length(); i++) {
				System.out.print(email.charAt(i) + " ");
				if(email.charAt(i)=='@') {
					int indexOfAt = i;
				
					String userID = email.substring(0,indexOfAt);
					String domain = email.substring(indexOfAt+1);
					
					System.out.println("\n");
					System.out.println("User ID : " + userID.trim());
					System.out.println("Domain : " + domain.trim());
					
					if(userID.isEmpty() || domain.isEmpty()) {
						System.out.println("\nThe user id and domain are invalid.");
					}else {
						System.out.println("\nThe user id and domain are valid.");
					}
					break;
				}else {
					if(i==email.length()) {
							System.out.println("VALIDATION FAILED: @ NOT FOUND");
					}
				}
			}
		}		
	}

}
