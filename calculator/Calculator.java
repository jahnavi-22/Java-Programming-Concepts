package calculator;

public class Calculator {
	private int n1;
	private int n2;
	private String c;
	private int result;
	
	
	public int add() {
		return n1+n2;
	}
	
	public int subtract() {
		return n1-n2;
	}
	
	public int multiply() {
		return n1*n2;
	}
	
	public int divide() {
		return n1/n2;
	}
	
	public int remainder() {
		return n1%n2;
	}
	
	public int square() {
		return n1*n1;
	}
	

	public void setNumbers(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}


}
