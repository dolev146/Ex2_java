
import java.awt.Color;

public class GameOfLife {

	public static boolean[][] rand_mat(int n) {
		boolean[][] mat = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = Math.random() > 0.5;
			}
		}
		return mat;
	}

	public static void main(String[] args) {

		GameOfLife.gameOfLife(240, 10);

	}

	public static void gameOfLife(int n, int cellSize) {

		if (cellSize < 1) {
			throw new IllegalArgumentException("cellSize must be a positive value");
		}
		if (n < 1) {
			throw new IllegalArgumentException("n must be a positive value");
		}
		if (n < cellSize) {
			throw new IllegalArgumentException("n must be a Bigger than cellSize");
		}

		boolean[][] net = new boolean[(n / (cellSize * 2))][(n / (cellSize * 2))];

		StdDraw.setYscale(0, n / 2);
		StdDraw.setXscale(0, n / 2);
		StdDraw.setPenColor(StdDraw.BLACK);

		for (int i = 0; i < net.length; i++) {
			for (int j = 0; j < net[i].length; j++) {
				double p = i * cellSize + (double) cellSize / 2;
				double q = j * cellSize + (double) cellSize / 2;

				StdDraw.square(p, q, (double) cellSize / 2);

			}
		}

		boolean[][] boo = new boolean[(n / cellSize)][(n / cellSize)];
		boo = rand_mat(n / cellSize);

		GameOfLife.drawCells(boo, cellSize, Color.magenta);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			GameOfLife.drawCells(boo, cellSize, Color.WHITE);

			boo = NextGeneration.nextGeneration(boo);
			GameOfLife.drawCells(boo, cellSize, Color.MAGENTA);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void drawCells(boolean[][] cells, int cellSize, Color color) {

		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells.length; j++) {
				StdDraw.setPenColor(color);
				if (cells[i][j]) {
					double p = i * cellSize + (double) cellSize / 2;
					double q = j * cellSize + (double) cellSize / 2;

					StdDraw.filledSquare(p, q, (double) cellSize / 2);

					StdDraw.setPenColor(Color.BLACK);
					StdDraw.square(p, q, (double) cellSize / 2);
				}

			}
		}
	}

}
