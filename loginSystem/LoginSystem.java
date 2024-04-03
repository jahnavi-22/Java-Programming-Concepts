package loginSystem;

import java.util.Scanner;

public class LoginSystem {

	public LoginSystem() {
		Scanner input  = new Scanner(System.in);
		
		//static data
		String x = "Bajaj";
		String y = "Password@123";
		
		//dynamic data
		String uid, upswd;
		
		//login system
		do {
			System.out.print("Enter username: ");
			uid = input.next();
			
			System.out.print("Enter password: ");
			upswd = input.next();
			
			//Check if user id and password match or not
			if((uid.equals(x) && upswd.equals(y))||(uid.equals(y) && upswd.equals(x))) {
				System.out.println("Welcome " + uid + " \n");
			}else {
				System.out.println("Please check your user id and password.\n");
			}
			
		}while(!uid.equals(x) && !upswd.equals(y));
	}

	public static void main(String[] args) {
		LoginSystem obj = new LoginSystem();
		

	}

}
