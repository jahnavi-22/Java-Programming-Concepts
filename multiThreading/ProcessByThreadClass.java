package multiThreading;

/*
 * CONCURRENCY : Ability to do multiple things at the same time. Doesn't necessarily involve multiple applications.
 * Can be used at various levels as multiprocessing, multitasking, multi-threading
 * 
 * MULTIPROCESSING - Multiple processors/CPUs executing concurrently.
 * MULTITASKING - Multiple tasks/processes running on the same processor/CPU concurrently.
 * MULTI-THREADING - Multiple parts of the same program divided into threads running concurrently.
 * 
 * 
 * Two basic units of concurrency : 
 * i. PROCESS : It is a program in execution. Has its own address space, a call stack and link to resources.
 * 				A computer system has multiple processes running at the same time.
 * 				The OS keeps track of all these and facilitates execution.
 * ii.THREADS : It is a single unit of a process. Lightweight sub process. 
 * 				Every process has at least one thread called the main thread(Thread-1 if by class).
 * 				This thread can create additional threads within the process.
 * 				Every thread has its own call stack. Threads share the resources of the process.
 * 
 * CONCURRENCY : Multiple parts of the same program being executed.
 * PARALLELISM : 
 * 
 * Multi-threading is the process of executing two or more threads concurrently.
 * 
 * 
 * HOW TO CREATE A THREAD?
 * i.  By extending a Thread class.
 * ii. By implementing a Runnable interface.
 * 
 * Uses : Class is used when we need factory methods; Interface is used when we need the thread object only. 
 * 		  If we use interface, we can still extend other classes.
 * 
 * .stop(), .destroy(), .suspend(), .resume() - DEPRECATED. NOT IN USE. DONT USE. ARE WRITTEN IN API.
 * .destroy() - was never implemented and has been deprecated. 
 * 
 * THREAD LIFE CYCLE : java.lang.Thread class contains a static State enum which defines it's 6 potential states.
 * 					   A thread can only be in one state at a given point of time.
 * {NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED}
 * 
 * 
 * CONCURRENCY ISSUES : 
 * 1. THREAD INTERFERENCE ERROR/INTER-THREAD COMMUNICATION/RACE CONDITIONS - 
 *	  Occurs when more than one thread attempts to access the same resource at the same point of time.
 *	  Can be avoided using synchronization techniques like locks, "synchronized" keyword, monitors and other techniques.
 *
 * 2. DEADLOCK - Neither threads are releasing the locks.
 * 
 * 3. LIVELOCK - Both threads free the locks and try again.
 * 
 * 4. STARVATION - Can occur due to deadlock, livelock or other long priority processes.
 * 
 * CONCURRENCY SOLUTIONS :
 * Two ways of locking:
 * 		i.  Explicit locking using Lock and condition
 * 		ii. Implicit locking using synchronized keyword.(better)
 * 
 * 1. SYNCHRONIZATION - 
 * */ 


/*
public class ProcessByThreadClass extends Thread {

	public ProcessByThreadClass()  {
		
	}
	
	
	@Override
	public void run() {
		System.out.println("Inside Run: "+ Thread.currentThread().getName());
		//System.out.println("Child Thread is Running");
	}

	public static void main(String[] args) {	
		System.out.println("Inside : "+ Thread.currentThread().getName());
		ProcessByThreadClass obj = new ProcessByThreadClass();
		Thread objThread = new Thread(obj);
//		Thread objThread = new ProcessByThreadClass();
		objThread.start();
		System.out.println("Main Thread is Running");
	}

}*/


public class ProcessByThreadClass extends Thread{
	
	public ProcessByThreadClass() {
		
	}
	
	@Override
	public void run() {
		System.out.println("Inside: " + Thread.currentThread().getName());
		System.out.println("Child thread is running.");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside: " + Thread.currentThread().getName());
		Thread T1 = new ProcessByThreadClass();
		T1.start();
		System.out.println("Main thread is running.");
	}
	
	
	
	
	
}