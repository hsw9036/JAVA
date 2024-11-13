package ch05;

import java.util.Calendar;

import javax.swing.JFrame;


public class CCCCCCCCCCCCCCCCLLOck extends JFrame {
	setTitle("시계만들어");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Contatiner c = getContentPane();
	c.setLayout(null);
	setSize(300,200);
	setVisible(true);
	
}



	public static void main(String[] args) {
		new CCCCCCCCCCCCCCCCLLOck();

	}




Calendar c = Calendar.getInstance();
int hour = c.get(Calendar.HOUR_OF_DAY);
int min = c.get(Calendar.MINUTE);
int sceond = c.get(Calendar.SECOND);

String clockText = Integer.toString(hour);
clockText = clockText.concat(":");
clockText = clockText.concat(Integer.toString(min));
clockText = clockText.concat(":");
clockText = clockText.concat(Integger.toString(second));