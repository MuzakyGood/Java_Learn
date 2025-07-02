import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner UserInput = new Scanner(System.in);
	int Num1;
	int Num2;
	int NumResults;
	String Username;

	System.out.print("Username: ");
	Username = UserInput.nextLine();

	System.out.println("\nWelcome in Java First Calculator");
	System.out.println("1. Add");

	System.out.print("Number 1: ");
	Num1 = UserInput.nextInt();

	System.out.print("\nNumber 2: ");
	Num2 = UserInput.nextInt();

	NumResults = Num1 + Num2;
	System.out.println("Results is " + NumResults);
	System.out.println("Thank you," + Username);

	UserInput.close();
	}
}
