package ch05;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false ;
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	void finish() {
	flag = true;
	}
	
	public void run () {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("잡아");
			label.setSize(80,30);
			label.setLocation(x,y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if(flag==true) {
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80,30);
					label.setLocation(100,100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return;
				}
			}
			catch(InterruptedException e) {return;}
		}
	}
	
	
}



public class ThreadFinishFlagEx extends JFrame {
	private RandomThread th;
	
	public ThreadFinishFlagEx() {
	 {
		setTitle("Thread Finish Flag Ex 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed (MouseEvent e ) {
				th.finish();
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
	 }		
	}
	 public static void main(String[] args) {
		 new ThreadFinishFlagEx();
	 }
}
	
	
//public class ThreadFinishFlagEx extends JFrame {
//private RandomThread th; // 스레드 레퍼런스
//public ThreadFinishFlagEx() {
//setTitle("ThreadFinishFlagEx 예제");
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Container c = getContentPane();
//c.setLayout(null);
//c.addMouseListener(new MouseAdapter() {
//@Override
//public void mousePressed(MouseEvent e) {
//th.finish(); // RandomThread 스레드 종료 명령
//}
//});
//setSize(300,200);
//setVisible(true);
//th = new RandomThread(c); // 스레드 생성
//th.start(); // 스레드 동작시킴
//}
//public static void main(String[] args) {
//new ThreadFinishFlagEx();
//}
//}
//	
//	
