package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle ("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);}
	
//		setTitle("NULL CONTAINER SAMPLE");
//		setTitle("GRIDLAYOUT SAMPLE");
//		setTitle("BorderLayout Sample");
//		setTitle("FlowLayout Sample");
		//setTitle("ContentPane과 JFrame");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		GridLayout grid = new GridLayout(4,2);
//		grid.setVgap(5);
		
//		Container c = getContentPane();
//		c.setLayout(null);
		
//		contentPane.setBackground(Color.ORANGE);
//		contentPane.setLayout(new FlowLayout());
		
//		c.setLayout(grid);
//		c.setLayout(new BorderLayout(30,20));
//		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
//		JLabel la = new JLabel("Hello, Press Butons!");
//		c.add(new JLabel("이름"));
//		c.add(new JTextField(""));
//		c.add(new JLabel("학번"));
//		c.add(new JTextField(""));
//		c.add(new JLabel("학과"));
//		c.add(new JTextField(""));
//		c.add(new JLabel("과목"));
//		c.add(new JTextField(""));
//		la.setLocation(130,50);
//		la.setSize(200,20);;
//		c.add(la);
//		
//		for(int i = 1 ; i <=9; i ++) {
//			JButton b = new JButton(Integer.toString(i));
//			b.setLocation(i*15, i*15);
//			b.setSize(50,20);
//			c.add(b);
//		}
//		
//
		
//		c.add(new JButton("CALCULATE"), BorderLayout.CENTER);
//		c.add(new JButton("ADD"), BorderLayout.NORTH);
//		c.add(new JButton("SUB"), BorderLayout.SOUTH);
//		c.add(new JButton("MUL"), BorderLayout.EAST);
//		c.add(new JButton("DIV"), BorderLayout.WEST);
		
//		c.add(new JButton("add"));
//		c.add(new JButton("sub"));
//		c.add(new JButton("mul"));
//		c.add(new JButton("div"));
//		c.add(new JButton("Calculate"));

		
//		contentPane.add(new JButton("OK"));
//		contentPane.add(new JButton("Cancel"));
//		contentPane.add(new JButton("Igonre"));
//		
//		setSize(300 , 200);
//		setVisible(true);
//	}
//
//		public MyFrame () {
//			setTitle("처음 만드는 GUI 프로그램");
//			setSize(300,300);
//			setDefaultCloseOperation(EXIT_ON_CLOSE);
//			setVisible(true);
//			
//		}
	public static void main(String[] args) {
		new MyFrame();
//		MyFrame f = new MyFrame();
	}
}
class MyactionListener implements MyFrame {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("악티온");
		else
			b.setText("Action");
	}
}
