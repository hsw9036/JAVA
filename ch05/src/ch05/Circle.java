package ch05;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class MyPanel extends JPanel {
    private int x, y;
    private static final int DIAMETER = 50;
    private Timer timer;
    private Random random = new Random();

    public MyPanel() {
        // 초기 위치를 무작위로 설정
        x = random.nextInt(400 - DIAMETER);
        y = random.nextInt(400 - DIAMETER);

        // 타이머 설정: 0.5초(500ms)마다 원의 위치를 갱신
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = random.nextInt(getWidth() - DIAMETER);
                y = random.nextInt(getHeight() - DIAMETER);
                repaint(); // 패널을 다시 그려서 원의 위치를 업데이트
            }
        });

        // 마우스 클릭 시 타이머 시작
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!timer.isRunning()) {
                    timer.start();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }
}

public class Circle {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Circle App");
        MyPanel panel = new MyPanel();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(panel); // MyPanel을 컨텐트팬으로 설정
        frame.setVisible(true);
    }
}
