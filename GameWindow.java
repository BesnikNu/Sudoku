package Main_game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameWindow extends JFrame {
	
	/*
		Distance between buttons: 5px
		Distance between buttons and boarder: 10px
		Inner panel size: 600 width and height to fit 9 buttons
	*/
	String time = "Time: ";
	
	JLabel lblTries = new JLabel();
	
	JLabel lblTimer = new JLabel();
	
	customButton[][] buttonArray = new customButton[9][9];
	
	public GameWindow() {
		
		int horSpace = 10;
		int verSpace = 10;
		
		setTitle("Sudoku Alpha 0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 5, 650, 30);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblTimer.setText("Time: 00:00");
		lblTimer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTimer.setBounds(10, 1, 100, 28);
		panel.add(lblTimer);
		
		lblTries.setText(Program.tries + "");
		lblTries.setBounds(549, 1, 50, 28);
		panel.add(lblTries);
		
		JPanel board = new JPanel();
		board.setBounds(65, 46, 600, 600);
		getContentPane().add(board);
		board.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 46, 45, 600);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton numberOne = new JButton();
		numberOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 1) {
					Program.activeNumber = 0;
					numberOne.setBackground(null);
				} else {
					Program.activeNumber = 1;
					numberOne.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberOne.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberOne.setBounds(0, 5, 45, 40);
		panel_1.add(numberOne);
		
		JButton numberTwo = new JButton("2");
		numberTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 2) {
					Program.activeNumber = 0;
					numberTwo.setBackground(null);
				} else {
					Program.activeNumber = 2;
					numberTwo.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberTwo.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberTwo.setBounds(0, 50, 45, 40);
		panel_1.add(numberTwo);
		
		JButton numberThree = new JButton("3");
		numberThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 3) {
					Program.activeNumber = 0;
					numberThree.setBackground(null);
				} else {
					Program.activeNumber = 3;
					numberThree.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberThree.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberThree.setBounds(0, 95, 45, 40);
		panel_1.add(numberThree);
		
		JButton numberFour = new JButton("4");
		numberFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 4) {
					Program.activeNumber = 0;
					numberFour.setBackground(null);
				} else {
					Program.activeNumber = 4;
					numberFour.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberFour.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberFour.setBounds(0, 140, 45, 40);
		panel_1.add(numberFour);
		
		JButton numberFive = new JButton("5");
		numberFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 5) {
					Program.activeNumber = 0;
					numberFive.setBackground(null);
				} else {
					Program.activeNumber = 5;
					numberFive.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberFive.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberFive.setBounds(0, 185, 45, 40);
		panel_1.add(numberFive);
		
		JButton numberSix = new JButton("6");
		numberSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 6) {
					Program.activeNumber = 0;
					numberSix.setBackground(null);
				} else {
					Program.activeNumber = 6;
					numberSix.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberSix.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberSix.setBounds(0, 230, 45, 40);
		panel_1.add(numberSix);
		
		JButton numberSeven = new JButton("7");
		numberSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 7) {
					Program.activeNumber = 0;
					numberSeven.setBackground(null);
				} else {
					Program.activeNumber = 7;
					numberSeven.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberSeven.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberSeven.setBounds(0, 275, 45, 40);
		panel_1.add(numberSeven);
		
		JButton numberEight = new JButton("8");
		numberEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 8) {
					Program.activeNumber = 0;
					numberEight.setBackground(null);
				} else {
					Program.activeNumber = 8;
					numberEight.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberEight.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberEight.setBounds(0, 321, 45, 40);
		panel_1.add(numberEight);
		
		JButton numberNine = new JButton("9");
		numberNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Program.activeNumber == 9) {
					Program.activeNumber = 0;
					numberNine.setBackground(null);
				} else {
					Program.activeNumber = 9;
					numberNine.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		numberNine.setFont(new Font("Tahoma", Font.BOLD, 11));
		numberNine.setBounds(0, 369, 45, 40);
		panel_1.add(numberNine);
		
		//Creates all buttons and sets their coordinates and listeners
		try {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				final int row = i;
				final int col = j;
				buttonArray[i][j] = new customButton("");
				buttonArray[i][j].row = row;
				buttonArray[i][j].col = col;
				buttonArray[i][j].setFont(new Font("Tahoma", Font.BOLD, 14));
				buttonArray[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						buttonArray[row][col].printCords();
						if (!buttonArray[row][col].isFilled) {
							if (Program.key[row][col] == Program.activeNumber) {
								buttonArray[row][col].setText(Program.activeNumber + "");
								buttonArray[row][col].isFilled = true;
								buttonArray[row][col].value = Program.activeNumber;
								Program.gameStateCheck();
							} else {
								Program.tries--;
								refreshTries(Program.tries);
								Program.checkTries();
							}
						}
					}
				});
				buttonArray[i][j].setBounds(horSpace, verSpace, 60, 60);
				board.add(buttonArray[i][j]);
				
				horSpace += 65;
				
			}
			verSpace += 65;
			horSpace = 10;
		}
		} catch (Exception e) {
			
		}
		
	}
	
	//Sets up buttons fields after the key and puzzle are created
	public void setupButton(int[][] a) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				String s = "";
				if (a[i][j] != 0) {
					s += a[i][j];
					buttonArray[i][j].isFilled = true;
					buttonArray[i][j].value = a[i][j];
				}
				buttonArray[i][j].setText(s);
			}
		}
	}
	
	public void refreshTries(int t) {
		this.lblTries.setText(t + "");
	}
	
	public void checkBoard() {
		/*for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (!buttonArray[i][j].isFilled) {
					return;
				} else {
					Program.playerWon();
				}
			}
		}*/
	}
	
	public void setTime(int m, int s) {
		String min = "";
		String sec = "";
		
		if (m < 10) {
			min = "0" + m;
		} else {
			min = m + "";
		}
		
		if (s < 10) {
			sec = "0" + s;
		} else {
			sec = s + "";
		}
		
		lblTimer.setText(time + min + ":" + sec);
	}
	
}