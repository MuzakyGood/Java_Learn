public class Main {

	String SetName;
	int SetAge;

	public Main(String Name, int Age) {
		SetName = Name;
		SetAge = Age;
	}

	public void AllLog() {
		System.out.println("Username = " + this.SetName);
		System.out.println("Age	 = " + this.SetAge);
	}

	public static void main(String[] args) {
		Main Zach = new Main("Zach", 23);

		Zach.AllLog();
	}
}
