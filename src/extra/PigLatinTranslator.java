package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);
	JButton button = new JButton();
	
	public static void main(String[] args) {
		new PigLatinTranslator();
	}
	
	public PigLatinTranslator() {
		frame.setVisible(true);
		frame.setTitle("Pig Latin Translator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setText("Translate");
		panel.add(field1);
		panel.add(button);
		panel.add(field2);
		frame.add(panel);
		frame.pack();
	}
}
