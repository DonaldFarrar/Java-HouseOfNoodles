package NoodlesChoice.noodles;
import java.util.*;

public class Italian extends Noodles {
	
	Scanner input = new Scanner(System.in);
	String sauce;
	String cheese;

	//constructor for building the dish
	public Italian(String noodleDish, int numOfOrders, double priceOfDish, String sauce, String cheese, String[] noodleSelection) {
		super(noodleDish, noodleSelection);
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	public Italian() {
		// TODO Auto-generated constructor stub
	}

	public String dishSelection(Scanner input) {
		
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		return input1.nextLine(); 
		
	}
	
	public String sauceSelector() {
		Set<String> Sauce = new HashSet<>();
		Sauce.add("Alfredo");
		Sauce.add("Gravy");
		Sauce.add("Garlic oil");
		
		System.out.println("\nYour sauce selection: ");
			for(String S: Sauce) {
				System.out.println(S);
			}
			sauce = italy.dishSelection(input);
			System.out.println(sauce);
			return sauce;
	}

	public String cheeseSelector() {
		Set<String> Cheese = new HashSet<>();
		Cheese.add("Mozzarella");
		Cheese.add("Parmesan");
		Cheese.add("Pecorino");
		
		System.out.println("\nYour cheese selection: ");
			for(String C: Cheese) {
				System.out.println(C);
			}
			cheese = italy.dishSelection(input);
			System.out.println(cheese);
			return cheese;
	}

		
}
