package NoodlesChoice.noodles;
import java.util.*;

public class Noodles extends Main {
	
	Scanner input = new Scanner(System.in);
	String noodleDish;
	String order;

	String[] noodleSelection = {"Italian", "Thai", "Ramen"}; 
	
	static Italian italy = new Italian();
	static Thai thai = new Thai();
	static Ramen ramen = new Ramen();
	
	Total t = new Total();
	
	public Noodles() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String dishChoice(String prompt) {
		return prompt;
	}

	public Noodles(String noodleDish, String[] noodleSelection) {
		this.noodleDish = noodleDish;
		this.noodleSelection = noodleSelection;
	}
	
	public String dishSelector() {
		System.out.println("Please select from the following noodle: ");
		for(int i = 0; i < noodleSelection.length; i++) {
			System.out.println(noodleSelection[i]);
	}
		//switch case checking to see if the input the user place matches the correct noodle selection
		noodleDish = input.next();
		switch(noodleDish) {
		case "ITALIAN":
		case "italian":
		case "Italian":
			order = italy.dishChoice("Italian");
			System.out.println("This is your complete " + noodleDish + " noodles order with " + italy.sauceSelector() + " sauce and " + italy.cheeseSelector() + " cheese!");
			System.out.println(t.priceItaly() * t.quantity());
			break;
		case "THAI":
		case "thai":
		case "Thai":
			order = thai.dishChoice("Thai");
			System.out.println("This is your complete " + noodleDish + " noodles order with " + thai.styleSelector() + " style and " + thai.vegetablesSelector() + " for vegetables!");
			System.out.println(t.priceThai() * t.quantity());
			break;
		case "RAMEN":
		case "ramen":
		case "Ramen":
			order = ramen.dishChoice("Ramen");
			System.out.println("This is your complete " + noodleDish + " noodles order with " + ramen.selectBroth() + " broth and " + ramen.selectGarnish() + " for garnish!");
			System.out.println(t.priceRamen() * t.quantity());
			break;
		default: 
			System.out.println("Sorry we don't have that selection of Noodles!");
			}
		return order; 
	}
}
