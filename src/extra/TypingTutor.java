package extra;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		TypingTutor t = new TypingTutor();
		t.setup();
	}
	
	public void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.pack();
		panel.add(label);
		label.setText(currentLetter + "");
		
		frame.addKeyListener(this);
		
		currentLetter = generateRandomLetter();
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
	}
	
	char currentLetter;
	
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	      
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
