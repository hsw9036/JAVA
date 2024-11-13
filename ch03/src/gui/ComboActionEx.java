package gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//
//public class ComboActionEx extends JFrame{
//	
//	private String [] fruits = {"apple", "banana", "kiwi", "mango"};
//	private ImageIcon [] images = { new ImageIcon("images/3.jpg"),
//			new ImageIcon("images/mormalIcon.jpg"),
//			new ImageIcon("images/pressedIcon.jpg"),
//			new ImageIcon("images/rolloverIcon.jpg")};
//	private JLabel imagLabel = new JLabel(images[0]);
//	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
//	
//	public ComboActionEx() {
//		setTitle("콤 활 예");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		c.add(strCombo);
//		c.add(imagLabel);
//		
//		strCombo.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JComboBox<String>cb = (JComboBox<String>)e.getSource();
//				int index = cb.getSelectedIndex();
//				imagLabel.setIcon(images[index]);
//			}
//		});
//		setSize(300,250);
//		setVisible(true);
//	}
//	public static void main(String[] args) {
//		new ComboActionEx();
//
//	}
//
//}


public class ComboActionEx extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon [] images = { new ImageIcon("images/pressedIcon.png"),
													new ImageIcon("images/3.png"),
													new ImageIcon("images/normalIcon.png"),
													new ImageIcon("images/rolloverIcon.png")};
	private JLabel imgLabel = new JLabel(images[0]); 
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);

	public ComboActionEx() {
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);

		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ComboActionEx();
	}
}