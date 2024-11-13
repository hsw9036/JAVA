package ch05;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
//		HashMap<String,Integer> nations = new HashMap<String,Integer> ();
//		
//		nations.put("Korea", 5000);
//		nations.put("USA", 1000000);
//		nations.put("Swiss", 2000);
//		nations.put("France", 3000);
//		
//		Scanner s = new Scanner(System.in);
//		while(true) {
//			System.out.println("완전 다르게 하고있었잖아 ?");
//			String a = s.next();
//			if(a.equals("그만")) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			Integer b = nations.get(a);
//			if ( b == null )
//				System.out.println(a + "는 없는 나라여 미안하다");
//			else
//				System.out.println(b);	
//		}
//		s.close();
//	}
//}
//		
		
//		dic.put("baby","아기");
//		dic.put("love","사랑");
//		dic.put("apple","사과");
//
//		
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			System.out.println("찾고 싶은 단어는 ?");
//			String eng = scanner.next();
//			if(eng.equals("exit")) {
//				System.out.println("종료합니다...");
//				break;
//			}
//			String kor = dic.get(eng);
//			if( kor == null )
//				System.out.println(eng + "는 없는 단어입니다.");
//			else
//				System.out.println(kor);
//		}
//		scanner.close();
//	}
//
//}

		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예 : Korea 5000)");
		while(true) {
			System.out.println("나라 이름, 인구 >> ");
			String nation = sc.next();
			if ( nations.equals("그만"))
				break;
			int pop = sc.nextInt();
			nations.put(nation, pop);
		}
			while(true) {
				System.out.println("인구 검색할 나라는 >>");
				String nation = sc.next();
				if (nation.equals("그만"))
					break;
				Integer n = nations.get(nation);
				if(n == null)
					System.out.println(nation + "은 찾을 수 없는 나라입니다.");
				else
					System.out.println(nation + " 의 인구는 " + n);
			}
			sc.close();
	}
}