public class Main {

	static final int POS_X = 5;
	static final int POS_Y = 5;
	static final char DRAW_EMPTY = 0;
	static final char DRAW_ZERO = 48;

	public static void main(String[] args) {
		int backback = POS_X;
		char tiled = DRAW_EMPTY;
		char[][] pattern = new char[POS_Y][POS_X];

		for (int y = 0; y < pattern.length; y++) {
			for (int x = 0; x < pattern[y].length; x++) {
				pattern[y][x] = tiled;
			}
		}

		for (int i = 0; i < 2; i++) {
			pattern[2][i] = 65;

			if (i > 0) pattern[2][i - 1] = tiled;
		}

		for (int i = 0; i < 2; i++) {
			backback -= 1;
			pattern[2][backback] = 66;

			if (backback < 4) pattern[2][backback + 1] = tiled;
		}

		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < pattern[i].length; j++) {
				System.out.print(pattern[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
