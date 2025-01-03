package first;

import java.awt.Color;
import java.awt.color.ColorSpace;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class one {
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		
		label.setText("MY names are ");
		label1.setText("Manando in the game");
		
		label.setBounds(0, 0, 100, 100);
		label1.setBounds(0, 0, 100, 100);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.RED);
		redpanel.setBounds(0, 0, 250, 250);
		redpanel.setLayout(null);
		
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.BLUE);
		bluepanel.setBounds(250, 0, 250, 250);
		bluepanel.setLayout(null);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.GREEN);
		greenpanel.setBounds(0, 250, 250, 250);
		greenpanel.setLayout(null);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.YELLOW);  // Change to yellow
		yellowPanel.setBounds(0, 0, 250, 250);
		yellowPanel.setLayout(null);


		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Oscar");
		
		frame.setSize(750,750);
		frame.setResizable(false);
		frame.setLayout(null);
		
		
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.white);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		
		redpanel.add(label);
		greenpanel.add(label1);
		
	}

}
