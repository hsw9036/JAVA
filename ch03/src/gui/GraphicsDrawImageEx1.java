package gui;
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame{
	
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx1() {
		setTitle("그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600,600);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/normalIcon.png");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();

	}

}
