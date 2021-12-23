package NoodlesChoice.noodles;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What noodle dish would you like to order?");

		Noodles callNoodles = new Noodles();
		callNoodles.dishSelector();
		
		System.out.println("Enjoy!");
		sc.close();
	}
}
