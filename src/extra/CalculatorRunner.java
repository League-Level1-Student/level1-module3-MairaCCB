package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorRunner implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	

	public CalculatorRunner() {
		// TODO Auto-generated constructor stub
		frame.setVisible(true);
		frame.setTitle("Simple Calculator");
		frame.add(label);
		label.add(button1);
		label.add(button2);
		label.add(button3);
		label.add(button4);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

//button1.addActionListener(this);
//button2.addActionListener(this);
//button3.addActionListener(this);
//button4.addActionListener(this);