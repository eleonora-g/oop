package lab_2;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JTextField;

public class App {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(0,3));
		final JComboBox<String> operationCoffee = new JComboBox<String>(new String[] {"напиток", "латте", "капучино", "раф", "американо"});
		final JComboBox<String> operationCombo = new JComboBox<String>(new String[] {"сахар", "нет", "1", "2", "заменитель"});
		final JComboBox<String> operationSl = new JComboBox<String>(new String[] {"молоко", "обычное", "альтернативное"});
		final JComboBox<String> operationSk = new JComboBox<String>(new String[] {"чашек", "1", "2", "3"});
		
		final JButton calculateButton = new JButton("цена??");
		final JTextField resultField = new JTextField("          ");

		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				if (operationCoffee.getSelectedItem().equals("латте")) {
					result = 100;
				} else if (operationCoffee.getSelectedItem().equals("капучино")) {
					result = 110;
				}  else if (operationCoffee.getSelectedItem().equals("раф")) {
					result = 150;
				}  else if (operationCoffee.getSelectedItem().equals("американо")) {
					result = 90;
					if (operationSl.getSelectedItem().equals("молоко")) {
						result += 20;
				} }
				
				if (operationCombo.getSelectedItem().equals("заменитель")) {
					result += 20;
				} else if (operationCombo.getSelectedItem().equals("1")) {
					result += 5;
				} else if (operationCombo.getSelectedItem().equals("2")) {
					result += 10;
				}
				
				if (operationSl.getSelectedItem().equals("альтернативное")) {
					result += 50;
				} else {}
				
				if (operationSk.getSelectedItem().equals("2")) {
					result = result * 2;
				} else if (operationSk.getSelectedItem().equals("3")) {
					result = result * 3;
				}
				
				
				
				resultField.setText(String.valueOf(result));
			}
			});
	
		frame.add(operationCoffee);
		frame.add(operationCombo);
		frame.add(operationSl);
		frame.add(operationSk);
		frame.add(calculateButton);
		frame.add(resultField);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,350);
		frame.setLocation(500, 500);
		frame.setTitle("Frame");
		frame.setVisible(true);
		
	
}}

