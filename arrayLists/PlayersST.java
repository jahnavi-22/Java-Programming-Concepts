package arrayLists;

import java.util.*;

public class PlayersST {

	public PlayersST() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*ArrayList<String> oldTeam = new ArrayList<>();
		oldTeam.add("A");
		oldTeam.add("B");
		oldTeam.add("C");
		oldTeam.add("D");
		
		for(String player : oldTeam) {
			System.out.print(player + " ");
		}
		System.out.println();
		
		ArrayList<String> newTeam = new ArrayList<>(oldTeam);
		for(String member : newTeam) {
			System.out.print(member + " ");
		}
		System.out.println();
		
		
		//using iterator - only traverse in the forward direction, .hasNext(), .next(), .remove()
		Iterator<String> it = newTeam.iterator();
		while(it.hasNext()) {
			String member = it.next();
			System.out.println(member);
		}
		
	//using ListIterator - both forward and backward, .hasNext(), .next(), .hasPrevious(), .previous() .remove()
		ListIterator<String> lit_f = newTeam.listIterator();
		while(lit_f.hasNext()) {
			String player = lit_f.next();
			System.out.println(player);
		}
		
		//mandatory to give size with listIterator for backward
		ListIterator<String> lit_b = newTeam.listIterator(newTeam.size()); 
		while(lit_b.hasPrevious()) {
			String player = lit_b.previous();
			System.out.println(player);
		}*/
		
		String[] flavours = {"Chocolate", "Vanilla", "Butterscotch", "Strawberry"};
		for(int i=0; i<flavours.length; i++) {
			System.out.println(flavours[i]);
		}
		
		//(A.) Arrays.asList(flavours) method
		ArrayList<String> list_a = new ArrayList<>(Arrays.asList(flavours));
		System.out.println(list_a);
		
		//(B.) Collections.addAll(list_b, flavours) method
		ArrayList<String> list_b = new ArrayList<String>();
		Collections.addAll(list_b, flavours);
		System.out.println(list_b);
		
		//(C.) ArrayList.addAll(Arrays.asList(flavours)) method
		ArrayList<String> list_c = new ArrayList<String>();
		list_c.addAll(Arrays.asList(flavours));
		System.out.println(list_c);
	}

}









