package ch03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharEx1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String source = " 비어 있어야 빌옷오 갇윽해진은살앙 \n 영어니 \n 사랑해 ";
		System.out.println(" 젖앙할 파일명을 입력해주소 : ");
		String in = sc.next();
		FileWriter fw = new FileWriter(in);
		fw.write(source);
		fw.close();
		System.out.println( in + " 파이리 생성 되어쑵니다. ");

	}

}
