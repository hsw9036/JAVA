package chatserver;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private final int port;
    private Set<ClientHandler> clientHandlers = new HashSet<>();

    public Server(int port) {
        this.port = port;
    }

    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("서버가 시작되었습니다.");

            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket, this);
                clientHandlers.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clientHandlers) {
            if (client.equals(sender)) {
                client.sendMessage(message); // 송신자에게는 메시지만 전송 (닉네임 없이)
            } else {
                client.sendMessage(sender.getNickname() + ": " + message); // 수신자에게는 닉네임 포함
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server(9001);
        server.startServer();
    }
}
