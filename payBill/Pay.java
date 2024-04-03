package payBill;

public class Pay {

	public static void main(String[] args) {
		String month = "May";
		double bill[] = {10000.00, 100.00, 500.00, 1000.00, 2500.00};
		
		bill[4] = 4500.00;
		Payment obj = new Payment(month, bill);
		
		bill[4] = 4300.00;
		obj.monthlyBill();
	}

}
