import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton LButton = new JButton();
	JButton RButton = new JButton();
	
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
		
	}
	
	void makeButtons(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		frame.setTitle("Chuckle Clicker");
		frame.add(panel);
		panel.add(LButton);
		panel.add(RButton);
		LButton.setText("Joke");
		RButton.setText("Punchline");
		LButton.setBackground(Color.BLUE);
		LButton.setOpaque(true);
		
		frame.pack();
		
		LButton.addActionListener(this);
		RButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JButton buttonPressed = (JButton) e.getSource();
		 if(buttonPressed == LButton) {
			 JOptionPane.showMessageDialog(null, "What do you call a fish without eyes?");
			 JOptionPane.showMessageDialog(null, "A fsh.");
		 }
		 
		 else {
			 JOptionPane.showMessageDialog(null, "Hi");
		 }
	}
}
