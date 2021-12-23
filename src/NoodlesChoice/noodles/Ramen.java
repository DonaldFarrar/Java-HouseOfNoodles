package NoodlesChoice.noodles;
import java.util.*;

public class Ramen extends Noodles{
	
	Scanner input = new Scanner(System.in);
	String broth;
	String garnish;
	

	//constructor for building the dish
	public Ramen(String noodleDish, int numOfOrders, double priceOfDish, String broth, String garnish, String[] noodleSelection) {
		super(noodleDish, noodleSelection);
		this.broth = broth;
		this.garnish = garnish;
		
	}
	
	public Ramen() {
		// TODO Auto-generated constructor stub
	}

	public String dishSelection(Scanner input) {
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		return input1.nextLine(); 
	}
	
	
	//method on choice of broth
	public String selectBroth(){
		Set<String> Broth = new HashSet<>();
		Broth.add("Tonkatsu");
		Broth.add("Miso");
		Broth.add("Shoyu");
		
		System.out.println("\nYour broth selection: ");
		for(String B: Broth) {
			System.out.println(B);
		}
		
		broth = ramen.dishSelection(input);
		System.out.println(broth);
		return broth;
	}
	
	//method on choice of garnish
	public String selectGarnish(){
		Set<String> Garnish = new HashSet<>();
		Garnish.add("Egg");
		Garnish.add("Cha Shiu");
		Garnish.add("Bamboo");
		Garnish.add("Mushrooms");
		Garnish.add("Green Onions");
		Garnish.add("Nori");
		Garnish.add("Black Garlic");
		
		System.out.println("\nYour garnish selection: ");
		for (String G: Garnish) {
			System.out.println(G);
		}
		
		garnish = ramen.dishSelection(input);
		System.out.println(garnish);
		return garnish;
	}
}
