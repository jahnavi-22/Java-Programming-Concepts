package votingApp;

import java.util.Scanner;


public class Voting {

	public Voting() {
		
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		
		System.out.print("Name : ");
		String name = obj.next();
		
		System.out.print("Country : ");
		String country = obj.next();
		
		System.out.print("Age : ");
		int age = obj.nextInt();
		
		if(age>=18 && country.equals("India")) {
			System.out.println(name + ",You are eligible to vote!");
		}else {
			System.out.println("Oops! " + name + ", You are not eligible to vote!");

		}

	}

}
