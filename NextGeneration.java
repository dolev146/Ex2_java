
public class NextGeneration {

	public static boolean[][] nextGeneration(boolean[][] cells) {
		int M = cells.length;
		int N = cells[0].length;

		boolean[][] booleanGrid = new boolean[M][N];

		for (int i = 0; i < booleanGrid.length; i++)
			for (int j = 0; j < booleanGrid[i].length; j++)
				booleanGrid[i][j] = cells[i][j];

		int[][] integerGrid = new int[M][N];

		for (int i = 0; i < booleanGrid.length; i++) {
			for (int j = 0; j < booleanGrid[i].length; j++) {
				if (booleanGrid[i][j] == false) {
					integerGrid[i][j] = 0;
				}

				else {
					integerGrid[i][j] = 1;
				}

			}

		}

		int[][] future = new int[M][N];
		boolean[][] futureBoolean = new boolean[M][N];

		for (int l = 1; l < M - 1; l++) {
			for (int m = 1; m < N - 1; m++) {

				int aliveNeighbours = 0;
				for (int i = -1; i <= 1; i++)
					for (int j = -1; j <= 1; j++)
						aliveNeighbours += integerGrid[l + i][m + j];

				aliveNeighbours -= integerGrid[l][m];

				if ((integerGrid[l][m] == 1) && (aliveNeighbours < 2))
					future[l][m] = 0;

				else if ((integerGrid[l][m] == 1) && (aliveNeighbours > 3))
					future[l][m] = 0;

				else if ((integerGrid[l][m] == 0) && (aliveNeighbours == 3))
					future[l][m] = 1;

				else
					future[l][m] = integerGrid[l][m];

			}
		}

		System.out.println("Next Generation");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (future[i][j] == 0) {
					System.out.print("-");
					futureBoolean[i][j] = false;
				}

				else {
					System.out.print("*");
					futureBoolean[i][j] = true;
				}

			}
			System.out.println();
		}

		return futureBoolean;
	}

}
