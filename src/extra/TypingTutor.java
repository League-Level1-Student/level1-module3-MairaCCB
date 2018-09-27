package extra;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TypingTutor {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.setSize(500, 500);
		frame.pack();

	}
	
	char currentLetter;

	currentLetter = generateRandomLetter();

	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}

}
