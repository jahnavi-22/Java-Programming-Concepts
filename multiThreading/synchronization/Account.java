package multiThreading.synchronization;

public class Account {

	private static Double balance = (double) 1000;
	
	public Account() {
		
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
