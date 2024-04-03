package arrayLists;

/*
 * Collections Framework or Java Collection API is a collection of classes and interfaces.
 * It's a root interface in the Collection API. A collection is an object that represents a group of objects.
 * Collection player = new Arraylist()		//correct way
 * 
 * Collections Framework only works on objects and not on primitive data types.
 * */

import java.util.*;

/*
 * An ordered collection/sequence.
 * The user has complete control over where in the list each element is inserted.
 * The user can access elements by their integer index(position in the list) and search for elements in the list.
 * List<String> player = new ArrayList<>();
 * 
 * Ordered  collection, Duplicate value, NOT synchronized.
 * Re-sizable array(aka dynamic array).
 * Grows when elements are added and shrinks in size when elements are removed.
 * Allows you to retrieve elements by their indices.
 * Allows null values.
 * */

public class PlayerList {

	public PlayerList() {
	}

	public static void main(String[] args) {
		
		/*
		Collection<String> player = new ArrayList<>();
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
		List<String> player = new ArrayList<>();
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
		
		
		ArrayList<String> oldTeam = new ArrayList<>();
		oldTeam.add("Player_01");
		oldTeam.add("Player_02");
		oldTeam.add("Player_03");
		oldTeam.add("Player_04");
		oldTeam.add("Player_05");
		oldTeam.add("Player_06");
		
		ArrayList<String> newTeam = new ArrayList<>(oldTeam);
		for(String player : newTeam) {
			System.out.println(player);
		}

		//Using Iterator
		//can only go from top to bottom
		//name_of_collection.iterator() - factory method
		//.hasNext(), .next(), .remove()
		
		Iterator<String> teamIterator = newTeam.iterator();    
		while(teamIterator.hasNext()) {
			String player = teamIterator.next();
			System.out.println(player);
		}
		
		//LIST ITERATOR 
		//hasNext(), next(), hasPrevious(), previous()
		//must mention size for list iterator unlike iterator in which there's no need for size
		ListIterator<String> teamListIterator = newTeam.listIterator(newTeam.size());
		while(teamListIterator.hasPrevious()) {
			String player = teamListIterator.previous();
			System.out.println(player);
		}
	}
}
