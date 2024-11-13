import java.io.*;
import java.net.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class RPSGameServer {
    private static final int PORT = 9001;
    private static final ExecutorService pool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        System.out.println("가위바위보 서버가 시작되었습니다!");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket player1Socket = serverSocket.accept();
                System.out.println("플레이어 1이 접속했습니다!");

                Socket player2Socket = serverSocket.accept();
                System.out.println("플레이어 2가 접속했습니다!");

                pool.execute(new GameHandler(player1Socket, player2Socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
    }

    private static class GameHandler implements Runnable {
        private final Socket player1Socket;
        private final Socket player2Socket;

        public GameHandler(Socket player1Socket, Socket player2Socket) {
            this.player1Socket = player1Socket;
            this.player2Socket = player2Socket;
        }

        @Override
        public void run() {
            try (
                BufferedReader player1Input = new BufferedReader(new InputStreamReader(player1Socket.getInputStream()));
                BufferedWriter player1Output = new BufferedWriter(new OutputStreamWriter(player1Socket.getOutputStream()));
                BufferedReader player2Input = new BufferedReader(new InputStreamReader(player2Socket.getInputStream()));
                BufferedWriter player2Output = new BufferedWriter(new OutputStreamWriter(player2Socket.getOutputStream()))
            ) {
                player1Output.write("플레이어 1, 가위바위보를 입력하세요 (가위/바위/보):\n");
                player1Output.flush();
                player2Output.write("플레이어 2, 가위바위보를 입력하세요 (가위/바위/보):\n");
                player2Output.flush();

                String player1Choice = player1Input.readLine();
                String player2Choice = player2Input.readLine();

                String result = determineWinner(player1Choice, player2Choice);

                player1Output.write(result + "\n");
                player1Output.flush();
                player2Output.write(result + "\n");
                player2Output.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private String determineWinner(String player1Choice, String player2Choice) {
            if (player1Choice.equals(player2Choice)) {
                return "비겼습니다!";
            } else if ((player1Choice.equals("가위") && player2Choice.equals("보")) ||
                       (player1Choice.equals("바위") && player2Choice.equals("가위")) ||
                       (player1Choice.equals("보") && player2Choice.equals("바위"))) {
                return "플레이어 1이 이겼습니다!";
            } else {
                return "플레이어 2가 이겼습니다!";
            }
        }
    }
}
