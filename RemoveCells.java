package Main_game;

import java.util.Random;

public class RemoveCells {
	
	static int[][] finalPuzzle = new int[9][9];
	
	static int diff = 0;
	
	static Random remove = new Random();

	public static int[][] removedCells(int[][] key, int d){	
		diff = d;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int r = remove.nextInt(diff);
				if (r > 1) {
					finalPuzzle[i][j] = 0;
				} else {
					finalPuzzle[i][j] = Integer.valueOf(key[i][j]);
				}
			}
		}
		return finalPuzzle;
	}
	
	void setDiff(int d) {
		diff = d;
	}
		
}
