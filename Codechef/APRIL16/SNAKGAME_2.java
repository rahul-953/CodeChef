import java.io.*;
import java.util.Arrays;
import java.util.*;

class SNAKGAME_2 {

	static long MOD = 1000000000 + 7;
	static int n, m;
	static int head_x = 0, head_y = 0, tail_x = 0, tail_y = 0;
	static int countRow[];
	static int countCol[];

	public static void main(String arg[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k;
		int x, y;
		int i, j;
		String text[];

		text = br.readLine().split(" ");
		n = Integer.parseInt(text[0]);
		m = Integer.parseInt(text[1]);
		k = Integer.parseInt(text[2]);

		int BOARD[][] = new int[n][m];
		countRow = new int[n];
		countCol = new int[m];
		boolean isGameOver = true;

		while (k-- > 0) {
			text = br.readLine().split(" ");
			x = Integer.parseInt(text[0]);
			y = Integer.parseInt(text[1]);
			BOARD[x - 1][y - 1] = 1;
		}

		for (i = 0; i < n; i++) {
			int tempCount = 0;
			for (j = 0; j < m; j++) {
				if (BOARD[i][j] != 1)
					tempCount++;
			}
			countRow[i] = tempCount;
		}

		for (i = 0; i < m; i++) {
			int tempCount = 0;
			for (j = 0; j < n; j++) {
				if (BOARD[j][i] != 1)
					tempCount++;
			}
			countCol[i] = tempCount;
		}

		for (i = 0; i < n && isGameOver; i++) {
			for (j = 0; j < m; j++) {
				if (BOARD[i][j] != 1) {
					tail_x = head_x = i;
					tail_y = head_y = j;
					isGameOver = false;
					break;
				}
			}
		}

		System.out.println("NEW " + (head_x + 1) + " " + (head_y + 1));
		countRow[head_x]--;
		countCol[head_y]--;

		BOARD[head_x][head_y] = 1;
		isGameOver = false;

		while (!isGameOver) {
			text = br.readLine().split(" ");
			System.out.flush();
			if (text[0].equals("FREEZE")) {
				isGameOver = move_my_turn(BOARD, isGameOver);
				System.out.flush();
				continue;
			} else if (text[0].equals("MOVE")) {
				x = Integer.parseInt(text[3]);
				y = Integer.parseInt(text[4]);
				BOARD[x - 1][y - 1] = 1;
			} else if (text[0].equals("NEW")) {
				x = Integer.parseInt(text[1]);
				y = Integer.parseInt(text[2]);
				BOARD[x - 1][y - 1] = 1;
			} else if (text[0].equals("EXIT")) {
				isGameOver = true;
				break;
			}

			isGameOver = move_my_turn(BOARD, isGameOver);
			System.out.flush();
		}
	}

	public static boolean move_my_turn(int BOARD[][], boolean isGameOver) {

		int i, j;
		if (head_y + 1 < m && BOARD[head_x][head_y + 1] != 1) {
			System.out.println("MOVE " + (head_x + 1) + " " + (head_y + 1) + " " + (head_x + 1) + " " + (head_y + 2));
			BOARD[head_x][head_y + 1] = 1;
			head_y += 1;

			countCol[head_y]--;
			countRow[head_x]--;

		} else if (head_y - 1 >= 0 && BOARD[head_x][head_y - 1] != 1) {
			System.out.println("MOVE " + (head_x + 1) + " " + (head_y + 1) + " " + (head_x + 1) + " " + (head_y));
			BOARD[head_x][head_y - 1] = 1;
			head_y -= 1;
			countCol[head_y]--;
			countRow[head_x]--;

		} else if (head_x + 1 < n && BOARD[head_x + 1][head_y] != 1) {
			System.out.println("MOVE " + (head_x + 1) + " " + (head_y + 1) + " " + (head_x + 2) + " " + (head_y + 1));
			BOARD[head_x + 1][head_y] = 1;
			head_x += 1;
			countCol[head_y]--;
			countRow[head_x]--;

		} else if (head_x - 1 >= 0 && BOARD[head_x - 1][head_y] != 1) {
			System.out.println("MOVE " + (head_x + 1) + " " + (head_y + 1) + " " + (head_x) + " " + (head_y + 1));
			BOARD[head_x - 1][head_y] = 1;
			head_x -= 1;
			countCol[head_y]--;
			countRow[head_x]--;

		} else if (tail_y + 1 < m && BOARD[tail_x][tail_y + 1] != 1) {
			System.out.println("MOVE " + (tail_x + 1) + " " + (tail_y + 1) + " " + (tail_x + 1) + " " + (tail_y + 2));
			BOARD[tail_x][tail_y + 1] = 1;
			tail_y += 1;

			countCol[tail_y]--;
			countRow[tail_x]--;

		} else if (tail_y - 1 >= 0 && BOARD[tail_x][tail_y - 1] != 1) {
			System.out.println("MOVE " + (tail_x + 1) + " " + (tail_y + 1) + " " + (tail_x + 1) + " " + (tail_y));
			BOARD[tail_x][tail_y - 1] = 1;
			tail_y -= 1;

			countCol[tail_y]--;
			countRow[tail_x]--;

		} else if (tail_x + 1 < n && BOARD[tail_x + 1][tail_y] != 1) {
			System.out.println("MOVE " + (tail_x + 1) + " " + (tail_y + 1) + " " + (tail_x + 2) + " " + (tail_y + 1));
			BOARD[tail_x + 1][tail_y] = 1;
			tail_x += 1;

			countCol[tail_y]--;
			countRow[tail_x]--;

		} else if (tail_x - 1 >= 0 && BOARD[tail_x - 1][tail_y] != 1) {
			System.out.println("MOVE " + (tail_x + 1) + " " + (tail_y + 1) + " " + (tail_x) + " " + (tail_y + 1));
			BOARD[tail_x - 1][tail_y] = 1;
			tail_x -= 1;

			countCol[tail_y]--;
			countRow[tail_x]--;

		} else {
			boolean more = true;
			int row = 0, col = 0;
			int index_row = 0, index_col = 0;

			for (i = 0; i < n; i++) {
				if (countRow[i] > row) {
					index_row = i;
					row = countRow[i];
				}
			}

			for (i = 0; i < m; i++) {
				if (countCol[i] > col) {
					index_col = i;
					col = countCol[i];
				}
			}

			if (row > col) {
				for (i = 0; i < m; i++) {
					if (BOARD[index_row][i] != 1) {
						head_x = tail_x = index_row;
						head_y = tail_y = i;
						more = false;
						BOARD[head_x][head_y] = 1;
						System.out.println("NEW " + (head_x + 1) + " " + (head_y + 1));
						break;
					}
				}
			} else {
				for (i = 0; i < n; i++) {
					if (BOARD[i][index_col] != 1) {
						head_x = tail_x = i;
						head_y = tail_y = index_col;
						more = false;
						BOARD[head_x][head_y] = 1;
						System.out.println("NEW " + (head_x + 1) + " " + (head_y + 1));
						break;
					}
				}
			}

			if (more) {
				isGameOver = true;
				System.out.println("EXIT");
			}
		}
		return isGameOver;
	}
}
