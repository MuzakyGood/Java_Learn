package zmath.util;

public class SizeData {
	public void DataCount(int Range) {
		for (int i = 0; i <= (int)Range; i++) {
			System.out.println("\t" + (int)Math.pow(2, (double)i));
		}
	}
}
