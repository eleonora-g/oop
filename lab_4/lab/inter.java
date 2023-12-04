package lab;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class inter {
	public static void main(String[] args) {
		JFrame frame = new JFrame("my frame");
		frame.setLocation(400,400);
		frame.setSize(400,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		frame.add(panel);
		JComboBox<String> box = new JComboBox<String>(my_class.COUNTRIES);
		JTextArea area = new JTextArea();
		area.setText("choose country");
		area.setEditable(false);		
		BoxListener myListener = new BoxListener(box, area);
		box.addActionListener(myListener);
		JCheckBox check = new JCheckBox();
		check.setText("я робот");
		final JTextField name = new JTextField();
		final JTextField greeting = new JTextField();
		greeting.setSize(400,300);
		panel.add(check);
		CheckListener listener = new CheckListener();
		listener.components.add(check);
		check.addActionListener(listener);
		name.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent arg0) {
				greeting.setText("Hello, " + name.getText() + "!");
				greeting.setEditable(false);
		}
	});
		frame.add(name, BorderLayout.CENTER);
		frame.add(greeting, BorderLayout.SOUTH);
		frame.add(box, BorderLayout.NORTH);
		frame.add(area, BorderLayout.WEST);
    	frame.add(check, BorderLayout.EAST);
		frame.setVisible(true);		
	}
}
