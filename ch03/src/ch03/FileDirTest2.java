package ch03;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileDirTest2 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("불러올 파일명 고고");
		String s = sc.next();
		FileInputStream fis = new FileInputStream(s);
		int i; 
		while ( (i =fis.read()) !=-1) {
			System.out.print(i + " ");
		}
		fis.close();
		System.out.println(s + " 파일을 전부 다 읽었지롱");
		
		
		//		Scanner sc = new Scanner(System.in);
//		System.out.println("출파입");
//		String s = sc.next();
//		FileOutputStream fos = new FileOutputStream(s);
//		for( int i = 1 ; i < 260 ; i ++) {
//			fos.write(i);
//		}
//		fos.close();
//		System.out.println(s + "파일명으로 바이트 파일을 생성");

	}

}
