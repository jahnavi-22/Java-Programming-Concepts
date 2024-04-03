package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("First number: ");
		int n1 = obj.nextInt();
		
		
		System.out.print("Second number: ");
		int n2 = obj.nextInt();
		
		System.out.print("Operator: ");
		String c = obj.next();

		//obj.setNumbers(n1,n2);
		
		
		/*switch(c) {
		case "+" : 
			result = n1+n2;
			System.out.println("Result : " + result);
			break;
		case "-" : 
			result = n1-n2;
			System.out.println("Result : " + result);
			break;
		case "*" : 
			result = n1*n2;
			System.out.println("Result : " + result);
		break;
		case "/" : 
			result = n1/n2;
			System.out.println("Result : " + result);
			break;
		default: System.out.println("Error");
		break;
		}*/
		
	}

}
