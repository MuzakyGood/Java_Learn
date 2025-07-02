import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void DrawData(ArrayList<Integer> Data) {
		for (int i : Data) {
			System.out.print(i + ", ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		ArrayList<Integer> MyData = new ArrayList<Integer>(Arrays.asList(2, 7, 5, 1, 8, 0, 3, 4, 9, 10, 6));

		System.out.print("Number = ");
		DrawData(MyData);

		Collections.sort(MyData);

		System.out.print("Sort Data = ");
		DrawData(MyData);
		System.out.println("Length = " + MyData.size());
	}
}
