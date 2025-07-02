class App {
	public boolean AppOpen;
}

class Player extends App {

	App open = new App();

	public String Username(String Name) {
		return Name;
	}

	public boolean AppIsOpen() {
		open.AppOpen = false;
		return open.AppOpen;
	}
}

public class Main extends Player {

	public static void ClearScreen() {
    		System.out.print("\033[H\033[2J");
    		System.out.flush();
	}

	public static void main(String[]args) {
		Player Zach = new Player();

		ClearScreen();

		System.out.println("Username = " + Zach.Username("Zach Noland"));
		System.out.println("App Status = " + Zach.AppIsOpen());
	}
}
