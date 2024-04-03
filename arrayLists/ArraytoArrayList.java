package arrayLists;

import java.util.*;

public class ArraytoArrayList {

	public ArraytoArrayList() {
	}

	public static void main(String[] args) {
		String[] arr = new String[] {"Steve", "Tim", "Lucy", "Pat", "Angela", "Tom"};
		
		/*
		 //1. Using Arrays.asList() method
		 ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		 System.out.println(list);
		*/
		 
		/*
		 //2. Using Collections.addAll() method
		 ArrayList<String> list = new ArrayList<String>();
		 Collections.addAll(list, arr);
		 System.out.println(list);
		*/
		 
	    /*
		//3. Using ArrayList.addAll() method
		 ArrayList<String> list = new ArrayList<String>();
		 list.addAll(Arrays.asList(arr));
		 System.out.println(list);
		 */
	}

}
