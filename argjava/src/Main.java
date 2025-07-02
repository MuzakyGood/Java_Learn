public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				if (args[i].equals("--version")) {
					System.out.println("FirstArgs v1.0.0");
				}
			}
			System.out.println("\n[" + i + "] = " + args[i]);
		}
	}
}
