package gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		setTitle ("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);}
	
	public static void main(String[] args) {
		new MyFrame();
//		MyFrame f = new MyFrame();
	}
}
class MyactionListener implements IndepClassListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("악티온");
		else
			b.setText("Action");
	}
}
