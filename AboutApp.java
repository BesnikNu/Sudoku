package Main_game;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.beans.BeanProperty;
import java.awt.event.ActionEvent;

public class AboutApp extends JFrame{
	
	public AboutApp() {
		getContentPane().setLayout(null);
		
		JTextArea taInfo = new JTextArea();
		taInfo.setLineWrap(true);
		taInfo.setText("The objective is to solve the randomly generated puzzle by following these rules:\nEach number can appear once in each column and once in each row at the same time.\nThe board is separated in 9 groups of a 3x3 size of individual cells.\nThe same number can also exist once in every 3x3.\nFollowing those rules the player has to fill the empty spaces that are generated.\nOnly once the entire board is filled will the game finish.\nThe goal is to finish as fast as possible.\nHave fun!!");
		taInfo.setEditable(false);
		taInfo.setBounds(20, 5, 400, 200);
		getContentPane().add(taInfo);
		
		JButton btnBack = new JButton("Go Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Program.showIntroduction();
			}
		});
		btnBack.setBounds(170, 216, 100, 30);
		getContentPane().add(btnBack);
	}
	
	@Override
	protected void processWindowEvent(final WindowEvent e) {
        super.processWindowEvent(e);

        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            Program.showIntroduction();
        }
    }
	
}
