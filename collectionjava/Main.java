import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void PrintList(List<String> Data) {
		for (int i = 0; i < Data.size(); i++) {
			System.out.println(i + "." + Data.get(i));
		}
	}

	public static void main(String[] args) {
		List<String> Item = new ArrayList<>();

		Item.add("Knive");
		Item.add("Medkit");
		Item.add("Jewel");
		Item.add("Pistol");
		Item.add("None");

		System.out.println("Data Before:");

		PrintList(Item);

		Item.remove("Pistol");

		System.out.println("\nData Update:");

		PrintList(Item);
	}

}
