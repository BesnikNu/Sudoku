package Main_game;

import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Version extends JFrame{
	public Version() {
		getContentPane().setLayout(null);
		
		JTextArea txtrThisAppWas = new JTextArea();
		txtrThisAppWas.setEditable(false);
		txtrThisAppWas.setLineWrap(true);
		txtrThisAppWas.setText("This app was made by Besnik Nuredini.\r\nIt was made using Eclipse IDE and WindowBuilder an Eclipse Add on.\r\nAll rights reserved.\nVersion 1.0 Alpha.");
		txtrThisAppWas.setBounds(20, 5, 400, 250);
		getContentPane().add(txtrThisAppWas);
	}
	
	@Override
	protected void processWindowEvent(final WindowEvent e) {
        super.processWindowEvent(e);

        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            Program.showIntroduction();
        }
    }

}
