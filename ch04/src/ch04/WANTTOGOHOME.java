package ch04;

import java.util.Scanner;

public class WANTTOGOHOME {

	public static void main(String[] args) {
		
		Scanner wanttogohome = new Scanner(System.in);
		System.out.println("너 몇점이니 ?");
		int score = wanttogohome.nextInt();
		
		if (score <0 || score > 100) {
			System.out.println("잘못된 범위입니다 0~100 사이의 점수를 입력해주세요.");
		} else {
		
		if ( score >=90 ) {
			System.out.println(" 이야 공부좀했네 A다 ");
		} else if ( score >= 80 && score < 90 ) {
			System.out.println(" 쪼매 아깝소 B다 ");
		} else if ( score >= 70 && score < 80 ) {
			System.out.println(" 공부좀하소 C다 ");
		} else if ( score >= 60 && score < 70) {
			System.out.println(" 공부안하고 뭐했너 D다");
		} else {
			System.out.println(" 응 F ");
		}
	}
		 wanttogohome.close();		
	}
}
