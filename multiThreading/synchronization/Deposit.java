package multiThreading.synchronization;

public class Deposit implements Runnable{

	private Double amount;
	private Transaction objT;
	
	
	public Deposit(Transaction objT, Double amount) {
		this.objT = objT;
		this.amount = amount;
	}

	@Override
	public void run() {
		objT.depositTransactionService(amount);
	}

}
