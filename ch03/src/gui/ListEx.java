package gui;
import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	private String [] fruits= {"apple", "banana", "kiwi", "mango", "pear",
									"peach", "berry", "strawberry", "blackberry"};
	private ImageIcon [] images = { 
									new ImageIcon("images/normalIcon.png"),
									new ImageIcon("images/pressedIcon.png"),
									new ImageIcon("images/rolloverIcon.png"),
									new ImageIcon("images/rolloverIcon.png") };
	public ListEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);

		JList<ImageIcon> imageList = new JList<ImageIcon>(); 
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits); 
		c.add(new JScrollPane(scrollList)); 

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ListEx();
	}
}