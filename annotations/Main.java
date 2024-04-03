package annotations;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unused")
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDo obj = new ToDo();
		if(obj.getClass().isAnnotationPresent(ToDoList.class)) {
			obj.Create();
		}
		else {
			obj.notAllowed();
		}
	}

}