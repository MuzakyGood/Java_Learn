public class Main {

	static void ShowArray(int Data[]) {
		for (int i = 0; i < Data.length; i++) {
			System.out.print(Data[i] + ", ");
		}
		System.out.println("");
	}

	static void ShowMatrix(int Data[][]) {
		for (int i = 0; i < Data.length; i++) {
			for (int j = 0; j < Data.length; j++) {
				System.out.print("\t" + Data[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		//Normal Array
		int MyNumber[];
		MyNumber = new int[]{1, 2, 3, 4, 5};

		// Matrix Array or Double Array
		int Tiled[][];
		Tiled = new int[][]{{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}};

		System.out.println("Example Normal Array: ");
		ShowArray(MyNumber);

		System.out.println("Example Double Array:");
		ShowMatrix(Tiled);
	}
}
