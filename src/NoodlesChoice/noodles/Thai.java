package NoodlesChoice.noodles;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Thai extends Noodles {
	
	Scanner input = new Scanner(System.in);
	String style;
	String vegetables;
	
	public Thai() {
		// TODO Auto-generated constructor stub
	}

	//constructor for building the dish
	public Thai(String noodleDish, int numOfOrders, double priceOfDish, String style, String vegetables, String[] noodleSelection) {
		super(noodleDish, noodleSelection);
		this.style = style;
		this.vegetables = vegetables;
	}



	public String dishSelection(Scanner input) {
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		return input1.nextLine(); 
	}
	
	public String styleSelector() {
		Set<String> Style = new HashSet<>();
		Style.add("Pad See Ew");
		Style.add("Pad Thai");
		Style.add("Drunken Noodles");
		
		System.out.println("\nYour style selection: ");
			for(String S: Style) {
				System.out.println(S);
			}
			
			style = thai.dishSelection(input);
			System.out.println(style);
			return style;
	}
	
	public String vegetablesSelector() {
		Set<String> Vegetables = new HashSet<>();
		Vegetables.add("Peanuts");
		Vegetables.add("Green Onion");
		Vegetables.add("Bean Sprouts");
		Vegetables.add("Mini Trees");
		Vegetables.add("Carrots");
		
		System.out.println("\nYour vegetables selection: ");
			for(String V: Vegetables) {
				System.out.println(V);
			}
			
			vegetables = thai.dishSelection(input);
			System.out.println(vegetables);
			return vegetables;
	}

}
