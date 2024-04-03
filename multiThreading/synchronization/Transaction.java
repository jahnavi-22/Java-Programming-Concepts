package multiThreading.synchronization;

public class Transaction {
	
	private static final int DELAY = 5000;
	Account account;

	public Transaction() {
		account = new Account();
	}

	public synchronized void depositTransactionService(Double amount) {
		System.out.println("Before Deposit : " + account.getBalance());
		
		Double balance = account.getBalance() + amount;
		account.setBalance(balance);
		
		try {
			Thread.sleep(DELAY);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("After Deposit: " +  account.getBalance());
	}
	
	public synchronized void withdrawalTransactionService(Double amount) {
		System.out.println("Before Withdrawal : " + account.getBalance());
		
		Double balance = account.getBalance() - amount;
		account.setBalance(balance);
		
		try {
			Thread.sleep(DELAY);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("After Withdrawal: " +  account.getBalance());

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
