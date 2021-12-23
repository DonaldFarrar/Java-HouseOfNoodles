package NoodlesChoice.noodles;
import java.util.*;

public class Total implements Price {
	
	Scanner input = new Scanner(System.in);
	
	protected double total;
	private int value;
	private double price;
	
	public Total(){
		this.total = 0;
	}

	//Exception in place for if user tries to enter something other than a number
	public int quantity() {
		boolean correctInput = true;
		this.setValue(value);
		do {
			System.out.println("How many orders would you like: ");
			try {
			value = input.nextInt();
			correctInput = false;
		} catch(InputMismatchException Exception) {
			System.out.println("Must enter a number");
			input.nextLine();
			} 
		}while(correctInput); 
		return value;
	}

	public double priceItaly() {
		this.setPrice(7.99);
		return price;
	}

	public double priceThai() {
		this.setPrice(8.99);
		return price;
	}

	public double priceRamen() {
		this.setPrice(9.99);
		return price;
	}
	
	// ================> GETTERS AND SETTERS BELOW <================== //
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
