package exceptionHandling;

import java.util.Scanner;

public class FlightBooking{
	
	public String ticketNum;
	public String departure;
	public String arrival;
	
	public FlightBooking(String ticketNum, String departure, String arrival) {
		this.ticketNum = ticketNum;
		this.departure = departure;
		this.arrival = arrival;
	}
	
	public void checkTicket() {
		try {
			if(!ticketNum.matches("\\d+")) {
				throw new NumberFormatException("Number is invalid.");
			}else {
				System.out.println("The ticket number is " + ticketNum);
			}
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void checkDeparture() {
		try {
			if(!departure.matches("^[a-zA-Z]*$")) {
				throw new IllegalArgumentException("Departure is invalid.");
			}else {
				System.out.println("The city of departure is " + departure);
			}
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void checkArrival() {
		try {
			if(!arrival.matches("^[a-zA-Z]*$")) {
				throw new IllegalArgumentException("Arrival is invalid.");
			}else {
				System.out.println("The city of arrival is " + arrival);
			}
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String ticketNum = input.nextLine();
		String departure = input.nextLine();
		String arrival = input.nextLine();
		
		FlightBooking obj = new FlightBooking(ticketNum, departure, arrival);
		
		obj.checkTicket();
		obj.checkDeparture();
		obj.checkArrival();
	}
}
