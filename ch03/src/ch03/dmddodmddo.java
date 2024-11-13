package ch03;

import java.util.Scanner;

public class dmddodmddo {

	public static void main(String[] args) {
		int [] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1};
		int [] count = new int[unit.length];
		
		Scanner s = new Scanner (System.in);
		System.out.println("금액을 입력하쇼");
		int money = s.nextInt();
		for (int i = 0 ; i < unit.length ; i++)  {
			count[i] = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + "원 :" + count[i] +"개");
		}

	}

}
