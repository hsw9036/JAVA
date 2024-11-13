package ch03;

//import java.util.*;
//public class Main {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("서기년도를 알고싶은 불기년도를 입력하세요 (1000년 ~ 3000년 사이):");
//		int y = s.nextInt();
//
//		if ( y >= 1000 && y <= 3000)
//			System.out.println(" 현재 서기 연도 : " + ( y-544) + "년" );
//		else {System.out.println("잘못된 입력입니다.");};
//			s.close();
//		}
//	}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("정수 1을 입력하세용");
    	int a = s.nextInt();
    	System.out.println("정수 2를 입력하세용");
    	int b = s.nextInt();
    	
    	if ( a > b )
    	 {System.out.println( ">" ); } 
    	 
    	 else if ( a < b) {
    		 System.out.println( "<");
    	 }
    	
    	 else {System.out.println ( "=="); }
    	
    	s.close();
    }
}





//System.out.println("|\\_/|");
//System.out.println("|q p|   /}");
//System.out.println("( 0 )\"\"\"\\");
//System.out.println("|\"^\"`    |");
//System.out.println("||_/=\\\\__|");
//
//
//
//Scanner scanner = new Scanner(System.in);
////숫자의 범위가 크니까 long을 이용하자
//   System.out.println("첫 번째 수를 넣어주세요");
//   long a = scanner.nextInt();
//   System.out.println("두 번째 수를 넣어주세요");
//   long b = scanner.nextInt();
//   System.out.println("세 번째 수를 넣어주세요");
//   long c = scanner.nextInt();
//   
//   long result = a + b + c;
//   
//   System.out.println("세개의 숫자를 더한 결과는 : " + result);
//   
//
//   scanner.close();

//Scanner s = new Scanner (System.in);
//System.out.println("첫 번째 숫자를 입력하세요");
//int a = s.nextInt();
//System.out.println("두 번째 숫자를 입력하세요");
//int b = s.nextInt();
//System.out.println("세 번째 숫자를 입력하세요");
//int c = s.nextInt();
//
//if ( a >=2 && a<=10000 &&  b >=2 && b<=10000 &&  c>=2 && c<=10000) {
//System.out.println((a+b)%c);
//System.out.println((a%c)+(b%c)%c);
//System.out.println((a*b)%c);
//System.out.println((a*c)*(b%c)%c);
//
//}  else {System.out.println("범위를 벗어난숫자를 입력했습니다. 2<=a,b,c<=10000 "); };
//s.close();



// 불기는 544년을 더해



//Scanner stdin = new Scanner(System.in);
//System.out.print("월을 입력하세요 :"); 
//int month = stdin.nextInt();
//if (3 <= month && month <=5)


//Scanner sc = new Scanner(System.in);
//int a, b;
//a = sc.nextInt();
//b = sc.nextInt();
//
//if ( a > 0 && a < 10 && b > 0 && b < 10 )
//	{double result = (double) a/b;
//System.out.println(result);
//} else {
//System.out.println("입력 범위를 벗어났습니다. (0 < A, B < 10)");
//}