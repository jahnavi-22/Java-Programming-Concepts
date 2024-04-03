package annotations;

@ToDoList
public class ToDo {

	public ToDo() {
		// TODO Auto-generated constructor stub
		System.out.println("TO DO");
	}
	
	public void Create() {
		System.out.println("Creating a list ..");
	}
	
	public void notAllowed() {
		System.out.println("Sorry!!! You are not allowed to do this task... ");
	}
}
	
