package com.calculator;
import java.util.Scanner;

class Mathematic {
        protected double Add(int number1, int number2) {
                return number1 + number2;
        }

        protected double Sub(int number1, int number2) {
                return number1 - number2;
        }

        protected double Mull(int number1, int number2) {
                return number1 * number2;
        }

        protected double Div(int number1, int number2) {
                return number1 / number2;
        }
}

class Calc extends Mathematic {

	private int number1 = 0;
	private int number2 = 0;
	protected boolean IsOpen = false;

	private Scanner scn = new Scanner(System.in);

	private Mathematic mtc = new Mathematic();

	protected void CalculatorTitle() {
		System.out.println("\n\t=====Welcome in Calculator=====\n");
	}

	protected void CalculatorMenu() {
		System.out.println("===Math Menu===");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Quit\n");
		System.out.print("Select Menu: ");
	}

	protected void Addition() {
		System.out.print("Number 1 = ");
		this.number1 = this.scn.nextInt();
		System.out.print("Number 2 = ");
		this.number2 = this.scn.nextInt();

		System.out.println("\n" + this.number1 + " + " + this.number2 + " = " + this.mtc.Add(this.number1, this.number2) + "\n");
		this.number1 = 0;
		this.number1 = 0;
	}

	protected void Subtraction() {
		System.out.print("Number 1 = ");
		this.number1 = this.scn.nextInt();
		System.out.print("Number 2 = ");
		this.number2 = this.scn.nextInt();

		System.out.println("\n" + this.number1 + " - " + this.number2 + " = " + this.mtc.Sub(this.number1, this.number2) + "\n");
		this.number1 = 0;
		this.number2 = 0;
	}

	protected void Multiplication() {
		System.out.print("Number 1 = ");
                this.number1 = this.scn.nextInt();
                System.out.print("Number 2 = ");
                this.number2 = this.scn.nextInt();

                System.out.println("\n" + this.number1 + " X " + this.number2 + " = " + this.mtc.Mull(this.number1, this.number2) + "\n");
                this.number1 = 0;
                this.number2 = 0;
	}

	protected void Division() {
		System.out.print("Number 1 = ");
                this.number1 = this.scn.nextInt();
                System.out.print("Number 2 = ");
                this.number2 = this.scn.nextInt();

                System.out.println("\n" + this.number1 + " : " + this.number2 + " = " + this.mtc.Div(this.number1, this.number2) + "\n");
                this.number1 = 0;
                this.number2 = 0;
	}

	protected void CleanCalc() {
		this.scn.close();
	}

}

public class App extends Calc {
	public void running() {

		Calc app = new Calc();

                Scanner scn = new Scanner(System.in);

                app.CalculatorTitle();

                while (!app.IsOpen) {

                        app.CalculatorMenu();

                        int Select = scn.nextInt();

                        switch (Select) {

                                case 1:
					app.Addition();
                                break;

				case 2:
					app.Subtraction();
				break;

				case 3:
					app.Multiplication();
				break;

				case 4:
					app.Division();
				break;

                                case 5:
                                        scn.close();
					app.CleanCalc();
                                        app.IsOpen = true;
                                break;

                                default:
                                        System.out.println("\nInvalid Input, Try Again!");
                                        System.out.println("");
                                break;
                        }

                }
                System.out.println("\nThank You\n");
	}
}
