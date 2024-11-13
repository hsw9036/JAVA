//package ch01;
//
//
//import java.util.Scanner;
//
///*
//public class AssignOPTest1 {
// public static void main(String args[]) {
//	 int a = 10;
//	 System.out.println("a="+a);
//	 a+=4;
//	 System.out.println("a+=4의 결과"  + a );
//	 a %= 4;
//	 System.out.println ("a%=4의 결과" + a);
//	 a <<=4;
//	 System.out.println("a<<=4의 결과" + a);
//	 boolean b =false;
//	 b &= a > 2;
//	 System.out.println("b &= a > 2 의 결과" +b);
//	 b |= a > 2;
//	 System.out.println ("b|=a>2의 결과" +b);
// }
//}
//*/
//
//public class  {
//	public static void main(String args[])
//	{
//		Scanner stdin = new Scanner(System.in);
//		System.out.print("한 개의 숫자를 입력 : ");
//		int a = stdin.nextInt();
//		boolean flag;
//		flag = (a%2==0) ? true : false;
//		System.out.print(a+"이(가) 짝수입니까? :");
//		System.out.println(flag);
//	}
//}
//


import java.util.Scanner;
//public class TernaryOPTest {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int grade = stdin.nextInt();
		if (grade >=90)
			System.out.println("A학점 취득 성공");
		else
			System.out.println("A학점 취득 실패");
		System.out.println("감사합니다");
		
}
}