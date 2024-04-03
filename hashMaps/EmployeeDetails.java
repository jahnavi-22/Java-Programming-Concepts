package hashMaps;

import java.util.*;

public class EmployeeDetails {

	public EmployeeDetails() {
		System.out.println("Employee Details : ");
	}

	public static void main(String[] args) {
		//Map<String, String> objEmpDetailsMap = new HashMap<>();
		//objEmpDetailsMap.put("DEV-101", "RICHARD");
		
		Map<String, List<String>> objEmpDetailsMap = new HashMap<>();
		List<String> objEmpDetailsList = new ArrayList<>();
		
		/*
		objEmpDetailsMap.put("111", objEmpDetailsList);
		objEmpDetailsMap.get("111").add("Tim");
		objEmpDetailsMap.get("111").add("Project Manager");
		objEmpDetailsMap.get("111").add("London");
		objEmpDetailsMap.get("111").add("tim@gmail.com");
		*/
		
		//OR
		
		
		objEmpDetailsList.add("Tim");
		objEmpDetailsList.add("Project Manager");
		objEmpDetailsList.add("London");
		objEmpDetailsList.add("tim@gmail.com");
		objEmpDetailsMap.put("111", objEmpDetailsList);
		
		System.out.println(objEmpDetailsMap);
		
		

	}

}
