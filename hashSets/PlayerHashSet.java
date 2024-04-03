package hashSets;


/*
 * Hashset internally uses Hashmap to store its elements
 * Java Hashset allows null values.
 * This has less methods as compared to ArrayList.
 * Use hashset to remove duplicate values then convert it into ArrayList.
 * 
 * Hashset<String> player = new Hashset<>();
 * 
 * Default initial capacity - 16 and load factor - 0.75
 * 
 * */

import java.util.*;

public class PlayerHashSet {

	public PlayerHashSet() {
	}

	public static void main(String[] args) {

		/*
		Collection<String> player = new HashSet<>();
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_05");
		player.add("Player_06");
		
		for(String name : player) {
			System.out.println(name);
		}
		*/
		
		
		/*
		ArrayList<String> oldTeam = new ArrayList<>();
		oldTeam.add("Player_01");
		oldTeam.add("Player_02");
		oldTeam.add("Player_03");
		oldTeam.add("Player_04");
		oldTeam.add("Player_05");
		oldTeam.add("Player_03");
		
		System.out.println("Old Team : ");
		for(String player : oldTeam) {
			System.out.println(player);
		}
		
		
		HashSet<String> newTeam = new HashSet<>(oldTeam);
		System.out.println("New Team : ");
		for(String player : newTeam) {
			System.out.println(player);
		}
		*/
		
		HashSet<String> numbers = new HashSet<>();
		numbers.add("3");
		numbers.add("7");
		numbers.add("8");
		numbers.add("5");
		numbers.add("6");
		numbers.add("3");
		
		for(String i : numbers) {
			System.out.println(i);
		}
		
	}

}
