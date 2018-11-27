package extra;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	public static void main(String[] args) {
		new WhackAMole();
	}
	
	public WhackAMole() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.add(panel);
		
	}
}
