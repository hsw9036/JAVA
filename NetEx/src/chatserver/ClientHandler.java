//package chatserver;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.net.Socket;
//
//public class ClientHandler implements Runnable {
//
//	private final Socket socket;
//	private final Server server;
//	private BufferedReader reader;
//	private BufferedWriter writer;
//	
//public ClientHandler (Socket socket, Server server) {
//	this.socket = socket;
//	this.server = server;
//	
//	try {
//		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//		
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//}
//	
//	@Override
//	public void run ( ) {
//		try {
//			String message;
//			while ((message = reader.readLine()) != null){
//				System.out.println("클라이언트 메시지 :" + message);
//				server.broadcastMessage(message, this);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				socket.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public void sendMessage(String message) {
//		try {
//			writer.write(message);
//			writer.newLine();
//			writer.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}

package chatserver;

import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {
    private final Socket socket;
    private final Server server;
    private BufferedReader reader;
    private BufferedWriter writer;
    private String nickname;

    public ClientHandler(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            
            // 첫 메시지로 닉네임 설정
            nickname = reader.readLine();
            server.broadcastMessage(nickname + "님이 입장하셨습니다.", this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println(nickname + "의 메시지: " + message);
                server.broadcastMessage(message, this); // 수신자 화면에서는 닉네임과 메시지
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.broadcastMessage(nickname + "님이 나갔습니다.", this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getNickname() {
        return nickname;
    }
}
