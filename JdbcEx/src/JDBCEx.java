import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCEx {

	public static void main(String[] args) {
		 Connection conn;
		 
		 Statement stmt;
		 ResultSet rs;
	      
	      String url = "jdbc:mysql://localhost:3306/Haksa";
	      String id = "root";
	      String pw = "1234";
	      
	      try {
	         // 사용하고자 하는 드라이버 로드
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         
	         // url id pw 접속
	         conn = DriverManager.getConnection(url, id, pw);
	         
	         // CRUD 작업을 실행
	         stmt = conn.createStatement();
	         
//	         stmt.executeUpdate("insert into student values(20245111,'블랙핑크','Music',100)");
	         stmt.executeUpdate("delete from student where name = 'bts'");
	         
	         
	         rs = stmt.executeQuery("select * from student");
	         while ( rs.next() ) {
	        	 int hakbun = rs.getInt(1);
	        	 String name = rs.getString("name");
	        	 String dept = rs.getString("dept");
	        	 int score = rs.getInt("score");
	        	 System.out.println(hakbun + " " + name + " " + dept + " " + score);
	         }
	         
	      } catch (Exception e) {
	         System.out.println(e);
	      }
	}

}
