package extra;

import javax.swing.JButton;
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
		frame.setSize(500, 500);
		
		for(int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
		}
		
		
		
	}
}
