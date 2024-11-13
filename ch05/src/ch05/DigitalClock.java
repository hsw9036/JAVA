package ch05;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock extends JFrame {
    private JLabel clockLabel;

    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        clockLabel = new JLabel("", SwingConstants.CENTER);
        clockLabel.setFont(new Font("Serif", Font.BOLD, 30));
        clockLabel.setForeground(Color.BLUE);
        add(clockLabel);

        // 1초마다 현재 시간을 업데이트
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });
        timer.start();
    }

    private void updateClock() {
        // 현재 시간 가져오기
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String clockText = now.format(formatter);
        
        clockLabel.setText(clockText);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DigitalClock clock = new DigitalClock();
            clock.setVisible(true);
        });
    }
}
