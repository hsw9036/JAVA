import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPSGameClient {
    private static final String SERVER_IP = "192.168.0.15"; // 본인의 IP로 설정
    private static final int PORT = 9001;
    private BufferedReader reader;
    private BufferedWriter writer;

    public RPSGameClient() {
        setupGUI();
    }

    private void setupGUI() {
        JFrame frame = new JFrame("가위바위보 게임");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton rockButton = new JButton("바위");
        JButton paperButton = new JButton("보");
        JButton scissorsButton = new JButton("가위");
        buttonPanel.add(rockButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        rockButton.addActionListener(e -> sendChoice("바위", resultArea));
        paperButton.addActionListener(e -> sendChoice("보", resultArea));
        scissorsButton.addActionListener(e -> sendChoice("가위", resultArea));

        frame.setVisible(true);

        try {
            Socket socket = new Socket(SERVER_IP, PORT);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            new Thread(() -> {
                try {
                    while (true) {
                        String message = reader.readLine();
                        if (message != null) {
                            resultArea.append(message + "\n");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendChoice(String choice, JTextArea resultArea) {
        try {
            writer.write(choice);
            writer.newLine();
            writer.flush();
            resultArea.append("내 선택: " + choice + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new RPSGameClient();
    }
}
