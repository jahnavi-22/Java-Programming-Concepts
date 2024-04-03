package payBill;

public class Payment {
	private String month;
	private double rent;
	private double water;
	private double mobile;
	private double electricity;
	private double internet;
	private double bill[];
		

	public Payment(String month, double bill[]) {
		this.month = month;
		
		//shallow copy
		this.bill = bill;
	}
	
	
	//deep copy
	/*
	 public Payment(String month, double[] bill) {
		this.bill = new double[bill.length];
		for(int i=0; i < this.bill.length; i++) {
			this.bill[i] = bill[i];
		}
	}
	*/

	public void monthlyBill() {
		System.out.println(month);
		System.out.println("Rent : " + bill[0]);
		System.out.println("Water : " + bill[1]);
		System.out.println("Mobile : " + bill[2]);
		System.out.println("Internet : " + bill[3]);
		System.out.println("Electricity : " + bill[4]);
		
	}

}
