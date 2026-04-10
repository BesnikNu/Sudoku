package Main_game;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PuzzleGenerator {
	
	//puzzle board
	public int[][] board = new int[9][9];
	
	//RNG
	public Random RNG = new Random();
	
	//starts process 
	public int[][] generateBoard() {
		fillCells(0);
		return board;
	}
	
	//fills all cells
	public boolean fillCells(int index) {
		if (index == 81) {
			return true;
		}
		
		int row = index / 9;
		int col = index % 9;
		
		List<Integer> numbers = shuffleNumbers();
		
		for (int num : numbers) {
			if (isValid(row, col, num)) {
				board[row][col] = num;
				
				if (fillCells(index + 1)) {
					return true;
				}
			}
			board[row][col] = 0;
		}
		
		return false;
	}
	
	//creates a 3x3 group with randomly ordered numbers
	public List<Integer> shuffleNumbers() {
		List<Integer> nums = new ArrayList();
		for (int i = 1; i <= 9; i++) {
			nums.add(i);
		}
		Collections.shuffle(nums);
		return nums;
	}
	
	//checks cells
	public boolean isValid(int row, int col, int num) {
		
		//checks row for the same number
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == num) {
				return false;
			}
		}
		
		//checks col for the same number
		for (int i = 0; i < 9; i++) {
			if (board[i][col] == num) {
				return false;
			}
		}
		
		//int to check in the same 3x3 group
		int groupRow = row - row %3;
		int groupCol = col - col %3;
		
		//checks the group if is valid
		for (int r = groupRow; r < groupRow + 3; r++) {
			for (int c = groupCol; c < groupCol + 3; c++) {
				if (board[r][c] == num) {
					return false;
				}
			}
		}
		
		//if all ok true
		return true;
		
	}
	
	void printBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
