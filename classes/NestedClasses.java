package classes;

/*
 * NESTED CLASSES :
 * A way of logically grouping classes that are only used in one place.
 * Increases encapsulation.
 * Can lead to more readable and maintainable code.
 * 
 * 
 * TWO CATEGORIES:
 * STATIC : Cannot directly access the outer class fields because they are instance variables(main class ke variables like - String x, int y etc).
 * NON-STATIC/INNER : Can be used to implement helper classes.
 * 					  Two types: 	i. local class		ii. anonymous class (nameless)
 * 
 * You cannot access non-static fields from static classes. Because JVM reads the static stuff first.
*/


public class NestedClasses {
	
	public class CandidateInfo{
		private String name;
		private int age;
		private int id;
		
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
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	}
	
	
	public static void main(String[] args) {
		NestedClasses obj = new NestedClasses();
		
		CandidateInfo obj_ci = obj.new CandidateInfo();
		
		System.out.println(obj.hashCode());
		System.out.println(obj_ci.hashCode()+"\n");
		
		obj_ci.setName("Jahnavi");
		obj_ci.setAge(20);
		obj_ci.setId(1333);
		
		System.out.println("Name : " + obj_ci.getName());
		System.out.println("Age : " + obj_ci.getAge());
		System.out.println("ID : " + obj_ci.getId());
		
	}

}
