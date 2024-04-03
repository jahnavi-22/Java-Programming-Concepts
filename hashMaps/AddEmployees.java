package hashMaps;

import java.util.*;
import java.util.Scanner;

public class AddEmployees {
	
	private static Scanner input;
	private int N;
	private Map<String, List<String>> map;
	private List<String> list;
	private static final int TOTAL_DATA = 4;
	
	static {
		input = new Scanner(System.in);
	}

	public AddEmployees(int N) {
		N=input.nextInt();
		this.N=N;
	}
	
	public int getN() {
		return N;
	}
	
	public void addEmployee(int total_emp) {
		
		String emp_id=null;
		
		map = new HashMap<>();

		for(int i=0; i<total_emp; i++) {			
			
			list = new ArrayList<>();
			
			for(int e=0; e<TOTAL_DATA; e++) {			//NAME, LOCATION, TEAM NAME, SALARY
				emp_id=input.next();
				list.add(input.next());
			}
			map.put(emp_id,list);
		}
	}

	public void showEmployeeData() {
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
	
	//DRIVER CODE
	public static void main(String[] args) {
		
		int N= 2;
        AddEmployees obj = new AddEmployees(N);
        obj.addEmployee(obj.getN()); // Add employee details
        obj.showEmployeeData(); // Display employee details
		

	}

}
