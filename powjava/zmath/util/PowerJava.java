package zmath.util;

public class PowerJava {

	private double Num1 = 0;
	private double Num2 = 0;

	public PowerJava(double Number1, double Number2) {
		this.Num1 = Number1;
		this.Num2 = Number2;
	}

	public int Power(double Number1, double Number2) {
		this.Num1 = Number1;
		this.Num2 = Number2;
		return (int)Math.pow(this.Num1, this.Num2);
	}

	public int OncePower() {
		return (int)Math.pow(this.Num1, this.Num2);
	}

}
