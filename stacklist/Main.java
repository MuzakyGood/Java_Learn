import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> data = new Stack<>();

		System.out.println("Input data to stack");

		for (int i = 0; i <= 5; i++) {
			data.push(i);
		}

		while (!data.empty()) {
			System.out.println(data);
			data.pop();
		};
	}
}
