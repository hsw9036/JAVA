//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class BoardEx {
//	
//	private Scanner sc = new Scanner(System.in);
//	private Connection cnn;
//	Statement stmt;
//	ResultSet rs;
//	
//	public BoardEx() {
//		///JDBC Drive 로드
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			String url = "jdbc:mysql://localhost:3306/haksa"
//			String id = "root";
//			String pw = "1234";
//			
//			conn = DriverManager.getConnection(url,id,pw);
//		
//		
//	}	catch(Exception e) {
//		e.printStackTrace();
//	}
//}
//	public static void main(String[] args) {
//		BoardEx b = new BoardEx();
//
//	}
//
//}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class BoardEx {
//
//	private Scanner sc = new Scanner(System.in);
//
//	private Connection conn;
//	Statement stmt;
//	ResultSet rs;
//	PreparedStatement pstmt;
//
//	// b 객체 생성될 때 DB에 연동될 수 있도록 생성자 만들기
//	public BoardEx() {
//		// JDBC Driver 연동
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			String url = "jdbc:mysql://localhost:3306/haksa";
//			String id = "root";
//			String pw = "1234";
//
//			conn = DriverManager.getConnection(url, id, pw);
////         System.out.println("DB 접속 성공!");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public void list() {
//		// 타이틀과 컬럼명 출력
//		System.out.println();
//		System.out.println("[게시판 목록]");
//		System.out.println("-------------------------------------------------");
//		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
//		System.out.println("-------------------------------------------------");
//
//		// board 테이블에서 게시물 정보 가져와서 출력하기
//		try {
//			String sql = " " + "select bno, btitle, bcontent, bwriter, bdate from boards" + "order by bno desc";
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				Board board = new Board();
//
//				board.setBno(rs.getInt("bno"));
//				board.setBtitle(rs.getString("btitle"));
//				board.setBcontent(rs.getString("bcontent"));
//				board.setBwriter(rs.getString("bwriter"));
//				board.setBdate(rs.getDate("bdate"));
//				System.out.printf("%-6s%-12s%-16s-40s \n", board.getBno(), board.getBwriter(), board.getBdate(),
//						board.getBtitle());
//			}
//
//			rs.close();
//			pstmt.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		mainMenu();
//
//	}
//
//	public void mainMenu() {
//		System.out.println();
//		System.out.println("----------------------------------");
//		System.out.println("메인메뉴 : 1. Create | 2.Read | 3. Clear | 4. 종료");
//		System.out.println("메뉴선택 >>> ");
//		String menuNo = sc.nextLine();
//		System.out.println();
//
//		switch (menuNo) {
//		case "1":
//			create();
//			break;
//
//		case "2":
//			read();
//			break;
//			
//		case "3":
//			clear();
//			break;
//		
//		case "4" :
//			exit();
//		
//		}
//
//	}
//
//	public void create () {
//		System.out.println("레코드삽입");
//	}
//	
//	public void read () {
//		System.out.println("레코드 검색");
//	}
//	
//	public void clear () {
//		System.out.println("레코드 삭제");
//	}
//	
//	public void exit() {
//		System.out.println("프로그램 종료");
//	}
//	
//	public static void main(String[] args) {
//		BoardEx b = new BoardEx();
//		b.list();
//
//	}
//
//}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BoardEx {
   
   private Scanner sc = new Scanner(System.in);
   private Connection conn;
   Statement stmt;
   PreparedStatement pstmt;
   ResultSet rs;
   
   public BoardEx() {
      //JDBC Driver 로드
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/haksa";
         String id = "root";
         String pw = "1234";
         
         conn = DriverManager.getConnection(url, id, pw);
      //   System.out.println("DB 접속 성공");
      } catch (Exception e) {
         
         e.printStackTrace();
      }
   }
   

   public void list() {
      // 타이틀과 컬럼명 출력
      System.out.println();
      System.out.println("[게시판 목록]");
      System.out.println("-------------------------------------------");
      System.out.printf("%-6s%-12s%-16s%-40s\n","no", "writer", "date", "title");
      System.out.println("-------------------------------------------");
      
      // board 테이블에서 게시물 정보 가져와서 출력하기
      
      try {
         String sql = "select bno, btitle, bcontent, bwriter, bdate from boards " +
                       "order by bno desc";
         pstmt = conn.prepareStatement(sql);
         rs = pstmt.executeQuery();
         while(rs.next()) {
            Board board = new Board();
            
            board.setBno(rs.getInt("bno"));
            board.setBtitle(rs.getString("btitle"));
            board.setBcontent(rs.getString("bcontent"));
            board.setBwriter(rs.getString("bwriter"));
            board.setBdate(rs.getDate("bdate"));
            System.out.printf("%-6s%-12s%-16s%-40s \n", board.getBno(), 
                  board.getBwriter(), board.getBdate(), board.getBtitle());
         }
         
         rs.close();
         pstmt.close();
         
         
      }catch(Exception e) {
         e.printStackTrace();
      }
      mainMenu();
   }
   
   
   public void mainMenu() {
      System.out.println();
      System.out.println("-----------------------------------------------");
      System.out.println("메인메뉴 : 1.Create |  2.Read  | 3.Clear | 4.종료");
      System.out.print("메뉴 선택 >>");
      String menuNo = sc.nextLine();
      System.out.println();
      
      switch(menuNo) {
      case "1":
         create();
         break;
      case "2":
         read();
         break;
      case "3":
         clear();
         break;
      case "4":
         exit();
         
      }
   }
   
   
   public void create() {
      Board board = new Board();
      System.out.println("[새 게시물 입력]");
      System.out.println(" 제목 : >> ");
      board.setBtitle(sc.nextLine());
      System.out.println(" 내용 : >> ");
      board.setBcontent(sc.nextLine());
      System.out.println(" 글쓴이 : >> ");
      board.setBwriter(sc.nextLine());
      
      // 보조 메뉴 출력
      System.out.println("-------------------------------------------------");
      System.out.println( " 보조 메뉴 : 1.Ok | 2. Cancel ");
      System.out.println(" 메뉴 선택 : >> ");
      String menuNo = sc.nextLine();
      if(menuNo.equals("1")) {
    	  try {
    		  String sql = " insert into boards(btitle, bcontent, bwriter, bdate)" + "values(?,?,?,now())";
    		  
    		  
    		  pstmt = conn.prepareStatement(sql);
    		  pstmt.setString(1, board.getBtitle());
    		  pstmt.setString(2, board.getBcontent());
    		  pstmt.setString(3, board.getBwriter());
    		  pstmt.executeUpdate();
    		  
    	  }catch (Exception e) {
    		  e.printStackTrace();
    	  }
      }
      list();
   }
   
   public void read() {
      System.out.println("[게시물 읽기]");
      System.out.println("bno : ");
      int bno = sc.nextInt();
//      int bno = Integer.parseInt(sc.nextInt());
      // 해당 테이블에서 해당 게시물 가져와 출력
      try {
    	  
    	  String sql = " select bno, btitle, bcontent, bwriter, bdate " + "from boards where bno = ? ";
    	  
    	  pstmt = conn.prepareStatement(sql);
    	  pstmt.setInt(1, bno);
    	  
    	  rs = pstmt.executeQuery();
    	  
    	  if(rs.next()) {
    		  Board board = new Board();
    		  board.setBno(rs.getInt("bno"));
    		  board.setBtitle(rs.getString("btitle"));
    		  board.setBcontent(rs.getString("bcontent"));
    		  board.setBwriter(rs.getString("bwriter"));
    		  board.setBdate(rs.getDate("bdate"));
    		  
    		  System.out.println("########################################################");
    		  
    		  System.out.println(" 번호 : " + board.getBno());
    		  System.out.println(" 제목 : " + board.getBtitle());
    		  System.out.println(" 내용 : " + board.getBcontent());
    		  System.out.println(" 글쓴이 : " + board.getBwriter());
    		  System.out.println(" 날짜 : " + board.getBdate());
    		
    		  
    		  //보조 메뉴 출력
    		  System.out.println(" ------------------------------------------------------- ");
    		  System.out.println(" 보조 메뉴 : 1.update | 2. Delete | 3. List ");
    		  System.out.println(" 메뉴 선택 >> ");
    		  String menuNo = sc.nextLine();
    		  
    		  if (menuNo.equals("1"))
    			  update(board);
    		  else if(menuNo.equals("2"))
    			  delete(board);
    		  
    		  	
    	  }
    	  
      } catch (Exception e) {
    	  
      }
      
   }
   
   
   public void update(Board board) {
	   
   }
   
   public void delete (Board board) {
	   
   }
   
   public void clear() {
      System.out.println("레코드 삭제");
   }
   
   public void exit() {
      System.out.println("프로그램 종료");
   }
   public static void main(String[] args) {
      BoardEx b = new BoardEx();
      b.list();

   }

   
}
