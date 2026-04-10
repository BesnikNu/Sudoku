package Main_game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWindow extends JFrame{
	
	int diff = 0;
	
	JComboBox cobDiff = new JComboBox();
	
	public FirstWindow() {
		getContentPane().setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lblIntro = new JLabel("Welcome To My Sudoku Game!!");
		lblIntro.setForeground(new Color(51, 102, 255));
		lblIntro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIntro.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntro.setBounds(20, 10, 400, 50);
		getContentPane().add(lblIntro);
		
		JLabel lblBegin = new JLabel("Let's Beggin");
		lblBegin.setForeground(new Color(0, 0, 0));
		lblBegin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBegin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBegin.setBounds(20, 50, 400, 20);
		getContentPane().add(lblBegin);
		
		JPanel pnlDiff = new JPanel();
		pnlDiff.setBounds(20, 80, 400, 40);
		getContentPane().add(pnlDiff);
		pnlDiff.setLayout(null);
		
		JLabel lblDiff = new JLabel("Choose Difficulty");
		lblDiff.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDiff.setBounds(3, 3, 100, 35);
		pnlDiff.add(lblDiff);
		
		
		cobDiff.setModel(new DefaultComboBoxModel(new String[] {"Easy", "Medium", "Hard"}));
		cobDiff.setBounds(103, 7, 290, 25);
		pnlDiff.add(cobDiff);
		
		JButton btnStart = new JButton("Start Game");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = (String) cobDiff.getSelectedItem();
				switch (s) {
					case "Easy" : Program.generatePuzzle(3);
					break;
					case "Medium" : Program.generatePuzzle(4);
					break;
					case "Hard" : Program.generatePuzzle(5);
					break;
				}
				Program.showGame();
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStart.setBounds(150, 131, 150, 30);
		getContentPane().add(btnStart);
		
		JButton btnInfo = new JButton("About Application");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Program.showInfo();
			}
		});
		btnInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnInfo.setBounds(10, 200, 200, 50);
		getContentPane().add(btnInfo);
		
		JButton btnVersion = new JButton("Version");
		btnVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Program.showVersion();
			}
		});
		btnVersion.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVersion.setBounds(226, 200, 200, 50);
		getContentPane().add(btnVersion);
	}
}