package multiThreading.states;

public class SleepMessages {

	public SleepMessages() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException{
		String[] info = {"I scream", "You scream", "We all scream", "For ice cream!"};
		for(int i=0; i<info.length; i++) {
			Thread.sleep(2000);
			System.out.println(info[i]);
		}
	}

}
