package play;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class OmokClient11 {
    private static final int PORT = 12345;  // 서버 포트 번호
    private static String serverIP = "192.168.0.21";  // 여기에 서버 IP 주소를 입력 (내 컴퓨터의 IP 주소)
    private static Socket socket;
    private static PrintWriter out;
    private static BufferedReader in;
    private static JFrame frame;
    private static JButton[][] board;
    private static boolean myTurn = false;
    private static String playerMark = "X";  // "X" 플레이어가 먼저 시작
    private static String opponentMark = "O";


    public static void main(String[] args) {
        try {
            // 서버와 연결
            connectToServer(serverIP, PORT);
            
            // 게임 UI 설정은 connectToServer 내에서 한 번만 호출됩니다.
        } catch (IOException e) {
            System.out.println("서버에 연결할 수 없습니다: " + e.getMessage());
            System.exit(1);
        }
    }
    
    private static boolean checkWinner(int row, int col, String mark) {
        // 가로, 세로, 대각선 방향으로 5개 연속 확인
        int[][] directions = {{0,1}, {1,0}, {1,1}, {1,-1}};
        
        for (int[] dir : directions) {
            int count = 1;
            for (int i = 1; i < 5; i++) {
                int newRow = row + dir[0] * i;
                int newCol = col + dir[1] * i;
                if (newRow < 0 || newRow >= 15 || newCol < 0 || newCol >= 15 || !board[newRow][newCol].getText().equals(mark)) {
                    break;
                }
                count++;
            }
            for (int i = 1; i < 5; i++) {
                int newRow = row - dir[0] * i;
                int newCol = col - dir[1] * i;
                if (newRow < 0 || newRow >= 15 || newCol < 0 || newCol >= 15 || !board[newRow][newCol].getText().equals(mark)) {
                    break;
                }
                count++;
            }
            if (count >= 5) {
                return true;
            }
        }
        return false;
    }

    private static void endGame(String winner) {
        myTurn = false;
        JOptionPane.showMessageDialog(frame, winner + " 승리!");
        System.out.println(winner + " 승리!");
        // 게임 종료 후 추가 동작을 여기에 구현할 수 있습니다.
    }
    

    private static void connectToServer(String serverIP, int port) throws IOException {
        socket = new Socket(serverIP, port);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // 게임 UI를 클라이언트가 접속한 후에 바로 띄운다.
        setupGameUI();
        
        // 게임 시작 전에 플레이어의 마크를 설정
        playerMark = in.readLine();  // 서버에서 보내주는 첫 번째 메시지로 마크 설정
        opponentMark = playerMark.equals("X") ? "O" : "X";
        System.out.println("당신의 마크: " + playerMark);

        // 게임 턴을 기다리는 스레드 시작
        new Thread(new GameListener()).start();
    }


    private static void setupGameUI() {
        frame = new JFrame("Omok Game2");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(15, 15));
        
        board = new JButton[15][15];
        
        // 보드 생성
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                board[i][j] = new JButton();
                board[i][j].setPreferredSize(new Dimension(30, 30));
                board[i][j].setBackground(Color.WHITE);
                board[i][j].setOpaque(true);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                board[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton buttonClicked = (JButton) e.getSource();
                        int row = -1, col = -1;
                        outer: for (int i = 0; i < 15; i++) {
                            for (int j = 0; j < 15; j++) {
                                if (board[i][j] == buttonClicked) {
                                    row = i;
                                    col = j;
                                    break outer;
                                }
                            }
                        }
                        if (myTurn && board[row][col].getText().equals("")) {
                            board[row][col].setText(playerMark);
                            out.println(row + "," + col);
                            myTurn = false;
                            
                            if (checkWinner(row, col, playerMark)) {
                                endGame("당신");
                                out.println("GAME_OVER," + playerMark);
                            }
                        }
                    }
                });
                frame.add(board[i][j]);
            }
        }
        
        frame.setVisible(true);
    }

    private static class GameListener implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    String message = in.readLine();
                    if (message.startsWith("YOUR_TURN")) {
                        myTurn = true;
                        System.out.println("당신의 차례입니다.");
                    } else if (message.startsWith("OPPONENT_MOVE")) {
                        String[] coords = message.split(",");
                        int row = Integer.parseInt(coords[1]);
                        int col = Integer.parseInt(coords[2]);
                        SwingUtilities.invokeLater(() -> {
                            board[row][col].setText(opponentMark);
                            board[row][col].setEnabled(false);
                        });
                        System.out.println("상대방이 " + row + "," + col + "에 돌을 놓았습니다.");
                    } else if (message.equals("WAIT")) {
                        myTurn = false;
                        System.out.println("상대방의 차례를 기다리고 있습니다.");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
