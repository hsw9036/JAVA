//package chatclient;
//
//import java.awt.BorderLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JFrame;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//public class ChatWindow extends JFrame{
//	private JTextArea chatArea;
//	private JTextField inputField;
//	private Client client;
//	
//	public ChatWindow(Client client) {
//		this.client = client;
//		setTitle("채팅 클라이언트");
//		setSize(400,400);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		chatArea = new JTextArea();
//		chatArea.setEditable(false);
//		add(new JScrollPane(chatArea), BorderLayout.CENTER);
//		
//		inputField = new JTextField();
//		inputField.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String message = inputField.getText();
//				client.sendMessage(message);
//				appendMessage("캬캬: " + message );
//				inputField.setText("");
//			}
//		});
//		add(inputField,BorderLayout.SOUTH);
//		setVisible(true);
//	}
//	public void appendMessage(String message) {
//		chatArea.append(message + "\n");
//	}
//}

package chatclient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    private JTextArea textArea;
    private JTextField inputField;
    private ChatListener listener;

    public ChatWindow(String nickname, ChatListener listener) {
        this.listener = listener;

        setTitle("Chat Client - " + nickname);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        inputField = new JTextField();
        add(inputField, BorderLayout.SOUTH);

        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText();
                listener.onMessageSent(message);
                inputField.setText("");
            }
        });

        setVisible(true);
    }

    public void appendMessage(String message) {
        textArea.append(message + "\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public interface ChatListener {
        void onMessageSent(String message);
    }
}
