package multiThreading.states;

/*public class MainClass {

	public static void main(String[] args) {
		Thread processThread_01 = new Thread(new ProcessThreads(), "Process Thread_01");
		Thread processThread_02 = new Thread(new ProcessThreads(), "Process Thread_02");
		Thread processThread_03 = new Thread(new ProcessThreads(), "Process Thread_03");
		
		processThread_01.start();
		try {
			processThread_01.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}

		
		processThread_02.start();
		try {
			processThread_02.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		
		processThread_03.start();
		try {
			processThread_03.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}

}*/


public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		Thread _processThread_01 = new Thread(new ProcessThreads(),"Process Threads_01");
		Thread _processThread_02 = new Thread(new ProcessThreads(),"Process Threads_02");
		Thread _processThread_03 = new Thread(new ProcessThreads(),"Process Threads_03");
		
		_processThread_01.start();
		_processThread_01.join();
		_processThread_02.start();
		_processThread_02.join();
		_processThread_03.start();
		_processThread_03.join();	
	}

}

