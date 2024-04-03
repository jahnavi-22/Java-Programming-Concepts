package hashMaps;

import java.util.*;

/*
 * An object that maps keys to values.
 * Cannot contain duplicate keys, each key can map to one value only.
 * 
 * Map<Integer, String> player = new HashMap<>();
 * (key, value) pair, unordered collection, duplicate value, not synchronized.
 * 
 * Allows null values and the null key.
 * 
 * */


public class HashMaps {

	public HashMaps() {
	}

	public static void main(String[] args) {
		
		HashMap<Integer, String> data = new HashMap<>();
		data.put(101, "Mercury");
		data.put(102, "Venus");
		data.put(103, "Earth");
		data.put(104, "Mars");
		data.put(105, "Jupiter");
		data.put(106, "Saturn");
		data.put(107, "Uranus");
		
		data.put(108, "Pluto");		//wrong
		//data.put(108, "Neptune");	//update
		
		//GET SIZE
		System.out.println(data.size());
		
		//RETRIEVE VALUE
		System.out.println(data.get(103));
		
		//SEARCH THE KEY
		System.out.println(data.containsKey(106));
		
		//REMOVE THE DATA
		System.out.println(data.remove(108));
		
		
		
		//HOW TO PRINT VALUES FROM A MAP
		//1. print statement
		System.out.println(data);

		//2. entrySet() method
		for(Map.Entry<Integer, String> entry : data.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//3. keySet() method
		for(Integer key : data.keySet()) {
			System.out.println(key);
		}
		
		//4. values() method
		for(String value : data.values()) {
			System.out.println(value);
		}
		
		//5. forEach loop
		data.entrySet().forEach(entry->{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});
		
		
		Integer key = 103;
		System.out.println("Hashcode of key : " );
	}

}
