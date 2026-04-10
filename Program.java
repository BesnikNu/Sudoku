package Main_game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*	FUTURE CHANGES NOTES
 		1. Make a better GUI.
 			a. Make 3x3 more visible. 
 			b. Better colors.
 			c. Make it so when a player inputs a wrong number, the number is put into that button but it is red. Either display it
 				for a limited time (like 3 seconds) or make an undo or eraser button to be able to remove it.
 			d. Make the tries label to also read Tries: and not only a number. If possible add a heart icon next to it instead. 
 			f. Make better buttons in general. If possible instead of numbers, make it so that it shows some king of image that
 				fills the entire button and is either visible or invisible depending on puzzle generation.
 			g. If you think of anything else by then fine... 
 		2. Make the number selection buttons change to light grey when a number is selected so the player knows which is chosen.
 			Make it normal if unchosen. FIX: When a another number is selected the previous one is still light grey. When there
 			is no more of a number, hide that number button or disable it.
 		3. Make it possible for a number selected on the grid (existing number) highlight all others of the same and highlight
 			the row and column of the button selected.
 		4. Make the game keep scores. Maybe inside a text file. Keep time it took to finish. Maybe arrange by difficulty or make
 			different files for different difficulties.
 		5. After the above are implemented make a better code. Simpler and use better methods cause it is kinda trash right now.
 */

public class Program {
	
	static int windowWidth = 800;
	static int windowHeight = 700;
	
	static int[][] key = new int[9][9];
	
	static int[][] finalPuzzle = new int[9][9];
	
	static int numbersLeft = 0;
	
	static int activeNumber = 0;
	
	static int tries = 5;
	
	static int seconds = 0;
	static int minutes = 0;
	
	static Timer t = new Timer(1000, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			checkSec();
			game.setTime(minutes, seconds);
		}
	});
	
	static FirstWindow firstWindow = new FirstWindow();
	static AboutApp aboutApp = new AboutApp();
	static Version version = new Version();
	static GameWindow game = new GameWindow();
	
	public static void main(String[] args) {
		firstWindow.setVisible(true);
		firstWindow.setSize(450, 350);
		firstWindow.setLocationRelativeTo(null);
		aboutApp.setVisible(false);
		aboutApp.setSize(450, 350);
		aboutApp.setLocationRelativeTo(null);
		version.setVisible(false);
		version.setSize(450, 350);
		version.setLocationRelativeTo(null);
		game.setVisible(false);
		game.setSize(700, 700);
		game.setLocationRelativeTo(null);
		
		setGame();
		
	}
	
	static void showInfo() {
		aboutApp.setVisible(true);
		firstWindow.setVisible(false);
	}
	
	static void showIntroduction() {
		firstWindow.setVisible(true);
		aboutApp.setVisible(false);
	}

	static void showVersion() {
		version.setVisible(true);
		firstWindow.setVisible(false);
	}
	
	static void showGame() {
		game.setupButton(finalPuzzle);
		game.setVisible(true);
		firstWindow.setVisible(false);
		t.start();
	}
	
	static void setGame() {
		PuzzleGenerator puzzle = new PuzzleGenerator();
		key = puzzle.generateBoard();
	}
	
	static void gameReset() {
		firstWindow.setVisible(true);
		game.setVisible(false);
		tries = 5;
		activeNumber = 0;
		game.refreshTries(tries);
		minutes = 0;
		seconds = 0;
	}
	
	public static void generatePuzzle(int d) {
		finalPuzzle = RemoveCells.removedCells(key, d);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(finalPuzzle[i][j] + " ");
			}
			System.out.println();
		}
		setNumbersLeft();
	}
	
	public static void checkTries() {
		if (tries == 0) {
			JOptionPane.showMessageDialog(game, "Game Over...", "You Lost..." ,JOptionPane.ERROR_MESSAGE);
			t.stop();
			gameReset();
		}
	}
	
	public static void playerWon() {
//		** Fix player won window. Maybe you have to override the JOptionPane in order to show a trophy as an image or something
//			like it instead ox a red X or a green check.
		JOptionPane.showMessageDialog(game, "Congratulations, you WIN!!", "You Won" ,JOptionPane.DEFAULT_OPTION);
		t.stop();
		gameReset();
	}
	
	public static void gameStateCheck() {
		numbersLeft--;
		if (numbersLeft < 1) {
			playerWon();
		}
	}
	
	public static void setNumbersLeft() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (finalPuzzle[i][j] == 0) {
					numbersLeft++;
				}
			}
		}
	}
	
	static void checkSec() {
		seconds++;
		if (seconds > 59) {
			seconds = 0;
			minutes++;
		}
	}
	
}
