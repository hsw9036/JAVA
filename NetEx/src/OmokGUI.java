import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OmokGUI {

    private static final int BOARD_SIZE = 15;  // 15x15 보드
    private static final int EMPTY = 0;
    private static final int BLACK = 1;
    private static final int WHITE = 2;
    
    private int currentPlayer = BLACK;  // 현재 플레이어 (흑:1, 백:2)
    private int[][] board = new int[BOARD_SIZE][BOARD_SIZE];  // 보드 상태

    private JFrame frame;
    private JPanel boardPanel;
    private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];

    public OmokGUI () {
        frame = new JFrame("오목 게임");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        boardPanel = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        frame.add(boardPanel);

        initializeBoard();
        frame.setVisible(true);
    }

    // 게임 보드 초기화
    private void initializeBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                final int finalRow = row;
                final int finalCol = col;

                JButton button = new JButton();
                button.setPreferredSize(new Dimension(40, 40));
                button.setFont(new Font("Arial", Font.PLAIN, 20));
                button.setFocusPainted(false);
                button.setEnabled(true);
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        buttonClicked(finalRow, finalCol);
                    }
                });
                buttons[row][col] = button;
                boardPanel.add(button);
            }
        }
    }

    // 버튼 클릭 시 동작 (돌을 놓는 기능)
    private void buttonClicked(int row, int col) {
        if (board[row][col] != EMPTY) {
            return;  // 이미 돌이 있는 곳이라면 클릭 무시
        }

        // 현재 플레이어의 돌 놓기
        board[row][col] = currentPlayer;
        buttons[row][col].setText(currentPlayer == BLACK ? "●" : "○");
        buttons[row][col].setEnabled(false);  // 클릭한 버튼 비활성화

        // 승리 체크
        if (checkWin(row, col)) {
            JOptionPane.showMessageDialog(frame, (currentPlayer == BLACK ? "흑" : "백") + " 승리!");
            resetGame();
            return;
        }

        // 턴 변경
        currentPlayer = (currentPlayer == BLACK) ? WHITE : BLACK;
    }

    // 승리 조건 확인 (가로, 세로, 대각선 5개 연속 돌 확인)
    private boolean checkWin(int row, int col) {
        int[] directions = {-1, 0, 1};  // -1: 왼쪽/위, 0: 현재, 1: 오른쪽/아래

        for (int dr : directions) {
            for (int dc : directions) {
                if (dr == 0 && dc == 0) continue;  // 0,0 방향은 건너뜀
                int count = 1;  // 현재 놓은 돌부터 시작

                // 한 방향으로 연속해서 돌 세기
                for (int i = 1; i < 5; i++) {
                    int newRow = row + dr * i;
                    int newCol = col + dc * i;
                    if (newRow < 0 || newRow >= BOARD_SIZE || newCol < 0 || newCol >= BOARD_SIZE) break;
                    if (board[newRow][newCol] == currentPlayer) {
                        count++;
                    } else {
                        break;
                    }
                }

                // 반대 방향으로 연속해서 돌 세기
                for (int i = 1; i < 5; i++) {
                    int newRow = row - dr * i;
                    int newCol = col - dc * i;
                    if (newRow < 0 || newRow >= BOARD_SIZE || newCol < 0 || newCol >= BOARD_SIZE) break;
                    if (board[newRow][newCol] == currentPlayer) {
                        count++;
                    } else {
                        break;
                    }
                }

                // 5개 연속 돌이 있으면 승리
                if (count >= 5) return true;
            }
        }

        return false;
    }

    // 게임 초기화 (보드와 버튼 상태 리셋)
    private void resetGame() {
        board = new int[BOARD_SIZE][BOARD_SIZE];  // 보드 상태 리셋
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                buttons[row][col].setText("");
                buttons[row][col].setEnabled(true);
            }
        }
        currentPlayer = BLACK;  // 흑부터 시작
    }

    public static void main(String[] args) {
        new OmokGUI();
    }
}
