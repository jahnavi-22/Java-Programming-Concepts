package multiThreading.states;


public class NewState {

	public NewState() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Runnable runnable = new ThreadLifeCycleState();
		Thread t = new Thread(runnable);
		System.out.println(t.getState());
		
		t.start();
		System.out.println(t.getState());
	}
}
