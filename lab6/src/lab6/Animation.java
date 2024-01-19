package lab6;

import javax.swing.*;
import java.awt.*;


public class Animation {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setTitle("Круги");
		frame.setLayout(new GridLayout());
		

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		frame.add(panel);
		
		frame.setVisible(true);
		
		Ball ball1 = new Ball(panel, 60, 60, 3f, 6f, 30);
		ball1.setColor(Color.PINK);
		Ball ball2 = new Ball(panel, 50, 100, 3f, -9f, 20);
		Ball ball3 = new Ball(panel, 200, 150, -8f, -10f, 60);
		ball3.setColor(Color.RED);
		
		ball1.start();
		ball2.start();
		ball3.start();
	}
}