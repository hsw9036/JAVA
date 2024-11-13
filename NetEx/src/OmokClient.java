import java.io.*;
import java.net.*;

public class OmokClient {
    private static final String SERVER_IP = "192.168.0.15"; // 서버 IP
    private static final int PORT = 12345; // 서버 포트 번호

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, PORT)) {
            // 서버와 입출력 스트림 연결
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            // 서버에서 오는 메시지 받기
            String serverMessage;
            while (true) {
                serverMessage = in.readUTF();
                System.out.println(serverMessage);

                // 플레이어의 차례일 때 입력 받기
                if (serverMessage.contains("차례입니다")) {
                    String move = console.readLine();
                    out.writeUTF(move);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
