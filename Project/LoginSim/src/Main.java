import java.util.Scanner;
import com.dataman.JavaServQuery;

class MyApp {
	private static void drawTitle() {
		System.out.println("\n=====Welcome in Login Simulator=====");
	}

	private static void drawUserProfile(String username) {
		System.out.println("\nUser = " + username);
	}

	private static void drawMainMenu() {
		System.out.println("\nMain Menu:");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("5. Exit");
		System.out.print("Select (exam:1/2/etc): ");
	}

	public void running() {

		int sceneApp = 0;
		String profile = "Guest";

		JavaServQuery jsq = new JavaServQuery();
		Scanner scan = new Scanner(System.in);

		drawTitle();

		while (JavaServQuery.isOpen) {
			drawUserProfile(profile);
			drawMainMenu();
			sceneApp = scan.nextInt();

			switch (sceneApp) {

				case 1:
					int loginhandle = jsq.makeLoginMenu();

					switch (loginhandle) {
						case JavaServQuery.LOGINSUCCESS:
							System.out.println("[App] Login is successfull");
							profile = jsq.getCacheUsername();
						break;

						case JavaServQuery.LOGINFAIL:
							System.out.println("[App] Login is failed!");
						break;

						default:
							System.out.println("[App] Login not confirmed!");
						break;
					}
				break;

				case 2:
					jsq.makeRegisterMenu();
				break;

				case 5:
					scan.close();
					jsq.CleanJSQ();
					JavaServQuery.isOpen = false;
				break;

				default:
					System.out.println("\nInvalid input, Try again.\n");
				break;

			}

		}
	}
}

public class Main {
	public static void main(String[] args) {
		MyApp app = new MyApp();

		app.running();
	}
}
