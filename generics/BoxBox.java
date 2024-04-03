package generics;

//Unbounded type parameter

public class BoxBox<T> {

	private T[] boxData;
	
	public BoxBox(T[] boxData) {
		this.boxData = boxData;
	}

	public T[] getBoxData() {
		return boxData;
	}
	
//	public <T> void showBoxData(){
	public <T> void showBoxData(T[] boxData){
		for(T data : boxData) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public <T> void inspect() {
		System.out.println("T : " + boxData.getClass().getSimpleName());
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		String[] item_name = {"Pizza", "Burger", "Coke", "Fries", "Wrap"};
		
		BoxBox<String> s_obj = new BoxBox<>(item_name);
		s_obj.showBoxData(item_name);
		s_obj.inspect();
		
		
		Double[] item_price = {100.00, 80.00, 45.00, 115.00, 60.00};
		
		BoxBox<Double> p_obj = new BoxBox<>(item_price);
		p_obj.showBoxData(p_obj.getBoxData());
		p_obj.inspect();
	}
}


//current month ka calender print krna hai.
/*
 * public void showCurrentMonth() days with date/
 */