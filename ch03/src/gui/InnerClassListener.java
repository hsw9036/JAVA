package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame{
	private JLabel la = new JLabel("Hello");	
	public InnerClassListener() {
//		setTitle("Action 이벤트 릿슨어 작성");
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
//		c.setLayout(new FlowLayout());
//		JButton btn = new JButton("Action");
//		c.add(btn);
		
//		btn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			JButton b = (JButton)e.getSource();
//			if(b.getText().equals("Action"))
//				b.setText("악티온");
//			else
//				b.setText("Action");
//			setTitle(b.getText());
//			}
//		});
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		setSize(250,250);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	

	public static void main(String[] args) {
		new InnerClassListener();

	}

}
