import java.io.*;
import java.net.*;

public class OmokServer {
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("서버가 시작되었습니다. 클라이언트를 기다립니다...");

            // 두 클라이언트를 기다림
            Socket player1 = serverSocket.accept();
            System.out.println("플레이어 1이 접속했습니다.");
            Socket player2 = serverSocket.accept();
            System.out.println("플레이어 2가 접속했습니다.");

            // 각 클라이언트의 입출력 스트림 생성
            DataInputStream player1In = new DataInputStream(player1.getInputStream());
            DataOutputStream player1Out = new DataOutputStream(player1.getOutputStream());
            DataInputStream player2In = new DataInputStream(player2.getInputStream());
            DataOutputStream player2Out = new DataOutputStream(player2.getOutputStream());

            // 게임 시작 메시지 전송
            player1Out.writeUTF("게임이 시작되었습니다. 당신은 'X'입니다.");
            player2Out.writeUTF("게임이 시작되었습니다. 당신은 'O'입니다.");

            // 게임 진행
            String move;
            while (true) {
                // 플레이어 1의 차례
                player1Out.writeUTF("차례입니다. 'X' 차례");
                move = player1In.readUTF();
                player2Out.writeUTF("플레이어 1이 " + move + "에 두었습니다.");

                // 플레이어 2의 차례
                player2Out.writeUTF("차례입니다. 'O' 차례");
                move = player2In.readUTF();
                player1Out.writeUTF("플레이어 2가 " + move + "에 두었습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
