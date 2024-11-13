//package ch04;
//
//import java.util.Scanner;
//
//public class Gohome {
//
//	public static void main(String[] args) {
//		Scanner gotomyhome = new Scanner(System.in);
//		
//		System.out.println("윤년인지 아닌지 알고싶은 연도가있소 ?");
//		int year = gotomyhome.nextInt();
//		
//		if ( year < 1 || year > 4000) {
//			System.out.println(" 연도의 범위는 1~4000 입니다.");
//		 {
//				if ( year % 4 == 0 ) {
//		
//				}
//				
//			}
//		}
//
//	}
//
//}


package ch04;

import java.util.Scanner;

public class Gohome {

    public static void main(String[] args) {
    	Scanner gohome = new Scanner(System.in);
    	int h = gohome.nextInt();
    	
    	int m = gohome.nextInt();
    	
    	
        gohome.close();
    }
}


//Scanner gotomyhome = new Scanner(System.in);
//
//System.out.println(" x 값을 입력하세요 : ");
//int x = gotomyhome.nextInt();
//
//System.out.println(" y 값을 입력하세요 : ");
//int y = gotomyhome.nextInt();
//
//if (x < -1000 || x > 1000 ||x == 0 || y < -1000 || y > 1000 || y==0) {
//  System.out.println("x, y값의 범위는 -1000~1000 입니다.");
//} else {
//  if (x > 0 && y > 0){
//      System.out.println("1");
//  } else if ( x > 0 && y < 0) {
//      System.out.println("4");
//  } else if ( x < 0 && y > 0) {
//  	System.out.println("2");
//  } else {
//  	System.out.println("3");
//  }
//}