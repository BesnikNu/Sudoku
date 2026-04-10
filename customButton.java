package Main_game;

import javax.swing.Action;
import javax.swing.JButton;

public class customButton extends JButton{

	public int row;
	public int col;
	
	public int value;
	
	public boolean isFilled;
	
	public customButton() {
		super();
	}
	
	public customButton(String s) {
		super(s);
	}
	
	public customButton(Action a) {
        this();
        setAction(a);
    }
	
	public customButton(int r, int c) {
		this.row = r;
		this.col = c;
	}
	
	public void printCords() {
		System.out.println(this.row + " " + this.col);
	}
	
}
