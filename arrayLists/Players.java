package arrayLists;

import java.util.*;

//nested

class Player {
	
	private String name;
	private int age;

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}


public class Players {
	
	public static void main(String[] args) {
		
		List<Player> player = new ArrayList<>();
		
		player.add(new Player("Carl", 25));
		player.add(new Player("John", 34));
		player.add(new Player("Steve", 29));
		player.add(new Player("Harry", 32));
		
		/*for(Player p : player) {
			System.out.println(p.getName() + " : " + p.getAge());
		}*/
		
		Iterator<Player> it = player.iterator();
		while(it.hasNext()) {
			Player p = it.next();
			System.out.println(p.getName());
		}										//sysout(p) returns the object i.e sysout(player)
		
		
		//forward direction
		ListIterator<Player> lit_F = player.listIterator();
		while(lit_F.hasNext()) {
			Player p = lit_F.next();
			System.out.println(p.getName());
		}
		
		
		//backward direction -- won't work without obj.size()
		ListIterator<Player> lit_B = player.listIterator(player.size());
		while(lit_B.hasPrevious()) {
			Player p = lit_B.previous();
			System.out.println(p.getName());
		}
	}
}
