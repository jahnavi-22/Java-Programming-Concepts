package multiThreading.synchronization;

public class SharedCounter {
	static int counter = 5;
	
	//incrementing the value
	//public void increaseByOne() {
		public synchronized void increaseByOne() {
			for(int i=0; i<10; i++) {
				++counter;
				System.out.println("After increment : " + ++counter);
			}
		}
	
	//decrementing the value
	//public void decreaseByOne() {
		public synchronized void decreaseByOne() {
			for(int i=0; i<10; i++) {
				--counter;
				System.out.println("After decrement : " + --counter);
			}
		}
	
	public int getCounter() {
		return counter;
	}
	
	public SharedCounter() {
	}
	
	public static void main(String[] args) {
		
		final SharedCounter obj = new SharedCounter();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				obj.increaseByOne();
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				obj.decreaseByOne();
			}
		};
		t1.start();
		t2.start();
	}
}












