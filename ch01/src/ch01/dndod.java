package ch01;
import java.util.Scanner;

public class dndod {
	
//public class TernaryOPTest {
	public static void main(String args[])
	{
//		Scanner stdin = new Scanner(System.in);
//		System.out.print("성적을 입력하세요 : ");
//		int grade = stdin.nextInt();
//		if (grade >=90)
//			System.out.println("A학점 취득 성공");
//		else
//			System.out.println("A학점 취득 실패");
//		System.out.println("감사합니다");
		
//	Scanner stdin = new Scanner(System.in);	
//	System.out.print("성적을 입력하세요 :");
//	int grade = stdin.nextInt();
//	if (grade >=90)
//		System.out.println("A학점 취득");
//	else if (grade >=80)
//		System.out.println("B학점 취득");
//	else if (grade >=70)
//		System.out.println("C학점 취득");
//	else if (grade >=60)
//		System.out.println("D학점 취득");
//	else
//		System.out.println("학점 취득 실패");
		
//		Scanner stdin = new Scanner(System.in);
//		System.out.print("월을 입력하세요 :"); 
//		int month = stdin.nextInt();
//		if (3 <= month && month <=5)
//			System.out.println("봄 입니다.");
//		else if (6 <= month & month <=8)
//			System.out.println("여름 입니다.");
//		else if (9 <= month & month <=11)
//			System.out.println("가을 입니다.");
//		else if (1==month || month ==2 || month ==12)
//			System.out.println("겨울 입니다.");
//		else
//			System.out.println("해당되는 계절이 없습니다.");
//		
		Scanner stdin = new Scanner (System.in);
		System.out.print("월을 입력하세요 :");
		int month = stdin.nextInt();
		String MtoS;
		switch(month)
		{
		case 12 :
		case 1 :
		case 2 :
			MtoS = "겨울입니다.";
			break;
		case 3 :
			System.out.println("봄에는");
		case 4 :
			System.out.println("장범준의");
		case 5 :
			MtoS = "벚꽂엔딩입니다.";
			break;
		case 6 :
		case 7 :
		case 8 :
			MtoS = "여름입니다.";
			break;
		case 9 :
			System.out.print("멋진 9월과");
		case 10 :
			System.out.print("아름다운 10월과");
		case 11 :
			System.out.print("낙엽의 11월은");
			MtoS = "가을입니다.";
			break;
		default :
			MtoS = "1~12월을 벗어난 달입니다.";
			break;
		}
		System.out.println(MtoS);
	}
}




