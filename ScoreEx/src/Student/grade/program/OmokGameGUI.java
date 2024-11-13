package Student.grade.program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OmokGameGUI extends JFrame {
    static final int SIZE = 15;
    static final int CELL_SIZE = 40;
    static final char EMPTY = '-';
    static final char BLACK = '●';
    static final char WHITE = '○';
    char[][] board = new char[SIZE][SIZE];
    boolean isBlackTurn = true;

    public OmokGameGUI() {
        setTitle("오목 게임");
        setSize(SIZE * CELL_SIZE + 50, SIZE * CELL_SIZE + 70);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initializeBoard();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawBoard(g);
            }
        };

        panel.setPreferredSize(new Dimension(SIZE * CELL_SIZE, SIZE * CELL_SIZE));
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX() / CELL_SIZE;
                int y = e.getY() / CELL_SIZE;

                if (x >= SIZE || y >= SIZE || board[x][y] != EMPTY) {
                    return;
                }

                board[x][y] = isBlackTurn ? BLACK : WHITE;
                repaint();

                if (checkWin(x, y)) {
                    JOptionPane.showMessageDialog(panel,
                            (isBlackTurn ? "검은 돌" : "흰 돌") + " 승리!",
                            "게임 종료", JOptionPane.INFORMATION_MESSAGE);
                    initializeBoard();
                    repaint();
                }

                isBlackTurn = !isBlackTurn;
            }
        });

        add(panel);
        pack();
        setVisible(true);
    }

    void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    void drawBoard(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int x = i * CELL_SIZE;
                int y = j * CELL_SIZE;
                g.drawRect(x, y, CELL_SIZE, CELL_SIZE);

                if (board[i][j] == BLACK) {
                    g.setColor(Color.BLACK);
                    g.fillOval(x + 5, y + 5, CELL_SIZE - 10, CELL_SIZE - 10);
                    g.setColor(Color.LIGHT_GRAY);
                } else if (board[i][j] == WHITE) {
                    g.setColor(Color.WHITE);
                    g.fillOval(x + 5, y + 5, CELL_SIZE - 10, CELL_SIZE - 10);
                    g.setColor(Color.LIGHT_GRAY);
                }
            }
        }
    }

    boolean checkWin(int x, int y) {
        char stone = board[x][y];
        return checkDirection(x, y, 1, 0, stone) ||
               checkDirection(x, y, 0, 1, stone) ||
               checkDirection(x, y, 1, 1, stone) ||
               checkDirection(x, y, 1, -1, stone);
    }

    boolean checkDirection(int x, int y, int dx, int dy, char stone) {
        int count = 1;
        for (int i = 1; i < 5; i++) {
            int nx = x + i * dx, ny = y + i * dy;
            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && board[nx][ny] == stone) {
                count++;
            } else break;
        }
        for (int i = 1; i < 5; i++) {
            int nx = x - i * dx, ny = y - i * dy;
            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && board[nx][ny] == stone) {
                count++;
            } else break;
        }
        return count >= 5;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(OmokGameGUI::new);
    }
}
