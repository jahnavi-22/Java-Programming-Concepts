package oop.inheritance;

import java.util.Scanner;


public class Main {
		
	
	public static void main(String[] args) {
		
		Scanner _input = new Scanner(System.in);
		
		System.out.print("Car Name: ");
		String _name = _input.next();
		
		Child obj = new Child(_name);
		
		System.out.println(obj.getName());
		
		//Did you modify the car?
		System.out.println("Did you modify the car?");
		String _sModified = _input.next();
		
		if (_sModified.equals("YES")) {
			obj.setModified(true);
		}else if (_sModified.equals("NO")) {
			obj.setModified(false);
		}
		
		System.out.println(obj.isModified());
		
	}

}
