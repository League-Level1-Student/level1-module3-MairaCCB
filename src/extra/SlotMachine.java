package extra;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel ll = new JLabel();
	JLabel lm = new JLabel();
	JLabel lr = new JLabel();
	JButton bl = new JButton();
	JButton bm = new JButton();
	JButton br = new JButton();
	
	public static void main(String[] args) {
		SlotMachine s = new SlotMachine();
		s.createUI(); 
	}
	
	public void createUI() {
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.add(ll);		
		p.add(lm);
		p.add(lr);
		//lime
		showPictureFromTheInternet("https://vignette.wikia.nocookie.net/lotrminecraftmod/images/4/4a/Lime.jpg/revision/latest?cb=20151108082042");
		//orange
		showPictureFromTheInternet("http://demo.ballyhoocommerce.co.uk/media/productimages/32_main.jpg");
		//cherry
		showPictureFromTheInternet("https://vignette.wikia.nocookie.net/fruit/images/6/64/Orchard-Cherry.jpg/revision/latest?cb=20140805131428");
		p.add(bl);
		p.add(bm);
		p.add(br);
		f.add(p);
		f.pack();
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          imageLabel.setSize(200,200);
	          //JFrame frame = new JFrame();
	          p.add(imageLabel);
	          p.setVisible(true);
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
}
