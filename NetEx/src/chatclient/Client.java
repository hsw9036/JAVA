//package chatclient;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.net.Socket;
//
//public class Client {
//	
//	private Socket socket;
//	private BufferedReader reader;
//	private BufferedWriter writer;
//	private ChatWindow chatWindow;
//	
//	public Client (String ip, int port) {
//		try {
//			
//			socket = new Socket(ip, port);
//			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//			
//			chatWindow = new ChatWindow(this);
//			new Thread(() -> receiveMessages()).start();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
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
//	
//	private void receiveMessages() {
//        try {
//            String message;
//            while ((message = reader.readLine()) != null) {
//                chatWindow.appendMessage(message);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void main(String[] args) {
//		new Client("192.168.0.15", 9001);
//	}
//}
package chatclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client implements ChatWindow.ChatListener {
    private Socket socket;
    private BufferedReader reader;
    private BufferedWriter writer;
    private String nickname;
    private ChatWindow chatWindow;

    public Client(String nickname, String serverIP, int serverPort) {
        this.nickname = nickname;
        try {
            socket = new Socket(serverIP, serverPort);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            writer.write(nickname);
            writer.newLine();
            writer.flush();
            
            chatWindow = new ChatWindow(nickname, this); // 채팅 윈도우 생성
            new Thread(new ReadThread()).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onMessageSent(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
            chatWindow.appendMessage("나: " + message); // 내 메시지 표시
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ReadThread implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    chatWindow.appendMessage(message); // 상대방 메시지 표시
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String nickname = JOptionPane.showInputDialog("닉네임을 입력하세요:");
        new Client(nickname, "192.168.0.15", 9001);
    }
}
