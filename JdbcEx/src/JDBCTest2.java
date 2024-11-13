/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest1 {

	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/Haksa";
		
		String id = " root " ;
		String pw = " 1234 " ;

		try {
			// 1번 : 사용하고자 할 드라이버 로드
			   Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2번 : url , id , pw 접속
			conn = DriverManager.getConnection(url,id,pw);
			
			// 3번 : CRUD 작업을 함
			System.out.println("DB 연결 완료");
			
			
		}catch(Exception e) {
			System.out.println("JDBC 드라이버 로드 오류");
			
		}
		
	}

}

package jdbc_ex01;
*/
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCtest1 {
   public static void main(String[] args) {
      Connection conn;
      
      String url = "jdbc:mysql://localhost:3306/Haksa";
      String id = "root";
      String pw = "1234";
      
      try {
         // 사용하고자 하는 드라이버 로드
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         // url id pw 접속
         conn = DriverManager.getConnection(url, id, pw);
         
         // CCRUD 작업을 실행
         System.out.println("DB 접속 완료");
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
