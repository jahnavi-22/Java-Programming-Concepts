package upcastingDowncasting;


abstract class Bank{
	private String bankId;
	private String bankName;
	private String bankLocation;
	
	private long turnover;
	
	public Bank(long turnover) {
		this.turnover = turnover;
	}
	
	public abstract void bankId();
	public abstract void bankName();
	public abstract void bankLocation();
	
	public void turnover() {
		System.out.println("Turnover :" + turnover);
	}
}


class HDFC extends Bank{
	public HDFC(long turnover) {
		super(turnover);
	}
	
	@Override
	public void bankId() {
		System.out.println("H011011");
	}
	
	@Override
	public void bankName() {
		System.out.println("HDFC");
	}
	
	@Override
	public void bankLocation() {
		System.out.println("DELHI");
	}
	
	//@Override
	public void type() {
		System.out.println("PRIVATE");
	}
}


public class UpcastingDowncasting {

	public static void main(String[] args) {
		/*Bank obj = new Bank();
		HDFC objHDFC = new HDFC();
		
		
		//UPCASTING
		Bank objBank = new HDFC(5000000); 	//50 crores
		
		
		objBank.bankId();
		objBank.bankName();
		objBank.bankLocation();
		
		objBank.turnover();		//This is in the bank class, so we can access it.
		
		//Downcasting 
		//HDFC objHDFC = (HDFC) objBank;
		
		objHDFC.type();
		objBank.bankName();
		objBank.bankLocation();*/
		
		Bank objBank = new HDFC(50000000);

		objBank.bankId();
		objBank.bankName();
		objBank.bankLocation();

		objBank.turnover();

		//objBank.type();

		//Downcasting 
		/*HDFC objHDFC = (HDFC) objBank;

		objHDFC.type();
		objBank.bankName();
		objBank.bankLocation();*/
	}

}

