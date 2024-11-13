package ch04;

public class Samyookku {

	public static void main(String[] args) {
		for (int i = 1; i <= 99 ; i ++) {
			int count = 0;
			int number = i;
			
			while ( number > 0) {
				int a = number % 10;
				if (a == 3 || a == 6 || a == 9) {
					count ++;
				}
				number /= 10 ;
			}
			
			if (count > 0) {
				System.out.println(i + "");
				for (int j = 0 ; j < count ; j++) {
					System.out.println("싸다구");
				}
				System.out.println();
			}
		}
	}
}
