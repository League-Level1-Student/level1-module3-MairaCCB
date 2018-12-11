
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static Date d;
	static int count = 0;
	static int miss = 0;

	public static void main(String[] args) {
		WhackAMole w = new WhackAMole();
		w.drawButtons();
		d = new Date();
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	Random r = new Random();
	int a;

	public void drawButtons() {
		a = r.nextInt(24);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.add(panel);
		frame.setSize(295, 300);

		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);

			if (a == i) {
				button.setText("mole!");
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		WhackAMole m = new WhackAMole();

		if (buttonPressed.getText() == "mole!") {
			count++;
			frame.dispose();
			m.drawButtons();

		} else {
			speak("you missed");
			miss++;
			frame.dispose();
			m.drawButtons();
		}
		if (count > 10) {
			m.endGame(d, count);
		}

		else if (miss >= 5) {
			speak("Sorry, you lost.");
			m.endGame(d, miss);
		}

	}
}