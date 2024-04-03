package multiThreading;

/*
public class ProcessByAnonymousRunnableInterface {

	public ProcessByAnonymousRunnableInterface() {
		
	}

	public static void main(String[] args) {
		System.out.println("Inside : "+ Thread.currentThread().getName());
		System.out.println("Creating Runnable...");
		
		//create anonymous runnable interface
		Runnable runnable=new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside : "+ Thread.currentThread().getName());				
			}
		};
		
		//create thread object with runnable interface as reference
		System.out.println("Creating Thread..");
		Thread T1 = new Thread(runnable);
		
		System.out.println("Starting Thread...");
		T1.start();
		
		System.out.println("Main thread is running....");
		
	}
}
*/

public class ProcessByAnonymousRunnableInterface {
	
	public ProcessByAnonymousRunnableInterface() {
		
	}
	
	public static void main (String[] args) {
		System.out.println("Inside: "+ Thread.currentThread().getName());
		System.out.println("NOW WE WILL CREATE RUNNABLE");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside: "+ Thread.currentThread().getName());
				System.out.println("Child thread is running");				
			}
		};
		
		System.out.println("NOW WE WILL CREATE A THREAD OBJECT OF THE RUNNABLE CLASS");
		Thread T1 = new Thread(runnable);
		T1.start();
		System.out.println("Main thread is running");

	}
}
