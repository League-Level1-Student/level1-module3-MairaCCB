import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	public static void main(String[] args) {
		new NastySurprise().createUI();
	}
	
	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setTitle("Trick or Treat");
		panel.add(BTrick);
		panel.add(label);
		panel.add(BTreat);
		label.setText("or");
		BTrick.setText("Trick!");
		BTreat.setText("Treat!");
		frame.pack();
		
		BTrick.addActionListener(this);
		BTreat.addActionListener(this);
		
	}

	JButton BTrick = new JButton();
	JButton BTreat = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = ;
		// TODO Auto-generated method stub
		if(buttonPressed == BTrick) {
			showPictureFromTheInternet("");
		}
		
		else{
			
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	
}
	


