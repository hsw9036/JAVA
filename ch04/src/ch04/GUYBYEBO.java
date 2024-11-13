package ch04;

import java.util.Scanner;

public class GUYBYEBO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임을 시작합니다.");
		System.out.println("철수 >> ");
		String a = sc.next();
		System.out.println("영희 >> ");
		String b = sc.next();
		
		if(a.equals("가위")) {
			if(b.equals("가위"))
				System.out.println("비겼습니다.");
			else if (b.equals("바위"))
				System.out.println("영희가 이겼습니다");
			else
				System.out.println("철수가 이겼습니다.");
		}
		else if(a.equals("바위")) {
			if(b.equals("바위"))
				System.out.println("비겼습니다.");
			else if (b.equals("가위"))
				System.out.println("영희가습니다.");
		}
	}

}
