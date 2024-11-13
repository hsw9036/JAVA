package ch02;
/mport java.util.Random;
import java.util.Arrays;
public class Whiletest1 {
	public static void main(String args[])
	{
//		int hap = 0, count = 1;
//		while ( count <= 10)
//		{
//			hap = hap + count ;
//			count = count + 1 ;
//		}
//		System.out.println("1부터 10까지의 합은 "+hap+"입니다.");
		
//		Scanner stdin = new Scanner(System.in);
//		System.out.println("원하는 단을 입력하세요 :");
//		int dan = stdin.nextInt();
//		int x = 1;
//		while ( x <= dan )
//		{
//			System.out.println(dan + "*" + x + "=" + dan*x);
//			x++;
//		}
		
//		int hap = 0, count = 1;
//		do 
//		{
//			hap = hap + count;
//			count = count + 1;
//		} while (count <= 10);
//		System.out.println("1부터 10까지의 합은 "+hap+" 입니다.");
		
//		Scanner stdin = new Scanner(System.in);
//		int month;
//		do {
//			System.out.println("월을 입력하세요(끝:0) : ");
//			month = stdin.nextInt();
//			if( 3 <= month && month <= 5)
//				System.out.println("봄 입니다.");
//			else if (6 <= month && month <=8)
//				System.out.println("여름 입니다.");
//			else if (9 <= month && month <=11)
//				System.out.println("가을 입니다.");
//			else if ( 1== month || month == 2 || month ==12)
//				System.out.println("겨울 입니다.");
//			else if (month != 0)
//				System.out.println("잘못된 입력 : 해당되는 계절이 없습니다");
//		} while (month !=0);
//		System.out.println("감사합니다.");
		
//		int i, sum=0;
//		for (i=1 ; i <= 10 ; i++)
//		{
//			sum = sum + i;
//		}
//		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
		
//		System.out.println("정수 입력 :");
//		int num = stdin.nextInt();
//		System.out.println(num + "의 약수 :");
//		for (int i = 1 ; i <= num ; i++)
//		{
//			if ( num % i ==0)
//				System.out.println(i+ "");
//		}
//		int i = 10;
//		while ( i <= 20)
//		{
//			System.out.println("***" + i + "단***");
//			for ( int j = 1 ; j<= i ; j++)
//			{
//				System.out.println((i+ "*" + j + "=" + i*j));
//			}
//			System.out.println(); 
//			i++;
//		}
//		Scanner stdin = new Scanner(System.in);
//		System.out.println("원하는 숫자를 입력하세요.");
//		int num = stdin.nextInt();
//		int i = 1;
//		while ( i <= num )
//		{
//			int j = 1;
//			while ( j <= i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//				i++;
//		}
//		Scanner stdin = new Scanner(System.in);
//		System.out.println("합계를 원하는 정수 입력 :");
//		int num = stdin.nextInt();
//		int sum = 0, i = 1;
//		while(true) {
//			sum = sum + i;
//			if ( i == num) break;
//			i++;
//		}
//		System.out.println(num + "까지의 합계는 =" + sum);
//		int i, j;
//		for(i=1 ; i<10 ; i ++)
//		{
//			for (j = 1 ; i < 10 ; i++)
//			{
//				for (j=1 ; j <1 ; j ++)
//				{
//					if(j > 6) break;
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
//	}
////}
////
//Scanner stdin = new Scanner(System.in);
//System.out.println("원하는 정수 입력(짝수의 합):");
//int num = stdin.nextInt();
//int i, sum=0;
//for (i=1 ; i<=num ; i++) {
//	if(i % 2 ==1) continue;
//	sum = sum + i;
//}
//System.out.println("1부터" + num + "까지 짝수의 합=" + sum);
		
//		Scanner stdin = new Scanner(System.in);
//		int i;
//		double sum=0.0, avg;
//		double dnum[] = new double[5];
//		System.out.println("dnum 배열의 길이 :" +dnum.length);
//		System.out.print("초기화 하지 않은 dnum[]의 값 :");
//		for ( i=0 ; i < dnum.length ; i++)
//			System.out.print(dnum[i] + "");
//		System.out.println();
//		
//		for (i=0; i<dnum.length ; i++) {
//			System.out.print("dnum["+i+"]번째 데이터 입력 : ");
//			dnum[i] = stdin.nextDouble();
//		}
//		for (i=0; i< dnum.length ; i++)
//			sum = sum + dnum [i] ;
//		System.out.println("배열의 합은" + sum + "입니다.");
//		avg = sum/dnum.length;
//		System.out.println("배열 값의 평균은" +avg+"입니다");
//		
//		int score [] = {88,97,53,62,92,68,82};
//		int max = score [0];
//		for (int i : score)
//		{
//			if(i > max)
//				max = i;
//		}
//		System.out.println("배열 요소의 최대값은 " + max + "입니다");
//		int inum [] = {8,7,3,6,9,6,8,7,0,4,1,2};
//		Scanner stdin = new Scanner (System.in);
//		System.out.println("찾고 싶은 숫자 입력 : ");
//		int key = stdin.nextInt();
//		int count = 0;
//		for ( int i = 0 ; i < inum.length ; i++)
//		{
//			if ( inum[i] ==key) {
//				count ++;
//				System.out.println((i+1) + "번째 데이터와 일치");
//			}
//		}
//		if ( count ==0 )
//			System.out.println(key + "값은 배열에 없습니다.");
//		else
//			System.out.println(key + "값은 배열에 "+count+" 개 있습니다.");
		
//		int num1 [] = {10,20,30};
//		int num2 [] = {40,50,60};
//		num2 = num1;
//		num2[2] = 200;
//		
//		System.out.print("\nnum1 배열의 값 : ");
//		for  (int i : num1)
//			System.out.print(i+ "");
//		System.out.print("\nnum2 배열의 값 : ");
//		for (int i : num2)
//			System.out.print(i+"");
//		int num3[] = {100,200,300};
//		int num4[] = {400,500,600};
//		for ( int i = 0 ; i < num3.length ; i ++)
//			num4[i] = num3[i];
//		num4[2]=999;
//		System.out.print("\nnum3 배열의 값 : ");
//		for (int i : num3)
//			System.out.print(i+"");
//		System.out.print("\nnum4 배열의 값 :");
//		for(int i : num4)
//			System.out.print(i+"");
		
//		String slist [] = { "seoul", "daejeon", "daegu", "kwangju", "inchon", "jeju", "busan" };
//		System.out.print("원래의 배열 : ");
//		for (String s : slist)
//			System.out.print(s + " ");
//		System.out.println();
//		for ( int i = 0 ; i < slist.length / 2 ; i ++)
//		{
//			String temp = slist [i];
//			slist [ i ] = slist[ slist.length - i - 1];
//			slist [ slist.length - i- 1] = temp;
//			
//		}
//		System.out.print("역순으로 재배치된 배열 :");
//		for ( String s : slist )
//		System.out.print(s + " ");
//		Random ran = new Random();
//		int [][] score = new int[4][4];
//		for (int i=0 ; i<4; i++)
//			for (int j=0 ; j < 4 ; j++)
//				score [i][j] = ran.nextInt(10);
//		
//		for (int k=0 ; k < 4 ; k++) {
//			int sum=0;
//			for ( int value : score[k]) {
//				System.out.print(value + " ");
//				sum = sum + value;
//			}
//			System.out.println("의 합계는 "+sum);
//		}
//		{
//			int twoD[][] = new int [4][];
//			twoD[0] = new int [1];
//			twoD[1] = new int [2];
//			twoD[2] = new int [3];
//			twoD[3] = new int [4];
//			
//			System.out.println("2차원 배열에서 행의 길이는 : "+twoD.length);
//			System.out.println("첫 번째 행의 요소 수는 : "+twoD[0].length);
//			System.out.println("두 번째 행의 요소 수는 : "+twoD[1].length);
//			System.out.println("세 번째 행의 요소 수는 : "+twoD[2].length);
//			System.out.println("네 번째 행의 요소 수는 : "+twoD[3].length);
//			int i, j, k=0;
//			for (i = 0 ; i < twoD.length ; i++)
//				for (j = 0 ; j < twoD[i].length ; j ++)
//				{
//					twoD[i][j] = k;
//					k++;
//				}
//			for(i=0 ; i < twoD.length ; i++)
//			{
//				for ( int val : twoD[i])
//					System.out.print(val + " ");
//				System.out.println();
//			}
//		}
		
		
			int[] int1 = {9,1,7,3,5,4,6,2,8,0};
			System.out.println("초기배열 :" + Arrays.toString(int1));
			Arrays.fill(int1,3,5,33);
			System.out.println("fill() 수행 후 : " +Arrays.toString(int1));
			Arrays.sort(int1);
			System.out.println("sort()수행 후 : " + Arrays.toString(int1));
			System.out.println("33은 배열의" + Arrays.binarySearch(int1, 33) + "번째 요소");
			int [] int2 = {5,4,3,2,1};
			System.out.println("두 번째 배열 : " +Arrays.toString(int2));
			System.out.println("두 개의 배열이 같은가 ?" + Arrays.equals(int1,int2));
			int[] int3 = new int [5];
			System.arraycopy(int2,0,int3,0,5);
			System.out.println("복사된 배열 :" + Arrays.toString(int3));
		}
	}



