import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void DrawData(Set<String> Data) {
		int i = 0;
		for (String data : Data) {
			System.out.println(i + "." + data);
			i += 1;
		}
	}

	public static void main(String[] args) {
		Set<String> database = new HashSet<>();

		database.add("David");
		database.add("Evan");
		database.add("Adam");
		database.add("Micheal");
		database.add("Hans");

		DrawData(database);
	}

}
