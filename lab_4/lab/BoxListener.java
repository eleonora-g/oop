package lab;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class BoxListener implements ActionListener {
	private JComboBox<String> box;
	private JTextArea area;
	public BoxListener(JComboBox<String> box, JTextArea area) {
		this.box = box;
		this.area = area;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int index = box.getSelectedIndex();
		area.setText(my_class.INFORMATION[index]);
	}
}
