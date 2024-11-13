//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class ServerEx {
//	// 클라이언트로 연결 받는 솤헷
//	ServerSocket serverSocket;
//	
//	// 실제 통신을 담당하는 솤헷
//	Socket socket;
//	
//	public ServerEx() {
//		initData();
//	}
//	
//	private void initData() {
//		try {
//			// 서버 속헷 생성
//			serverSocket = new ServerSocket(9000);
//			
//			// 클라이언트의 접속 대기 하고 있음
//			socket = serverSocket.accept();
//			System.out.println("클라이언트가 접속하였습니다.");
//		} catch(Exception e) {
//			
//		}
//	}
//	
//	public static void main(String[] args) {
//		new ServerEx();
//
//	}
//
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
   // 클라이언트로 연결 받는 소켓
   ServerSocket serverSocket;
   
   // 실제 통신을 담당하는 소켓
   Socket socket;

   public ServerEx() {
      initData();
   }
   
   private void initData() {
      try {
         // 서버 소켓 생성
         serverSocket = new ServerSocket(9000);
         
         // 클라이언트의 접속 대기 하고 있음
         socket = serverSocket.accept();
         System.out.println("클라이언트가 접속하였습니다.");
         
         BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         System.out.println(reader.readLine() + "\n");
         
         
      }catch(Exception e) {
         
      }
   }
   
   public static void main(String[] args) {
      new ServerEx();
   }

}
